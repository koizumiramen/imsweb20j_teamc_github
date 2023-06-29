<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bean.Inquiry"%>

<%
	Inquiry inquiry_data = (Inquiry) session.getAttribute("inquiry_data");
	String subject_data = (String) session.getAttribute("subject_data");
	String reply_data = (String) session.getAttribute("reply_data");

	if (inquiry_data == null) {
		inquiry_data = new Inquiry();
		inquiry_data.setName("");
		inquiry_data.setGender("");
		inquiry_data.setAddress("");
		inquiry_data.setCategory("");
		inquiry_data.setContents("");
		inquiry_data.setDate("");
	}

	if (subject_data == null) {
		subject_data = "";
	}

	if (reply_data == null) {
		reply_data = "";
	}
	StringBuilder sb = new StringBuilder();
	String strDate = inquiry_data.getDate();
%>

<html>
<head>
<title>お問い合わせ管理システム「Ose-t」</title>

<style>
button.adminConfirm {
	display: inline-block;
	outline: 0;
	appearance: none;
	padding: 0px 12px;
	border-radius: 4px;
	text-decoration: none;
	cursor: pointer;
	background-color: rgb(249, 251, 250);
	border: 1px solid rgb(137, 151, 155);
	box-shadow: rgb(6 22 33/ 30%) 0px 1px 2px;
	color: rgb(61, 79, 88);
	font-size: 14px;
	font-weight: 400;
	height: 36px;
	transition: all 150ms ease-in-out 0s;
}

button.adminConfirm:hover {
	background-color: #FFEE77;
	border: 1px solid rgb(93, 108, 116);
	box-shadow: rgb(0 0 0/ 30%) 0px 4px 4px, rgb(231, 238, 236) 0px 0px 0px
		3px;
}
</style>

</head>
<body>

	<!-- ヘッダー部分 -->
	<div header>
		<%@include file="/common/adminHeader.jsp"%>
	</div>
	<!-- 内容確認 -->

	<div>
		<h3 style="text-align: center; font-size: 24px">お問い合わせ内容</h3>
		<table style="margin: auto">
			<tr>
				<td width="150"
					style="text-align: center; background-color: #80bd9e">日付</td>
				<td width="450"><%=sb.append(strDate.substring(0, 4) + "年" + strDate.substring(5, 7) + "月" + strDate.substring(8, 10)
					+ "日　" + strDate.substring(11, 16))%></td>
			</tr>
			<tr>
				<td width="150"
					style="text-align: center; background-color: #80bd9e">名前</td>
				<td width="450"><%=inquiry_data.getName()%></td>
			</tr>
			<tr>
				<td width="150"
					style="text-align: center; background-color: #80bd9e">年齢</td>
				<td width="450"><%=inquiry_data.getAge()%>歳</td>
			</tr>
			<tr>
				<td width="150"
					style="text-align: center; background-color: #80bd9e">性別</td>
				<td width="450"><%=inquiry_data.getGender()%></td>
			</tr>
			<tr>
				<td width="150"
					style="text-align: center; background-color: #80bd9e">住所</td>
				<td width="450"><%=inquiry_data.getAddress()%></td>
			</tr>
			<tr>
				<td width="150"
					style="text-align: center; background-color: #80bd9e">お問い合わせ項目</td>
				<td width="450"><%=inquiry_data.getCategory()%></td>
			</tr>
			<tr>
				<td style="text-align: center; background-color: #80bd9e"
					width="150">お問い合わせ内容</td>
				<td width="450" style="word-break: break-all"><%=inquiry_data.getContents()%></td>
			</tr>
		</table>

		<form action="<%=request.getContextPath()%>/replyConfirm" method="get">
			<h3 style="text-align: center; margin-top: 50px">返信メッセージ</h3>
			<table style="margin: auto; border: 0;">
				<tr>
					<td style="text-align: center">件名</td>
				</tr>
				<tr>
					<td><input type=text size="75" name="subject"
						value=<%=subject_data%>></input></td>
				</tr>
				<tr>
					<td style="text-align: center">本文</td>
				</tr>
				<tr>
					<td><textarea rows="5" cols="75" name="reply"><%=reply_data%></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<p style="text-align: center;">
							<button type="submit" name="confirmation" class="adminConfirm">確認する</button>
						</p>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<!-- フッター部分 -->
	<div footer>
		<%@include file="/common/adminFooter.jsp"%>
	</div>
</body>
</html>