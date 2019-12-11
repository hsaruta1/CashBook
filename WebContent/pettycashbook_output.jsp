<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="pac1.PaymentRecordBean"
    import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お小遣い帳 Beans - 入力画面 JSP</title>
</head>
<body>
<jsp:useBean id="pettyCashbookBean" class="pac1.PettyCashbookBean" scope="session" />
<h1>お小遣い帳 Beans - 入力画面 JSP</h1>
貯金履歴の一覧表示

<table border="1">
<tr><th>履歴</th><th>貯金額</th><th>コメント</th></tr>
<%
ArrayList<PaymentRecordBean> payRecordArray = pettyCashbookBean.getPaymentHistoryArray();
int count = 0;
for(PaymentRecordBean prd : payRecordArray) {
	count++;
	out.println("<tr><td>" + count+"回目" + "</td><td>" + prd.getPayment()+"円" + "</td><td>"
    + prd.getComment() + "</td></tr>");
}
%>
</table>

<br>
<p>合計金額:
<jsp:getProperty name="pettyCashbookBean" property="totalPayment" />
円
<br>
<br>
<a href="pettycashbook_input.html">さらに入金する</a><br>
</body>
</html>