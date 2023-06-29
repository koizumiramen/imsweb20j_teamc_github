<%@page contentType="text/html; charset=UTF-8"%>
<html>

<head>
<style>
body {
	margin: 0;
	padding: 0;
}

footer {
	font-family: 游ゴシック, 游ゴシック体;
	background: rgba(4, 192, 31, 0.3);
	height: 90px;
}

/* ボタン全体 */
#page_top {
	display: inline-block;
	outline: 0;
	text-align: center;
	cursor: pointer;
	padding: 10px 0;
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
	text-decoration: none;
	height: 20px;
	width: 100px;
	padding-bottom: 5px;
	padding-top: 10px;
	margin-top: 10px;
	margin-bottom: 5px;
}

/* Font Awesome */
#page_top::before {
	position: fixed;
	margin-left: 20px;
}

#page_top:hover {
	background: #e8e8e8;
	color: #3d3d3d;
}
</style>
</head>

<body>

	<footer>
		<div class="container" style="text-align: center">

			<a href="#" id="page_top">ページトップ</a> <br>© 2023
			KandaEnglishSchool. All Right Reserved.
		</div>
	</footer>
</body>
</html>