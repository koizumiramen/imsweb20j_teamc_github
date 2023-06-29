<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bean.Inquiry"%>

<%
	Inquiry inquiry_data = (Inquiry) session.getAttribute("inquiryC_data");
%>

<html>
<head>
<title>お問い合わせ管理システム「Ose-t」</title>

<style>
button.shuusei {
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

button.shuusei:hover {
	color: #fff;
	background-color: #ff420e;
}
</style>

<style>
button.soushinn {
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

button.soushinn:hover {
	color: #fff;
	background-color: #6666FF;
}

div.privacy-policy {
	font-size: 11px;
	max-width: 500px;
	margin-bottom: 50px;
	height: 100px;
	overflow: scroll;
	padding: 25px;
	border: 1px solid black;
	background-color: #e5e5e5;
	line-height: 1.5;
	&
	__item{
		p{
		margin-bottom
		:
		25px;
		}

	}
}
ul.progressbar {
	margin: 0;
	padding: 0;
	counter-reset: step;
	z-index: 0;
	position: relative;
}

ul.progressbar li {
	list-style-type: none;
	width: 25%;
	float: left;
	font-size: 12px;
	position: relative;
	text-align: center;
	text-transform: uppercase;
	color: #aaa;
}

ul.progressbar li:before {
	width: 30px;
	height: 30px;
	content: counter(step);
	counter-increment: step;
	line-height: 30px;
	display: block;
	text-align: center;
	margin: 0 auto 10px auto;
	border-radius: 50%;
	background-color: #eee;
}

ul.progressbar li:after {
	width: 100%;
	height: 2px;
	content: '';
	position: absolute;
	background-color: #eee;
	top: 15px;
	left: -50%;
	z-index: -1;
}

ul.progressbar li:first-child:after {
	content: none;
}

ul.progressbar li.active {
	color: #6599FF;
}

ul.progressbar li.active:before {
	background-color: #6599FF;
	color: #fff;
}

ul.progressbar li.active+li:after {
	background-color: #6599FF;
}
</style>

</head>
<body>
	<div class=container>
		<!-- ヘッダー -->
		<div header>
			<%@include file="/common/header.jsp"%>
		</div>

		<!-- 内容内容確認 -->

		<div style="margin-left: 265px;">
		<ul class="progressbar" >

			<li class="active">step1<br>入力
			</li>
			<li class="active">step2<br>確認/送信
			</li>
			<li>step3<br>完了
			</li>

		</ul>
	</div><br><br><br>

		<h3 style="text-align: center; margin-top:50px; font-size: 24px;">お問い合わせ内容確認</h3>
		<table style="margin: auto; border: 0; text-align: center">
			<tr>
				<td
					style="background-color: #6599FF; text-align: center"><font
					color="black">名前</font></td>
				<td style="text-align: left; width =450; word-break: break-all"><%=inquiry_data.getName()%></td>
			</tr>
			<tr>
				<td
					style="background-color: #6599FF; text-align: center"><font
					color="black">年齢</font></td>
				<td style="text-align: left"><%=inquiry_data.getAge()%></td>
			</tr>
			<tr>
				<td
					style="background-color: #6599FF; text-align: center"><font
					color="black">住所</font></td>
				<td style="text-align: left; width =450; word-break: break-all"><%=inquiry_data.getAddress()%></td>
			</tr>
			<tr>
				<td
					style="background-color: #6599FF; text-align: center"><font
					color="black">性別</font></td>
				<td style="text-align: left"><%=inquiry_data.getGender()%></td>
			</tr>
			<tr>
				<td
					style="background-color: #6599FF; text-align: center"><font
					color="black">メールアドレス</font></td>
				<td style="text-align: left; width =450; word-break: break-all"><%=inquiry_data.getEmail()%></td>
			</tr>
			<tr>
				<td
					style="background-color: #6599FF; text-align: center"><font
					color="black">お問い合わせ項目</font></td>
				<td style="text-align: left"><%=inquiry_data.getCategory()%></td>
			</tr>
			<tr>
				<td
					style="background-color: #6599FF; text-align: center"><font
					color="black">お問い合わせ内容</font></td>
				<td width="450" style="word-break: break-all">
					<div contents
						style="padding: 30px; margin-bottom: 10px; border: 1px solid #333333;">
						<%=inquiry_data.getContents()%>
					</div>
				</td>
			</tr>
		</table>

		<!-- 送信・修正 -->
		<div style="text-align: center">
			<br>上記の内容で送信してもよろしいですか？<br>
			<p style="font-size:11px;margin-top: 0px;">＊送信に多少時間がかかる場合がございます。 </p><br>
			<div style="display: inline-flex">
				<form action="<%=request.getContextPath()%>/view/inquiryForm.jsp"
					class="change-button">
					<button type="submit" class="shuusei">修正</button>
				</form>

				<form action="<%=request.getContextPath()%>/inquiryInsert"
					class="send-button">
					<button type="submit" class="soushinn">送信</button>
				</form>
			</div>
		</div>
	</div>
	<!-- フッター -->
	<div footer>
		<%@include file="/common/footer.jsp"%>
	</div>
</body>
</html>