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
	background-color: rgba(70, 155, 240, 0.1);
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
%>
</head>
<body>
	<header>
		<table style="margin: auto; width: 100%;">
			<tr>
				<td align="left" style="width: 25%"><div class="logo">
						<img style="margin-left: 20px;" height="70px" align="top"
							src="Ose-tLOGO.png" alt="Ose-t"><span class="remark">＜<%=message%></span>
					</div></td>

				<td align="center"
					style="width: 50%; text-align: center; font-size: 30px; font-weight: bold;">神田英会話スクール
					<div style="font-size: 20px; font-weight: normal;">お問い合わせ</div>
				</td>

				<td align="right" style="width: 25%;">
					<form action="<%=request.getContextPath()%>/view/menu.jsp"
						class="send-button">
						<button type="submit" class="top" style="margin-right: 20px">トップ</button>
					</form>
			</tr>
		</table>


	</header>
</body>
</html>