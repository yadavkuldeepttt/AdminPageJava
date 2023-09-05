<%@page import="com.files.entities.AdminDao2"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.files.entities.Admin"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
table{
text-align:center;

}
a{
  text-decoration: none;
  color:black;
}
a:hover{
color:red;}

</style>
</head>
<body>
<jsp:include page="Header.jsp"/>
<%

 List<Admin> admlist = (ArrayList<Admin>)  session.getAttribute("admlist");

%>
   <table width="100%" border="4" >
     <tr>
         <th>Admin Id</th>
         <th>Name</th>
         <th>Age</th>
         <th>Phone</th>
         <th>Password</th>
         
     </tr>
    
    <% 
    if(admlist!=null)
    {
       for(Admin ad:admlist)
       {
    
    	
    %>	   
    	 <tr>
    	    <td><%=ad.getId() %> </td>
    	    <td><%=ad.getName() %> </td>
    	    <td><%=ad.getAge() %> </td>
    	    <td><%=ad.getPhone() %> </td>
    	    <td><%=ad.getPassword() %> </td>
    	    
    	 
    	 
    	 </tr>
    	   
      <%  }
    }
    else{
    	%>
    	<h1>Data not found</h1>
    	<% 
    }
    %>
   
   </table>
   <% 
      AdminDao2 adm =  new AdminDao2();
      int n=  adm.countRecords();
       int total=5;
       int pages = n/total;
       int records= pages*total;
       if(n>records) pages++;
       
       for(int i=1;i<=pages;i++)
       {
    	   if(i==pages)
    	   {
    	%>
    		<a href="AdminDao3?action=View All&page=<%=i%>">Page <%=i %></a>   
    	<%
    	   }
    	else
    	   {
    		%>
    		<a href="AdminDao3?action=View All&page=<%=i%>">Page <%=i %></a> ||   
    		
    		
    	<% 
          }
       
       }
   %>

<a href="AdminDao3"></a>

</body>
</html>