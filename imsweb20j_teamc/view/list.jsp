<%@page contentType="text/html; charset=UTF-8"%>
<%@page
	import="java.util.ArrayList,bean.Inquiry,java.text.SimpleDateFormat,java.time.LocalDateTime,java.time.format.DateTimeFormatter"%>

<%
	ArrayList<Inquiry> inquiry_list = (ArrayList<Inquiry>) request.getAttribute("inquiry_list");

	String sortString = (String) request.getAttribute("sortString");

	String message = "";
	int todayNo = 0;
	LocalDateTime ldt = LocalDateTime.now();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	String todayStr = ldt.format(dtf);

	for (Inquiry inquiries : inquiry_list) {
		StringBuilder sb = new StringBuilder();
		String strDate = inquiries.getDate();
		if (todayStr.substring(0, 4).equals(strDate.substring(0, 4))
				&& todayStr.substring(5, 7).equals(strDate.substring(5, 7))
				&& todayStr.substring(8, 10).equals(strDate.substring(8, 10))) {
			todayNo++;
		}
	}
	message = "本日のお問い合わせ件数は" + todayNo + "件です。";

	request.setAttribute("message", message);

	int replyNo = 0;
	for(Inquiry inquiries : inquiry_list){
		if(inquiries.getStatus() == 1){
			replyNo++;
		}
	}

	//返信率
	double r = 100*replyNo/inquiry_list.size();
	int replyPer = (int)r;
%>

<html>
<head>
<title>お問い合わせ管理システム「Ose-t」</title>

<style>
tr.list:hover td {
	background: #e6e6e6;
	cursor: pointer;
}

div.nButton {
	cursor: pointer;
	outline: 0;
	color: #FFFFFF;
	background-color: #FF8866;
	border-color: #FF8866;
	display: inline-block;
	font-weight: 400;
	line-height: 1.5;
	text-align: center;
	border: 1px solid transparent;
	padding: 6px 12px;
	font-size: 12px;
	border-radius: .25rem;
	transition: color .15s ease-in-out, background-color .15s ease-in-out,
		border-color .15s ease-in-out, box-shadow .15s ease-in-out; : hover {
	color : #fff;
	background-color: #FF8866;
	border-color: #FF8866;
}
}

</style>

<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
　jQuery(function($) {

	  //data-hrefの属性を持つtrを選択しclassにlistを付加
	  $('tr[data-href]').addClass('list')

	    //クリックイベント
	    .click(function(e) {

	      //e.targetはクリックした要素自体、それがa要素以外であれば
	      if(!$(e.target).is('a')){

	        //その要素の先祖要素で一番近いtrの
	        //data-href属性の値に書かれているURLに遷移する
	        window.location = $(e.target).closest('tr').data('href');}
	  });
	})
</script>

</head>
<body>

	<!-- ヘッダー部分 -->
	<div header>
		<jsp:include page="/common/adminHeader.jsp"></jsp:include>
	</div>


	<div style="margin-bottom: 150px">

		<table style="margin: auto" ; width="90%";>
			<tr>
				<td style="width: 1100px">&nbsp;</td>
				<td>
					<form method="POST" name="date"
						action="<%=request.getContextPath()%>/list">
						<input type=hidden name=sort value=date>
					</form>
					<form method="POST" name="category"
						action="<%=request.getContextPath()%>/list">
						<input type=hidden name=sort value=category>
					</form>
					<form method="POST" name="status"
						action="<%=request.getContextPath()%>/list">
						<input type=hidden name=sort value=status>
					</form> <select name="select" onChange="location.href=value;">
						<option value="#"><%=sortString%></option>
						<option value="javascript:document.date.submit()">受信日時</option>
						<option value="javascript:document.category.submit()">項目</option>
						<option value="javascript:document.status.submit()">返信状況</option>
				</select>
				</td>
			</tr>
		</table>

		<table style="margin: auto" ; width="90%" ; table-layout="fixed;"
			cellpadding="9">
			<tr>
				<th style="background-color: #80bd9e; width: 200px">受信日時</th>
				<th style="background-color: #80bd9e; width: 100px">名前</th>
				<th style="background-color: #80bd9e; width: 220px">項目</th>
				<th style="background-color: #80bd9e; width: 370px">内容</th>
				<th style="background-color: #80bd9e; width: 90px">返信状況</th>

			</tr>
			<%
				if (inquiry_list != null) {
					for (Inquiry inquiries : inquiry_list) {
						StringBuilder sb = new StringBuilder();
						String strDate = inquiries.getDate();
			%>
			<tr class="list"
				data-href="<%=request.getContextPath()%>/inquiryReplyForm?inquiry_id=<%=inquiries.getInquiry_id()%>">


				<td style="text-align: center;"><%=sb.append(strDate.substring(0, 4) + "年" + strDate.substring(5, 7) + "月"
							+ strDate.substring(8, 10) + "日　" + strDate.substring(11, 16))%></td>
				<td style="text-align: center;">
					<%
						if (inquiries.getName().length() <= 6) {
					%> <%=inquiries.getName()%> <%
 	} else {
 %> <%=inquiries.getName().substring(0, 6)%>... <%
 	}
 %>
				</td>
				<td style="text-align: center;"><%=inquiries.getCategory()%></td>


				<td style="text-align: center;">
					<%
						if (inquiries.getContents().length() <= 20) {
					%> <%=inquiries.getContents()%> <%
 	} else {
 %> <%=inquiries.getContents().substring(0, 20)%>... <%
 	}
 %>
				</td>

				<%
					if (inquiries.getStatus() == 0) {
				%>
				<td style="text-align: center;"><div class="nButton">
						<strong>未返信</strong>
					</div> <%
 	} else {
 %>
<style>
div.oButton {
	cursor: pointer;
	outline: 0;
	color: #e6e2cf;
	background-color: #FF9977;
	border-color: #FF8866;
	display: inline-block;
	font-weight: 400;
	line-height: 1.5;
	text-align: center;
	border: 1px solid transparent;
	padding: 6px 12px;
	font-size: 12px;
	border-radius: .25rem;
	transition: color .15s ease-in-out, background-color .15s ease-in-out,
		border-color .15s ease-in-out, box-shadow .15s ease-in-out; : hover {
	color : #e6e2cf;
	background-color: #FF9977;
	border-color: #FF9977;
}
</style>
				<td style="text-align: center;"><div class="oButton">返信済み</div></td>
				<%
					}
				%>
			</tr>
			<%
				}
				} else {
			%>
			<tr>
				<td style="text-align: center;">&nbsp;</td>
				<td style="text-align: center;">&nbsp;</td>
				<td style="text-align: center;">&nbsp;</td>
				<td style="text-align: center;">&nbsp;</td>
				<td style="text-align: center;">&nbsp;</td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
	<!-- フッター部分 -->
	<div footer>
		<%@include file="/common/adminFooter.jsp"%>
	</div>
</body>
</html>