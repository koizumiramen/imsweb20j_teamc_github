<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bean.Inquiry"%>

<%
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
%>

<html>
<head>
<title>お問い合わせ管理システム</title>

<style>
button.confirm {
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

button.confirm:hover {
	background-color: #FFEE77;
	border: 1px solid rgb(93, 108, 116);
	box-shadow: rgb(0 0 0/ 30%) 0px 4px 4px, rgb(231, 238, 236) 0px 0px 0px
		3px;
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

	<!-- ヘッダー部分 -->
	<%@ include file="/common/header.jsp"%>

	<!-- 内容確認 -->

	<div style="margin-left: 265px;">
		<ul class="progressbar" >

			<li class="active">step1<br>入力
			</li>
			<li class="">step2<br>確認/送信
			</li>
			<li>step3<br>完了
			</li>

		</ul>
	</div>

	<br>
	<br>
	<br>

	<h2 style="text-align: center; font-size: 24px; margin-top: 50px;">お問い合わせフォーム</h2>

	<%
		if (cmd.equals("yet")) {
	%>
	<h3 style="text-align: center; color: red"><%=inputError%></h3>
	<%
		}
	%>

	<p style="text-align: center">神田英会話スクールに関するお問い合わせ</p>
	<p style="text-align: center">
		こちらのフォームよりお問い合わせいただき、内容等を記入後<br>
		個人情報の取り扱いに関する事項をご確認の上「同意して確認する」ボタンを押してください。
	</p>

	<!-- ユーザー個人情報入力 -->
	<form action="<%=request.getContextPath()%>/inquiryForm" method="get">
		<table style="margin: auto; border: 0; width: 30% margin: auto">
			<tr>
				<td style="text-align: left;"><font color="#444">お名前</font></td>
			</tr>
			<tr>
				<td><input placeholder="例:神田 太郎" type=text size="60"
					name="name" value=<%=inquiry_data.getName()%>></input></td>
			</tr>
			<tr>
				<td style="text-align: left"><font color="#444">年齢</font></td>
			</tr>
			<tr>
				<%
					if (inquiry_data.getAge() != 0) {
				%>
				<td><input type=text size="60" name="age"
					value=<%=inquiry_data.getAge()%>></input></td>
				<%
					} else {
				%>
				<td><input placeholder="半角数字" type=text size="60" name="age"></input></td>
				<%
					}
				%>
			</tr>
			<tr>
				<td style="text-align: left"><font color="#444">住所</font></td>
			</tr>
			<tr>
				<td><input placeholder="例:東京都千代田区〇〇町1-2-3" type=text size=60
					" name="address" value=<%=inquiry_data.getAddress()%>></input></td>
			</tr>
			<tr>
				<td style="text-align: left"><font color="#444">性別</font></td>
			</tr>
			<tr>
				<%
					if (inquiry_data.getGender().equals("女性")) {
				%>
				<td><font color="#444">男性</font><input type="radio"
					name="gender" value="0"> <font color="#444">女性</font><input
					type="radio" name="gender" value="1" checked></td>
				<%
					} else {
				%>
				<td><font color="#444">男性</font><input type="radio"
					name="gender" value="0" checked> <font color="#444">女性</font><input
					type="radio" name="gender" value="1"></td>
				<%
					}
				%>
			</tr>
			<tr>
				<td style="text-align: left"><font color="#444">メールアドレス</font></td>
			</tr>
			<tr>
				<td><input placeholder="例：kanda@taro1234.com" type=text
					size="60" name="email" value=<%=inquiry_data.getEmail()%>></input></td>
			</tr>
			<tr>
				<td style="height: 30px">&nbsp;</td>
			</tr>
		</table>

		<!-- お問い合わせ内容入力 -->
		<hr
			style="text-align: center; height: 1px; background-color: gray; width: 40%">

		<table style="margin: auto; border: 0; width: 30%">
			<tr>
				<td style="height: 30px">&nbsp;</td>
			</tr>
			<tr>
				<td style="text-align: left"><font color="#444">お問い合わせ項目</font></td>
			</tr>
			<tr>
				<td><select name="category">
						<option selected><%=inquiry_data.getCategory()%></option>
						<option value="1">料金・お支払いについて</option>
						<option value="2">講座、コース、教材について</option>
						<option value="3">学習の進め方について</option>
						<option value="4">受講期限について</option>
						<option value="5">受講終了後のサポートについて</option>
						<option value="6">その他</option>
				</select></td>
			</tr>
			<tr>
				<td style="text-align: left"><font color="#444">お問い合わせ内容</font></td>
			</tr>
			<tr>
				<td><textarea name="contents" rows="5" cols="62"><%=inquiry_data.getContents()%></textarea></td>
			</tr>
			<tr>
				<td style="height: 50px">&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2">
					<p style="text-align: left">個人情報のお取り扱いについて</p>
				</td>
			<tr>
				<td>

					<div class="privacy-policy">
						<div class="privacy-policy__item">
							<p class="privacy-policy__item__title">第1条（個人情報）</p>
							<p class="privacy-policy__item__desc">「個人情報」とは，個人情報保護法にいう「個人情報」を指すものとし，生存する個人に関する情報であって，当該情報に含まれる氏名，生年月日，住所，電話番号，連絡先その他の記述等により特定の個人を識別できる情報及び容貌，指紋，声紋にかかるデータ，及び健康保険証の保険者番号などの当該情報単体から特定の個人を識別できる情報（個人識別情報）を指します。</p>
						</div>
						<div class="privacy-policy__item">
							<p class="privacy-policy__item__title">第1条（個人情報）</p>
							<p class="privacy-policy__item__desc">「個人情報」とは，個人情報保護法にいう「個人情報」を指すものとし，生存する個人に関する情報であって，当該情報に含まれる氏名，生年月日，住所，電話番号，連絡先その他の記述等により特定の個人を識別できる情報及び容貌，指紋，声紋にかかるデータ，及び健康保険証の保険者番号などの当該情報単体から特定の個人を識別できる情報（個人識別情報）を指します。</p>
						</div>
						<div class="privacy-policy__item">
							<p class="privacy-policy__item__title">第1条（個人情報）</p>
							<p class="privacy-policy__item__desc">「個人情報」とは，個人情報保護法にいう「個人情報」を指すものとし，生存する個人に関する情報であって，当該情報に含まれる氏名，生年月日，住所，電話番号，連絡先その他の記述等により特定の個人を識別できる情報及び容貌，指紋，声紋にかかるデータ，及び健康保険証の保険者番号などの当該情報単体から特定の個人を識別できる情報（個人識別情報）を指します。</p>
						</div>
						<div class="privacy-policy__item">
							<p class="privacy-policy__item__title">第1条（個人情報）</p>
							<p class="privacy-policy__item__desc">「個人情報」とは，個人情報保護法にいう「個人情報」を指すものとし，生存する個人に関する情報であって，当該情報に含まれる氏名，生年月日，住所，電話番号，連絡先その他の記述等により特定の個人を識別できる情報及び容貌，指紋，声紋にかかるデータ，及び健康保険証の保険者番号などの当該情報単体から特定の個人を識別できる情報（個人識別情報）を指します。</p>
						</div>
						<div class="privacy-policy__item">
							<p class="privacy-policy__item__title">第1条（個人情報）</p>
							<p class="privacy-policy__item__desc">「個人情報」とは，個人情報保護法にいう「個人情報」を指すものとし，生存する個人に関する情報であって，当該情報に含まれる氏名，生年月日，住所，電話番号，連絡先その他の記述等により特定の個人を識別できる情報及び容貌，指紋，声紋にかかるデータ，及び健康保険証の保険者番号などの当該情報単体から特定の個人を識別できる情報（個人識別情報）を指します。</p>
						</div>
					</div>
				</td>
			</tr>

		</table>
		<p style="text-align: center">個人情報のお取り扱いについて、同意される方は「同意して確認画面へ進む」を押してください</p>

		<p style="text-align: center">
			<button type="submit" name="confirmation" class="confirm">同意して確認する</button>
		</p>

	</form>

	<!-- フッダー部分 -->
	<%@ include file="/common/footer.jsp"%>

</body>
</html>