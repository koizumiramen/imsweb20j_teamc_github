<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bean.Inquiry"%>

<%
	Inquiry inquiry_data = (Inquiry) session.getAttribute("inquiry_data");
	String subject_data = (String) session.getAttribute("subject_data");
	String reply_data = (String) session.getAttribute("reply_data");

	StringBuilder sb = new StringBuilder();
	String strDate = inquiry_data.getDate();
%>

<html>
<head>
<title>お問い合わせ管理システム「Ose-t」</title>

<style>
button.hover {
	display: inline-block;
	outline: none;
	cursor: pointer;
	font-size: 14px;
	line-height: 1;
	border-radius: 500px;
	transition-property: background-color, border-color, color, box-shadow,
		filter;
	transition-duration: .3s;
	border: 1px solid transparent;
	letter-spacing: 2px;
	min-width: 160px;
	text-transform: uppercase;
	white-space: normal;
	font-weight: 700;
	text-align: center;
	padding: 16px 14px 18px;
	color: #616467;
	box-shadow: inset 0 0 0 2px #616467;
	background-color: transparent;
	height: 48px;
}

button.hover:hover {
	color: #fff;
	background-color: #ff420e;
}
</style>


<style>
button.send_hover {
	display: inline-block;
	outline: none;
	cursor: pointer;
	font-size: 14px;
	line-height: 1;
	border-radius: 500px;
	transition-property: background-color, border-color, color, box-shadow,
		filter;
	transition-duration: .3s;
	border: 1px solid transparent;
	letter-spacing: 2px;
	min-width: 160px;
	text-transform: uppercase;
	white-space: normal;
	font-weight: 700;
	text-align: center;
	padding: 16px 14px 18px;
	color: #616467;
	box-shadow: inset 0 0 0 2px #616467;
	background-color: transparent;
	height: 48px;
}

button.send_hover:hover {
	color: #fff;
	background-color: #80bd9e;
}
</style>

</head>
<body>
	<!-- ヘッダー部分 -->
	<div header>
		<%@include file="/common/adminHeader.jsp"%>
	</div>

	<h3 style="text-align: center; font-size: 24px;">お問い合わせ内容</h3>
	<!-- お問い合わせ内容部分 -->
	<table style="margin: auto; border: 0;">
		<tr>
			<td width="150" style="text-align: center; background-color: #80bd9e">日付</td>
			<td width="450"><%=sb.append(strDate.substring(0, 4) + "年" + strDate.substring(5, 7) + "月" + strDate.substring(8, 10)
					+ "日　" + strDate.substring(11, 16))%></td>
		</tr>
		<tr>
			<td width="150" style="text-align: center; background-color: #80bd9e">名前</td>
			<td width="450"><%=inquiry_data.getName()%></td>
		</tr>
		<tr>
			<td width="150" style="text-align: center; background-color: #80bd9e">年齢</td>
			<td width="450"><%=inquiry_data.getAge()%>歳</td>
		</tr>
		<tr>
			<td width="150" style="text-align: center; background-color: #80bd9e">性別</td>
			<td width="450"><%=inquiry_data.getGender()%></td>
		</tr>
		<tr>
			<td width="150" style="text-align: center; background-color: #80bd9e">住所</td>
			<td width="450"><%=inquiry_data.getAddress()%></td>
		</tr>
		<tr>
			<td width="150" style="text-align: center; background-color: #80bd9e">お問い合わせ項目</td>
			<td width="450"><%=inquiry_data.getCategory()%></td>
		</tr>
		<tr>
			<td style="text-align: center; background-color: #80bd9e" width="150">お問い合わせ内容</td>
			<td width="450" style="word-break: break-all"><%=inquiry_data.getContents()%></td>
		</tr>
	</table>
	<!--  入力内容確認 -->
	<h3 style="text-align: center; margin-top: 100px">記入内容</h3>

	<div>
		<table style="margin: auto; border: 0;">
			<tr>
				<td style="text-align: center" width="150">件名：</td>
				<td width="450" style="word-break: break-all"><%=subject_data%></td>
			</tr>
			<tr>
				<td style="text-align: center" width="150">本文：</td>
				<td width="450" style="word-break: break-all"><%=reply_data%></td>
			</tr>
		</table>
	</div>

	<div align="middle">

		<%
			if (subject_data.equals("") && reply_data.equals("")) {
		%>
		<p style="color: red">内容が未入力ですが送信してよろしいですか？</p>
		<%
			} else if (subject_data.equals("")) {
		%>
		<p style="color: red">件名が未入力ですが送信してよろしいですか？</p>
		<%
			} else if (reply_data.equals("")) {
		%>
		<p style="color: red">本文が未入力ですが送信してよろしいですか？</p>
		<%
			} else {
		%>
		<p>上記の内容で送信してよろしいですか？</p>
		<%
			}
		%>

		<div style="display: inline-flex">

			<form
				action="<%=request.getContextPath()%>/view/inquiryReplyForm.jsp"
				class="change-button">

				<button type="submit" class="hover">修正</button>
			</form>

			<form action="<%=request.getContextPath()%>/sendMail"
				class="send-button">

				<button type="submit" class="send_hover">送信</button>
			</form>

		</div>
	</div>
	<!-- フッター部分 -->
	<div footer>
		<%@include file="/common/adminFooter.jsp"%>
	</div>
</body>
</html>