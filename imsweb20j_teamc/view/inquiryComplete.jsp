<%@page contentType="text/html; charset=UTF-8"%>

<html>
<head>
<title>お問い合わせ管理システム「Ose-t」</title>

<style>
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

		<!-- ヘッダー部分 -->
		<div header>
			<%@include file="/common/header.jsp"%>
		</div>

		<!-- 問い合わせ完了メッセージ -->

		<div style="margin-left: 265px;">
		<ul class="progressbar" >

			<li class="active">step1<br>入力
			</li>
			<li class="active">step2<br>確認/送信
			</li>
			<li class="active">step3<br>完了
			</li>

		</ul>
	</div><br><br><br><br><br>

		<div style="text-align: center; font-size: 20px;">
			<img height="100px" src="post.png" alt="post">
			<h2>お問い合わせを送信しました。</h2>
			<br> ＊ご登録のメールアドレス宛に、担当者からご連絡いたします。
		</div>

		<!-- フッター部分 -->
		<div footer style="margin-top: 44px;">
			<%@include file="/common/footer.jsp"%>
		</div>
	</div>

</body>
</html>