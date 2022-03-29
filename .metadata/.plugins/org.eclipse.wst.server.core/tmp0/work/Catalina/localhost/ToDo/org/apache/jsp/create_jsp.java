/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.77
 * Generated at: 2022-03-29 06:40:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<title>ToDoList작성</title>\n");
      out.write("\n");
      out.write("html{\n");
      out.write("	height: 100%;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("	margin: 0;\n");
      out.write("	padding: 0;\n");
      out.write("	height: 100%;\n");
      out.write("}\n");
      out.write(".signIn__wrap{\n");
      out.write("	width: 100%;\n");
      out.write("	height: 100%;\n");
      out.write("	display:flex;\n");
      out.write("	justify-content: center;\n");
      out.write("	align-items: center;\n");
      out.write("	background-color: #DADEFD\n");
      out.write("}\n");
      out.write(".signIn__content{\n");
      out.write("	width: 280px;\n");
      out.write("	height: 400px;\n");
      out.write("	padding: 30px;\n");
      out.write("	background-color: white;\n");
      out.write("	border-radius: 16px;\n");
      out.write("}\n");
      out.write(".signIn__title{\n");
      out.write("	margin: 12px 0 16px;\n");
      out.write("}\n");
      out.write(".signIn__description{\n");
      out.write("	color: #555;\n");
      out.write("	margin: 0 0 24px;\n");
      out.write("}\n");
      out.write(".signIn__subTitle{\n");
      out.write("	font-size: 14px;\n");
      out.write("	font-weight: bold;\n");
      out.write("	margin: 4px 0;\n");
      out.write("}\n");
      out.write(".signIn__liner{\n");
      out.write("	margin-bottom: 16px;\n");
      out.write("}\n");
      out.write(".signIn__input{\n");
      out.write("	width: 280px;\n");
      out.write("	height: 40px;\n");
      out.write("	box-sizing: border-box;\n");
      out.write("	border-radius: 32px;\n");
      out.write("	border: 1px solid #aaa;\n");
      out.write("	padding: 8px 16px;\n");
      out.write("	line-height: 24px;\n");
      out.write("}\n");
      out.write(".signIn__submit{\n");
      out.write("	width: 280px;\n");
      out.write("	background-color:royalblue;\n");
      out.write("	color: white;\n");
      out.write("	height: 44px;\n");
      out.write("	margin: 24px 0;\n");
      out.write("	border-radius: 32px;\n");
      out.write("	cursor: pointer;\n");
      out.write("}\n");
      out.write(".signIn__info{\n");
      out.write("	margin: 0;\n");
      out.write("	font-size: 14px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"signIn__wrap\">\n");
      out.write("<div class=\"signIn_content\">\n");
      out.write("<h1 class=\"signIn__title\">ToDoList</h1>\n");
      out.write("<p class=\"signIn__description\">해야할 일을 입력해주세요!</p>\n");
      out.write("	<form action=\"create_list.do\" method=\"get\">\n");
      out.write("			<div class=\"signIn_liner\">\n");
      out.write("		해야할일 <input type=\"text\" name=\"content\" size=\"30\">\n");
      out.write("			</div>\n");
      out.write("		<div class=\"signIn_liner\">\n");
      out.write("		중요! <input type=\"checkbox\" name=\"isImportant\" value = \"1\">\n");
      out.write("		</div>\n");
      out.write("			마감일\n");
      out.write("			<input type=\"date\" name=\"finishDate\">\n");
      out.write("	\n");
      out.write("			<input type=\"submit\" value=\"확인\">\n");
      out.write("		</form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("	\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
}
