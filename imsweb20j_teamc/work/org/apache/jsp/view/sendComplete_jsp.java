/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2023-06-28 06:13:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sendComplete_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/common/adminFooter.jsp", Long.valueOf(1687914400188L));
    _jspx_dependants.put("/common/adminHeader.jsp", Long.valueOf(1687914390006L));
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

      out.write("<!---->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>お問い合わせ管理システム「Ose-t」</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- ヘッダー部分 -->\r\n");
      out.write("\t<div header>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header {\r\n");
      out.write("\tfont-family: 游ゴシック, 游ゴシック体;\r\n");
      out.write("\tbackground: rgba(4, 192, 31, 0.2);\r\n");
      out.write("\tmargin-bottom: 50px;\r\n");
      out.write("\theight: 90px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button.top {\r\n");
      out.write("\tfont-family: 游ゴシック, 游ゴシック体;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\toutline: 0;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\theight: 34px;\r\n");
      out.write("\tpadding: 0 13px;\r\n");
      out.write("\tvertical-align: top;\r\n");
      out.write("\tborder-radius: 3px;\r\n");
      out.write("\tborder: 1px solid transparent;\r\n");
      out.write("\ttransition: all .3s ease;\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tborder-color: #e8e8e8;\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\tfont-weight: 600;\r\n");
      out.write("\ttext-transform: uppercase;\r\n");
      out.write("\tline-height: 16px;\r\n");
      out.write("\tfont-size: 11px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button.top:hover {\r\n");
      out.write("\tbackground: #e8e8e8;\r\n");
      out.write("\tcolor: #3d3d3d;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo span.remark {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo:hover span.remark {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tline-height: 1.2em;\r\n");
      out.write("\tmargin: 0.5em;\r\n");
      out.write("\tpadding: 0.5em;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 0px;\r\n");
      out.write("\tleft: 80px;\r\n");
      out.write("\twidth: 12em;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");

	String message = (String) request.getAttribute("message");

	if (message == null) {
		message = "目指せ海外進出！";
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\r\n");
      out.write("\t\t<table class=\"head\" style=\"margin: auto; width: 100%\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" style=\"width: 30%\">\r\n");
      out.write("\t\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t<img style=\"margin-left: 20px;\" height=\"70px\" align=\"top\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"Ose-tLOGOadmin.png\" alt=\"Ose-t\"><span class=\"remark\">＜");
      out.print(message);
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td align=\"center\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 40%; text-align: center; font-size: 30px; font-weight: bold;\">神田英会話スクール\r\n");
      out.write("\t\t\t\t\t<div style=\"font-size: 20px; font-weight: normal;\">お問い合わせ管理</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td align=\"right\" valign=\"middle\" style=\"width: 20%\"><form\r\n");
      out.write("\t\t\t\t\t\taction=\"");
      out.print(request.getContextPath());
      out.write("/view/menu.jsp\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"send-button\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"top\" style=\"margin-right: 20px\">トップ</button>\r\n");
      out.write("\t\t\t\t\t</form></td>\r\n");
      out.write("\t\t\t\t<td align=\"left\" valign=\"middle\" style=\"width: 10%\">\r\n");
      out.write("\t\t\t\t\t<form name=f method=POST\r\n");
      out.write("\t\t\t\t\t\taction=\"");
      out.print(request.getContextPath());
      out.write("/list\" class=\"send-button\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"top\" style=\"margin-right: 20px\">一覧</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<div style=\"margin-top: 80px;\">\r\n");
      out.write("\t\t\t<img height=\"100px\" src=\"hikouki.png\" alt=\"hikouki\">\r\n");
      out.write("\t\t\t<h2>送信しました。</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- フッター部分 -->\r\n");
      out.write("\t<div footer style=\"margin-top: 233px;\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer {\r\n");
      out.write("\tfont-family: 游ゴシック, 游ゴシック体;\r\n");
      out.write("\tbackground: rgba(4, 192, 31, 0.3);\r\n");
      out.write("\theight: 90px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* ボタン全体 */\r\n");
      out.write("#page_top {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\toutline: 0;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tpadding: 10px 0;\r\n");
      out.write("\tvertical-align: top;\r\n");
      out.write("\tborder-radius: 3px;\r\n");
      out.write("\tborder: 1px solid transparent;\r\n");
      out.write("\ttransition: all .3s ease;\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tborder-color: #e8e8e8;\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\tfont-weight: 600;\r\n");
      out.write("\ttext-transform: uppercase;\r\n");
      out.write("\tline-height: 16px;\r\n");
      out.write("\tfont-size: 11px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\tpadding-bottom: 5px;\r\n");
      out.write("\tpadding-top: 10px;\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("\tmargin-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Font Awesome */\r\n");
      out.write("#page_top::before {\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\tmargin-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#page_top:hover {\r\n");
      out.write("\tbackground: #e8e8e8;\r\n");
      out.write("\tcolor: #3d3d3d;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<div class=\"container\" style=\"text-align: center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a href=\"#\" id=\"page_top\">ページトップ</a> <br>© 2023\r\n");
      out.write("\t\t\tKandaEnglishSchool. All Right Reserved.\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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