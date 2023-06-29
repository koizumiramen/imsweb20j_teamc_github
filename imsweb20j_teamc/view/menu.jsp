<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bean.Admin"%>

<%
	session.invalidate();
	String adminId = ""; //adminIdを格納する変数
	String password = ""; //passwordを格納する変数
	String error = (String) request.getAttribute("error");
	String cmd = (String) request.getAttribute("cmd");

	if (cmd == null) {
		cmd = "";
	}
%>

<html>
<head>
<title>ログイン画面</title>

<style>
button.otoiawase-button {
	outline: 0;
	grid-gap: 8px;
	align-items: center;
	background: 0 0;
	border: 1px solid #000;
	border-radius: 4px;
	cursor: pointer;
	display: inline-flex;
	flex-shrink: 0;
	font-size: 16px;
	gap: 8px;
	justify-content: center;
	line-height: 1.5;
	overflow: hidden;
	padding: 12px 16px;
	text-decoration: none;
	text-overflow: ellipsis;
	transition: all .14s ease-out;
	white-space: nowrap;
}

button.otoiawase-button:hover {
	box-shadow: 4px 4px 0 #000;
	transform: translate(-4px, -4px);
}

button.otoiawase-button:focus-visible {
	outline-offset: 1px;
}

button.loginbutton {
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

button.loginbutton:hover {
	color: rgb(61, 79, 88);
	background-color: rgb(255, 255, 255);
	border: 1px solid rgb(93, 108, 116);
	box-shadow: rgb(0 0 0/ 30%) 0px 4px 4px, rgb(231, 238, 236) 0px 0px 0px
		3px;
}
</style>

</head>
<body>

	<!-- ヘッダー部分 -->
	<%@ include file="/common/header.jsp"%>

	<table style="margin-left: 250px;">

		<tr>
			<td rowspan="2"><img width="450px" height="450px"
				style="object-fit: cover" src="top.png" alt="Sorry No Image"></td>

			<td>
				<p
					style="text-align: left; font-size: 50px; margin-bottom: 0px; margin-left: 10px;">
					<strong> さあ、<br>英会話を始めよう。
					</strong>
				</p> <br>
				<p
					style="text-align: left; font-size: 30px; margin-top: 0px; margin-bottom: 0px; margin-left: 10px;">無料相談受付中</p>
				<br>
				<div style="text-align: right; margin-right: 300px">
					<form action="<%=request.getContextPath()%>/view/inquiryForm.jsp"
						style="margin-left: 10px">
						<button type="submit" style="margin-right: 20px"
							class="otoiawase-button">お問い合わせはこちら</button>
					</form>
				</div>
			</td>
		</tr>
	</table>
	<div>

		<!-- 管理者ログイン -->
		<form action="<%=request.getContextPath()%>/login" method="post">
			<table style="margin: auto; border: 0; width: 100%">

				<tr>
					<td width="40%">
						<hr
							style="text-align: right; height: 1px; background-color: gray;">
					</td>
					<td style="text-align: center; width: 120px">
						<p>管理者の方はログイン</p>

					</td>
					<td width="40%">
						<hr style="text-align: left; height: 1px; background-color: gray;">
					</td>
				</tr>
			</table>


			<table style="margin: auto; border: 0"F>


				<tr>
					<!-- エラーメッセージ表示 -->
					<%
						if (cmd.equals("login")) {
					%>
					<h3 style="text-align: center; color: red">※ログインIDもしくはパスワードが違います※</h3>
					<%
						}
					%>
					<td style="text-align: left"><font color="#444">ログインID</font></td>
				</tr>
				<tr>
					<td><input type=text size="60" name="adminId"
						value=<%=adminId%>></input></td>
				</tr>
				<tr>
					<td style="text-align: left"><font color="#444">パスワード</font></td>
				</tr>
				<tr>
					<td><input type=password size="60" name="password"
						value=<%=password%>></input></td>
				</tr>
				<tr>
					<td colspan="2">
						<p style="text-align: center">
							<button type="submit" name="login" class="loginbutton">ログイン</button>
						</p>
					</td>
				</tr>
			</table>
		</form>
	</div>

	<!-- フッター部分 -->
	<%@ include file="/common/footer.jsp"%>

</body>
</html>