package com.board.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.mvc.command.BoardCommand;
import com.board.mvc.command.BoardContentsCommand;
import com.board.mvc.command.BoardDeleteCommand;
import com.board.mvc.command.BoardListCommand;
import com.board.mvc.command.BoardModifyCommand;
import com.board.mvc.command.BoardReplyCommand;
import com.board.mvc.command.BoardReplyViewCommand;
import com.board.mvc.command.BoardWriteCommand;

@Controller
public class BoardController {
	BoardCommand boardCommand;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");
		
		boardCommand = new BoardListCommand();
		boardCommand.execute(model);
		
		return "/list";
	}
	
	@RequestMapping("/write_view")
	public String writeView(Model model) {
		System.out.println("writeView()");
		
		return "/write_view";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/write")
	public String write(HttpServletRequest httpServerletRequest, Model model) {
		System.out.println("write()");
		
		model.addAttribute("httpServerletRequest", httpServerletRequest);
		
		boardCommand = new BoardWriteCommand();
		boardCommand.execute(model);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/contents_view")
	public String contentsView(HttpServletRequest httpServletRequest, Model model) {
		System.out.println("contentsView()");
		
		model.addAttribute("httpServletRequest", httpServletRequest);
		
		boardCommand = new BoardContentsCommand();
		boardCommand.execute(model);
		
		return "contents_view";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/modify")
	public String modify(HttpServletRequest httpServletRequest, Model model) {
		System.out.println("modify()");
		
		model.addAttribute("httpServletRequest", httpServletRequest);
		
		boardCommand = new BoardModifyCommand();
		boardCommand.execute(model);
		
		return "redirect:/list"; 
	}
	
	@RequestMapping("/reply_view")
	public String replyView(HttpServletRequest httpServletRequest, Model model) {
		System.out.println("replyView()");
		
		model.addAttribute("httpServletRequest", httpServletRequest);
		
		boardCommand = new BoardReplyViewCommand();
		boardCommand.execute(model);
		
		return "reply_view";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/reply")
	public String reply(HttpServletRequest httpServletRequest, Model model) {
		System.out.println("reply()");
		
		model.addAttribute("httpServletRequest", httpServletRequest);
		
		boardCommand = new BoardReplyCommand();
		boardCommand.execute(model);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest httpServletRequest, Model model) {
		System.out.println("delete()");
		
		model.addAttribute("httpServletRequest", httpServletRequest);
		
		boardCommand = new BoardDeleteCommand();
		boardCommand.execute(model);
		
		return "redirect:/list";
	}
}