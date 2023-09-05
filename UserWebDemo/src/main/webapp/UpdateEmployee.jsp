<%@page import="com.files.entities.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
form{

text-align:center;

}

</style>
</head>
<body>
<jsp:include page="Header.jsp"/>

<br><br><br>
<%
   Admin adm =(Admin) session.getAttribute("admin");
%>
<form action="AdminDao3" method="get">

<h2>User Id: <%=adm.getId() %></h2>

 <input type="hidden" name="userid" value="<%=adm.getId() %>"/> <br><br>

Name: <input type="text" name="username" value="<%=adm.getName() %>"/> <br><br>
Age: <input type="number" name="userage" value="<%=adm.getAge() %>"/> <br><br>
Phone: <input type="text" name="userphone" value="<%=adm.getPhone() %>"/> <br><br>
Password: <input type="text" name="password" value="<%=adm.getPassword() %>"/> <br><br>
<input type="submit" name="action" value="Update Record" /> 
</form>

</body>
</html>