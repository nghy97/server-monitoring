package com.monitoring.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.monitoring.dto.ServerInformationDto;
import com.monitoring.mapper.Mapper;

@Controller
public class IndexController {
	@Autowired
	private SqlSession sqlSession;

	@RequestMapping("/")
	public String getServerlist(Model model) {
		Mapper mapper = sqlSession.getMapper(Mapper.class);
		ArrayList<ServerInformationDto> arrayListServerInformation = new ArrayList<ServerInformationDto>();

		for (int i = 0; i < mapper.selectServerInformationList().size(); i++) {
			arrayListServerInformation.add(mapper.selectServerInformationList().get(i));
		}

		model.addAttribute("arrayListServerInformation", arrayListServerInformation);
		return "/jsp/index";
	}

	@RequestMapping("/detail")
	@ResponseBody
	public String detail(Model model) {
		Mapper mapper = sqlSession.getMapper(Mapper.class);
		ArrayList<ServerInformationDto> arrayListServerInformation = new ArrayList<ServerInformationDto>();
		ArrayList<HashMap<String, String>> arrayListHashMap = new ArrayList<HashMap<String, String>>();
		
		for (int i = 0; i < mapper.selectServerInformationList().size(); i++) {
			arrayListServerInformation.add(mapper.selectServerInformationList().get(i));

			if (arrayListServerInformation.get(i).getStatus().equals("warning")) {
				HashMap<String, String> hashMap = new HashMap<String, String>();
				hashMap.put("id", arrayListServerInformation.get(i).getId());
				hashMap.put("status", "warning");

				arrayListHashMap.add(hashMap);
			} else if (arrayListServerInformation.get(i).getStatus().equals("danger")) {
				HashMap<String, String> hashMap = new HashMap<String, String>();
				hashMap.put("id", arrayListServerInformation.get(i).getId());
				hashMap.put("status", "danger");

				arrayListHashMap.add(hashMap);
			} else {
				HashMap<String, String> hashMap = new HashMap<String, String>();
				hashMap.put("id", arrayListServerInformation.get(i).getId());
				hashMap.put("status", "normal");

				arrayListHashMap.add(hashMap);
			}
		}
		return JSONArray.toJSONString(arrayListHashMap);
	}
}
