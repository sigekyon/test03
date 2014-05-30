<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
    import="java.util.*"
    import="sample.dao.*"
%>
<%!
ArrayList<UsrInfo> data;
UsrInfo u;
int i;
char line;
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ユーザー管理</title>
</head>
<style type="text/css">
table{
border-collapse: collapse;
}
tr.header{
background-color: lightskyblue;
font-weight: bold;
}
tr.a{
background-color: whitesmoke;
}
tr.b{
background-color: snow;
}
td{
	border: solid 1px;
	padding: 5px;
}
</style>
<body>
<table>
<tr class="header">
<td>社員番号</td>
<td>姓</td>
<td>名</td>
<td>アカウント</td>
<td>パスワード</td>
</tr>
<%
if((data = (ArrayList<UsrInfo>) request.getAttribute("AllUsr")) != null){
	for(i = 1; i < data.size(); i++){
		u = data.get(i);
		if(i%2 == 0){
			line='a';
		}
		else{
			line='b';
		}
		
		
%>
		<tr class="<%=line%>"><td><%=u.getEmpNum()%></td>
		<td><%=u.getLastName()%></td>
		<td><%=u.getFirstName()%></td>
		<td><%=u.getAccount()%></td>
		<td><%=u.getPassword()%></td></tr>
<%
	}
}
%>
</table><br>
全<%=data.size()-1%>件読込完了。
</body>
</html>