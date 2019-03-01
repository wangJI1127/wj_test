package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<html lang=\"en\" class=\"no-js\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>用户登录</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("<!-- CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("assets/css/reset.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("assets/css/supersized.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("assets/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"page-container\">\r\n");
      out.write("\t\t<h1>登录</h1>\r\n");
      out.write("\t\t<form action=\"/ssm_maven/user/login\" method=\"post\">\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"username\" name=\"username\" class=\"username\"\r\n");
      out.write("\t\t\t\tplaceholder=\"请输入用户名\" pattern=\"[A-Za-z0-9]{5,15}\" required=\"required\">\r\n");
      out.write("\t\t\t<input type=\"password\" id=\"password\" name=\"password\" class=\"password\"\r\n");
      out.write("\t\t\t\tpattern=\"[A-Za-z0-9]{6,12}\" required=\"required\" placeholder=\"请输入密码\">\r\n");
      out.write("\t\t\t<button type=\"submit\">登录</button>\r\n");
      out.write("\t\t\t<div id=\"login-error\" style=\"color: #F00\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.message}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Javascript -->\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("assets/js/jquery-1.8.2.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("assets/js/supersized.3.2.7.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("assets/js/supersized-init.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("assets/js/scripts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
