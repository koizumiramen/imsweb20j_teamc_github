/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.32
 * Generated at: 2023-06-29 00:26:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.Inquiry;

public final class inquiryForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/common/header.jsp", Long.valueOf(1687935668304L));
    _jspx_dependants.put("/common/footer.jsp", Long.valueOf(1687914375762L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("bean.Inquiry");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Inquiry inquiry_data = (Inquiry) session.getAttribute("inquiryC_data");

	if (inquiry_data == null) {
		inquiry_data = new Inquiry();
		inquiry_data.setName("");
		inquiry_data.setGender("");
		inquiry_data.setEmail("");
		inquiry_data.setAddress("");
		inquiry_data.setCategory("");
		inquiry_data.setContents("");
		inquiry_data.setDate("");
	}

	String cmd = (String) request.getAttribute("cmd");

	if (cmd == null) {
		cmd = "";
	}

	String inputError = (String) request.getAttribute("inputError");

	if (inputError == null) {
		inputError = "";
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>お問い合わせ管理システム</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("button.confirm {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\toutline: 0;\r\n");
      out.write("\tappearance: none;\r\n");
      out.write("\tpadding: 0px 12px;\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tbackground-color: rgb(249, 251, 250);\r\n");
      out.write("\tborder: 1px solid rgb(137, 151, 155);\r\n");
      out.write("\tbox-shadow: rgb(6 22 33/ 30%) 0px 1px 2px;\r\n");
      out.write("\tcolor: rgb(61, 79, 88);\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tfont-weight: 400;\r\n");
      out.write("\theight: 36px;\r\n");
      out.write("\ttransition: all 150ms ease-in-out 0s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button.confirm:hover {\r\n");
      out.write("\tbackground-color: #FFEE77;\r\n");
      out.write("\tborder: 1px solid rgb(93, 108, 116);\r\n");
      out.write("\tbox-shadow: rgb(0 0 0/ 30%) 0px 4px 4px, rgb(231, 238, 236) 0px 0px 0px\r\n");
      out.write("\t\t3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.privacy-policy {\r\n");
      out.write("\tfont-size: 11px;\r\n");
      out.write("\tmax-width: 500px;\r\n");
      out.write("\tmargin-bottom: 50px;\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\toverflow: scroll;\r\n");
      out.write("\tpadding: 25px;\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\tbackground-color: #e5e5e5;\r\n");
      out.write("\tline-height: 1.5;\r\n");
      out.write("\t&\r\n");
      out.write("\t__item{\r\n");
      out.write("\t\tp{\r\n");
      out.write("\t\tmargin-bottom\r\n");
      out.write("\t\t:\r\n");
      out.write("\t\t25px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("ul.progressbar {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tcounter-reset: step;\r\n");
      out.write("\tz-index: 0;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul.progressbar li {\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("\twidth: 25%;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\ttext-transform: uppercase;\r\n");
      out.write("\tcolor: #aaa;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul.progressbar li:before {\r\n");
      out.write("\twidth: 30px;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tcontent: counter(step);\r\n");
      out.write("\tcounter-increment: step;\r\n");
      out.write("\tline-height: 30px;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tmargin: 0 auto 10px auto;\r\n");
      out.write("\tborder-radius: 50%;\r\n");
      out.write("\tbackground-color: #eee;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul.progressbar li:after {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 2px;\r\n");
      out.write("\tcontent: '';\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tbackground-color: #eee;\r\n");
      out.write("\ttop: 15px;\r\n");
      out.write("\tleft: -50%;\r\n");
      out.write("\tz-index: -1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul.progressbar li:first-child:after {\r\n");
      out.write("\tcontent: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul.progressbar li.active {\r\n");
      out.write("\tcolor: #6599FF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul.progressbar li.active:before {\r\n");
      out.write("\tbackground-color: #6599FF;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul.progressbar li.active+li:after {\r\n");
      out.write("\tbackground-color: #6599FF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ヘッダー部分 -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header {\r\n");
      out.write("\tfont-family: 游ゴシック, 游ゴシック体;\r\n");
      out.write("\tbackground-color: rgba(70, 155, 240, 0.1);\r\n");
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

	String[] msg = new String[7];

	// 設定開始（メッセージの内容を設定してください）

	msg[0] = "今、この瞬間を幸せでいましょう";
	msg[1] = "あなたの欠点を愛してくれる人が本当の友達です";
	msg[2] = "何事も感謝の気持ちが大切です";
	msg[3] = "辛い時こそ心から笑おう";
	msg[4] = "みんなの思いやりがぶつかり合っただけ";
	msg[5] = "逆境が人に与えるものこそ美しい";
	msg[6] = "夢を見るのに、遅すぎるということは無い";

	// 設定終了

	int no = (int) (Math.floor(Math.random() * msg.length));

	String message = msg[no];

      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<table style=\"margin: auto; width: 100%;\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"left\" style=\"width: 25%\"><div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t<img style=\"margin-left: 20px;\" height=\"70px\" align=\"top\"\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"Ose-tLOGO.png\" alt=\"Ose-t\"><span class=\"remark\">＜");
      out.print(message);
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t</div></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td align=\"center\"\r\n");
      out.write("\t\t\t\t\tstyle=\"width: 50%; text-align: center; font-size: 30px; font-weight: bold;\">神田英会話スクール\r\n");
      out.write("\t\t\t\t\t<div style=\"font-size: 20px; font-weight: normal;\">お問い合わせ</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td align=\"right\" style=\"width: 25%;\">\r\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/view/menu.jsp\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"send-button\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"top\" style=\"margin-right: 20px\">トップ</button>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- 内容確認 -->\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"margin-left: 265px;\">\r\n");
      out.write("\t\t<ul class=\"progressbar\" >\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li class=\"active\">step1<br>入力\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"\">step2<br>確認/送信\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>step3<br>完了\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\t<h2 style=\"text-align: center; font-size: 24px; margin-top: 50px;\">お問い合わせフォーム</h2>\r\n");
      out.write("\r\n");
      out.write("\t");

		if (cmd.equals("yet")) {
	
      out.write("\r\n");
      out.write("\t<h3 style=\"text-align: center; color: red\">");
      out.print(inputError);
      out.write("</h3>\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<p style=\"text-align: center\">神田英会話スクールに関するお問い合わせ</p>\r\n");
      out.write("\t<p style=\"text-align: center\">\r\n");
      out.write("\t\tこちらのフォームよりお問い合わせいただき、内容等を記入後<br>\r\n");
      out.write("\t\t個人情報の取り扱いに関する事項をご確認の上「同意して確認する」ボタンを押してください。\r\n");
      out.write("\t</p>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ユーザー個人情報入力 -->\r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/inquiryForm\" method=\"get\">\r\n");
      out.write("\t\t<table style=\"margin: auto; border: 0; width: 30% margin: auto\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left;\"><font color=\"#444\">お名前</font></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input placeholder=\"例:神田 太郎\" type=text size=\"60\"\r\n");
      out.write("\t\t\t\t\tname=\"name\" value=");
      out.print(inquiry_data.getName());
      out.write("></input></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left\"><font color=\"#444\">年齢</font></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t");

					if (inquiry_data.getAge() != 0) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<td><input type=text size=\"60\" name=\"age\"\r\n");
      out.write("\t\t\t\t\tvalue=");
      out.print(inquiry_data.getAge());
      out.write("></input></td>\r\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t<td><input placeholder=\"半角数字\" type=text size=\"60\" name=\"age\"></input></td>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left\"><font color=\"#444\">住所</font></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input placeholder=\"例:東京都千代田区〇〇町1-2-3\" type=text size=60\r\n");
      out.write("\t\t\t\t\t\" name=\"address\" value=");
      out.print(inquiry_data.getAddress());
      out.write("></input></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left\"><font color=\"#444\">性別</font></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t");

					if (inquiry_data.getGender().equals("女性")) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<td><font color=\"#444\">男性</font><input type=\"radio\"\r\n");
      out.write("\t\t\t\t\tname=\"gender\" value=\"0\"> <font color=\"#444\">女性</font><input\r\n");
      out.write("\t\t\t\t\ttype=\"radio\" name=\"gender\" value=\"1\" checked></td>\r\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t<td><font color=\"#444\">男性</font><input type=\"radio\"\r\n");
      out.write("\t\t\t\t\tname=\"gender\" value=\"0\" checked> <font color=\"#444\">女性</font><input\r\n");
      out.write("\t\t\t\t\ttype=\"radio\" name=\"gender\" value=\"1\"></td>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left\"><font color=\"#444\">メールアドレス</font></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input placeholder=\"例：kanda@taro1234.com\" type=text\r\n");
      out.write("\t\t\t\t\tsize=\"60\" name=\"email\" value=");
      out.print(inquiry_data.getEmail());
      out.write("></input></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"height: 30px\">&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- お問い合わせ内容入力 -->\r\n");
      out.write("\t\t<hr\r\n");
      out.write("\t\t\tstyle=\"text-align: center; height: 1px; background-color: gray; width: 40%\">\r\n");
      out.write("\r\n");
      out.write("\t\t<table style=\"margin: auto; border: 0; width: 30%\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"height: 30px\">&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left\"><font color=\"#444\">お問い合わせ項目</font></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><select name=\"category\">\r\n");
      out.write("\t\t\t\t\t\t<option selected>");
      out.print(inquiry_data.getCategory());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">料金・お支払いについて</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">講座、コース、教材について</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">学習の進め方について</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"4\">受講期限について</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"5\">受講終了後のサポートについて</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"6\">その他</option>\r\n");
      out.write("\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"text-align: left\"><font color=\"#444\">お問い合わせ内容</font></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><textarea name=\"contents\" rows=\"5\" cols=\"62\">");
      out.print(inquiry_data.getContents());
      out.write("</textarea></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"height: 50px\">&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t<p style=\"text-align: left\">個人情報のお取り扱いについて</p>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"privacy-policy\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"privacy-policy__item\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"privacy-policy__item__title\">第1条（個人情報）</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"privacy-policy__item__desc\">「個人情報」とは，個人情報保護法にいう「個人情報」を指すものとし，生存する個人に関する情報であって，当該情報に含まれる氏名，生年月日，住所，電話番号，連絡先その他の記述等により特定の個人を識別できる情報及び容貌，指紋，声紋にかかるデータ，及び健康保険証の保険者番号などの当該情報単体から特定の個人を識別できる情報（個人識別情報）を指します。</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"privacy-policy__item\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"privacy-policy__item__title\">第1条（個人情報）</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"privacy-policy__item__desc\">「個人情報」とは，個人情報保護法にいう「個人情報」を指すものとし，生存する個人に関する情報であって，当該情報に含まれる氏名，生年月日，住所，電話番号，連絡先その他の記述等により特定の個人を識別できる情報及び容貌，指紋，声紋にかかるデータ，及び健康保険証の保険者番号などの当該情報単体から特定の個人を識別できる情報（個人識別情報）を指します。</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"privacy-policy__item\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"privacy-policy__item__title\">第1条（個人情報）</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"privacy-policy__item__desc\">「個人情報」とは，個人情報保護法にいう「個人情報」を指すものとし，生存する個人に関する情報であって，当該情報に含まれる氏名，生年月日，住所，電話番号，連絡先その他の記述等により特定の個人を識別できる情報及び容貌，指紋，声紋にかかるデータ，及び健康保険証の保険者番号などの当該情報単体から特定の個人を識別できる情報（個人識別情報）を指します。</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"privacy-policy__item\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"privacy-policy__item__title\">第1条（個人情報）</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"privacy-policy__item__desc\">「個人情報」とは，個人情報保護法にいう「個人情報」を指すものとし，生存する個人に関する情報であって，当該情報に含まれる氏名，生年月日，住所，電話番号，連絡先その他の記述等により特定の個人を識別できる情報及び容貌，指紋，声紋にかかるデータ，及び健康保険証の保険者番号などの当該情報単体から特定の個人を識別できる情報（個人識別情報）を指します。</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"privacy-policy__item\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"privacy-policy__item__title\">第1条（個人情報）</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"privacy-policy__item__desc\">「個人情報」とは，個人情報保護法にいう「個人情報」を指すものとし，生存する個人に関する情報であって，当該情報に含まれる氏名，生年月日，住所，電話番号，連絡先その他の記述等により特定の個人を識別できる情報及び容貌，指紋，声紋にかかるデータ，及び健康保険証の保険者番号などの当該情報単体から特定の個人を識別できる情報（個人識別情報）を指します。</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<p style=\"text-align: center\">個人情報のお取り扱いについて、同意される方は「同意して確認画面へ進む」を押してください</p>\r\n");
      out.write("\r\n");
      out.write("\t\t<p style=\"text-align: center\">\r\n");
      out.write("\t\t\t<button type=\"submit\" name=\"confirmation\" class=\"confirm\">同意して確認する</button>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t<!-- フッダー部分 -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer {\r\n");
      out.write("\tfont-family: 游ゴシック, 游ゴシック体;\r\n");
      out.write("\tbackground: rgba(70, 155, 240, 0.2);\r\n");
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
      out.write("\r\n");
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
