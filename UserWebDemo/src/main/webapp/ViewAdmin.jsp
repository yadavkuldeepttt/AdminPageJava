<%@page import="com.files.entities.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style >
body{



}



h2{
color:red}
</style>
</head>
<body>
<jsp:include page="Header.jsp"/>


    <h1 style="text-align:center">Admin Details</h1>
<% 
/* Admin adm =  (Admin) session.getAttribute("admin"); */
Admin adv =  (Admin) session.getAttribute("admin");

%>
<%--   <h2>Admin Id : <%=adm.getId() %></h2>
  <h2>Admin Name : <%=adm.getName() %></h2>
  <h2>Admin Age : <%=adm.getAge() %></h2>
  <h2>Admin Phone : <%=adm.getPhone() %></h2>
<hr>
  <h2>Admin Id : <%=adv.getId() %></h2>
  <h2>Admin Name : <%=adv.getName() %></h2>
  <h2>Admin Age : <%=adv.getAge() %></h2>
  <h2>Admin Phone : <%=adv.getPhone() %></h2>
 --%>

<%-- <% if (adm != null) { %>
  <h2>Admin Id : <%= adm.getId() %></h2>
  <h2>Admin Name : <%= adm.getName() %></h2>
  <h2>Admin Age : <%= adm.getAge() %></h2>
  <h2>Admin Phone : <%= adm.getPhone() %></h2>
  <hr>
<% } %> --%>


   <h2>User Id : <%= adv.getId() %></h2>
  <h2>User Name : <%= adv.getName() %></h2>
  <h2>User Age : <%= adv.getAge() %></h2>
  <h2>User Phone : <%= adv.getPhone() %></h2>



</body>
</html>