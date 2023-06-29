<%@page contentType="text/html; charset=UTF-8"%>
<html>

<head>
<style>
body {
	margin: 0;
	padding: 0;
}

header {
	font-family: 游ゴシック, 游ゴシック体;
	background: rgba(4, 192, 31, 0.2);
	margin-bottom: 50px;
	height: 90px;
}

button.top {
	font-family: 游ゴシック, 游ゴシック体;
	display: inline-block;
	outline: 0;
	text-align: center;
	cursor: pointer;
	height: 34px;
	padding: 0 13px;
	vertical-align: top;
	border-radius: 3px;
	border: 1px solid transparent;
	transition: all .3s ease;
	background: #fff;
	border-color: #e8e8e8;
	color: #000;
	font-weight: 600;
	text-transform: uppercase;
	line-height: 16px;
	font-size: 11px;
}

button.top:hover {
	background: #e8e8e8;
	color: #3d3d3d;
}

.logo {
	position: relative;
}

.logo span.remark {
	display: none;
}

.logo:hover span.remark {
	display: block;
	line-height: 1.2em;
	margin: 0.5em;
	padding: 0.5em;
	position: absolute;
	top: 0px;
	left: 80px;
	width: 12em;
}
</style>

<%
	String message = (String) request.getAttribute("message");

	if (message == null) {
		message = "目指せ海外進出！";
	}
%>

</head>
<body>

	<header>

		<table class="head" style="margin: auto; width: 100%">
			<tr>
				<td align="left" style="width: 30%">
					<div class="logo">
						<img style="margin-left: 20px;" height="70px" align="top"
							src="Ose-tLOGOadmin.png" alt="Ose-t"><span class="remark">＜<%=message%></span>
					</div>
				</td>

				<td align="center"
					style="width: 40%; text-align: center; font-size: 30px; font-weight: bold;">神田英会話スクール
					<div style="font-size: 20px; font-weight: normal;">お問い合わせ管理</div>
				</td>

				<td align="right" valign="middle" style="width: 20%"><form
						action="<%=request.getContextPath()%>/view/menu.jsp"
						class="send-button">
						<button type="submit" class="top" style="margin-right: 20px">トップ</button>
					</form></td>
				<td align="left" valign="middle" style="width: 10%">
					<form name=f method=POST
						action="<%=request.getContextPath()%>/list" class="send-button">
						<button type="submit" class="top" style="margin-right: 20px">一覧</button>

					</form>
				</td>
			</tr>
		</table>

	</header>
</body>
</html>