/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M20
 * Generated at: 2017-05-10 09:38:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/Users/donghyuk/Documents/dev/17-1/capstone/apache-tomcat-9.0.0.M20/wtpwebapps/spring-mvc/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1491877207000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\n");
      out.write("\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<title>index</title>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("h1 {\n");
      out.write("\ttext-align: center;\n");
      out.write("\tcolor: #5D5D5D;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".jumbotron {\n");
      out.write("\twidth: 800px;\n");
      out.write("\tmargin: auto;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t<div class=\"container-fluid\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"/\"><span\n");
      out.write("\t\t\t\tclass=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<h1>server list</h1>\n");
      out.write("\t<br />\n");
      out.write("\t<div class=\"jumbotron\">\n");
      out.write("\t\t<h4><div id=\"time\"></div></h4>\n");
      out.write("\t\t<br />\n");
      out.write("\t\t<table class=\"table table-hover table-striped table-bordered\"\n");
      out.write("\t\t\tstyle=\"width: 600px; margin: auto;\">\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t\t<tr style=\"background-color: white;\">\n");
      out.write("\t\t\t\t\t<th\n");
      out.write("\t\t\t\t\t\tstyle=\"text-align: center; vertical-align: middle; font-size: 2rem;\">server\n");
      out.write("\t\t\t\t\t\tid</th>\n");
      out.write("\t\t\t\t\t<th\n");
      out.write("\t\t\t\t\t\tstyle=\"text-align: center; vertical-align: middle; font-size: 2rem;\">host\n");
      out.write("\t\t\t\t\t\tname</th>\n");
      out.write("\t\t\t\t\t<th\n");
      out.write("\t\t\t\t\t\tstyle=\"text-align: center; vertical-align: middle; font-size: 2rem;\">ip\n");
      out.write("\t\t\t\t\t\taddress</th>\n");
      out.write("\t\t\t\t\t<th\n");
      out.write("\t\t\t\t\t\tstyle=\"text-align: center; vertical-align: middle; font-size: 2rem;\">os</th>\n");
      out.write("\t\t\t\t\t<th\n");
      out.write("\t\t\t\t\t\tstyle=\"text-align: center; vertical-align: middle; font-size: 2rem;\">status</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- <script>\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\tsetInterval(function() {\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\ttype: 'GET',\n");
      out.write("\t\t\t\t\turl: '/detail',\n");
      out.write("\t\t\t\t\tsuccess: function(res) {\n");
      out.write("\t\t\t\t\t\tconsole.log(res);\n");
      out.write("\t\t\t\t\t\tvar data = JSON.parse(res);\n");
      out.write("\t\t\t\t\t\t$('#time').text(data.time);\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tif (data.status === 'warning') {\n");
      out.write("\t\t\t\t\t\t\t$('#status').css({\n");
      out.write("\t\t\t\t\t\t\t\t\"border-radius\": \"50% 50%\",\n");
      out.write("\t\t\t\t\t\t\t\t\"-moz-border-radius\": \"50% 50%\",\n");
      out.write("\t\t\t\t\t\t\t\t\"-webkit-border-radius\": \"50% 50%\",\n");
      out.write("\t\t\t\t\t\t\t\t\"background\": \"#FFBB00\",\n");
      out.write("\t\t\t\t\t\t\t\t\"height\": \"20px\",\n");
      out.write("\t\t\t\t\t\t\t\t\"width\": \"20px\",\n");
      out.write("\t\t\t\t\t\t\t\t\"margin\": \"auto\"\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t} else if (data.status === 'danger') {\n");
      out.write("\t\t\t\t\t\t\t$('#status').css({\n");
      out.write("\t\t\t\t\t\t\t\t\"border-radius\": \"50% 50%\",\n");
      out.write("\t\t\t\t\t\t\t\t\"-moz-border-radius\": \"50% 50%\",\n");
      out.write("\t\t\t\t\t\t\t\t\"-webkit-border-radius\": \"50% 50%\",\n");
      out.write("\t\t\t\t\t\t\t\t\"background\": \"#FF0000\",\n");
      out.write("\t\t\t\t\t\t\t\t\"height\": \"20px\",\n");
      out.write("\t\t\t\t\t\t\t\t\"width\": \"20px\",\n");
      out.write("\t\t\t\t\t\t\t\t\"margin\": \"auto\"\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t$('#status').css({\n");
      out.write("\t\t\t\t\t\t\t\t\"border-radius\": \"50% 50%\",\n");
      out.write("\t\t\t\t\t\t\t\t\"-moz-border-radius\": \"50% 50%\",\n");
      out.write("\t\t\t\t\t\t\t\t\"-webkit-border-radius\": \"50% 50%\",\n");
      out.write("\t\t\t\t\t\t\t\t\"background\": \"#1DDB16\",\n");
      out.write("\t\t\t\t\t\t\t\t\"height\": \"20px\",\n");
      out.write("\t\t\t\t\t\t\t\t\"width\": \"20px\",\n");
      out.write("\t\t\t\t\t\t\t\t\"margin\": \"auto\"\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\terror: function(err) {\n");
      out.write("\t\t\t\t\t\tconsole.log('cannot receive status model.');\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}, 1000)\n");
      out.write("\t\t});\n");
      out.write("\t</script> -->\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/index.jsp(72,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("arrayListServerInformation");
      // /WEB-INF/views/index.jsp(72,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/index.jsp(72,4) '${ arrayListServerInformation }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${ arrayListServerInformation }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/index.jsp(72,4) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("status");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t\t<tr\n");
            out.write("\t\t\t\t\t\tonclick=\"location.href='/monitoring/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ arrayListServerInformation.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("'\"\n");
            out.write("\t\t\t\t\t\tstyle=\"cursor: pointer;\">\n");
            out.write("\t\t\t\t\t\t<td style=\"text-align: center;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ arrayListServerInformation.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t<td style=\"text-align: center;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ arrayListServerInformation.hostName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t<td style=\"text-align: center;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ arrayListServerInformation.ipAddress }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t<td style=\"text-align: center;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ arrayListServerInformation.osName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t<td><div id=\"status\"></div></td>\n");
            out.write("\t\t\t\t\t</tr>\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
