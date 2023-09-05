<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"/>

<br> <br> <br>
<%-- <%
   String action = request.getParameter("action");

   /* String val  = action.equals("view ")? "view record" : 
	   action.equals("delete ")?"Delete Record" :
		   action.equals("update")?"Update Record":
		   "viewAll"; 
		    */

		    
		    String val = ""; 

		    if (action != null) {
		        if (action.equals("view record")) {
		            val = "view record";
		        } else if (action.equals("Delete Record")) {
		            val = "Delete Record";
		        } else if (action.equals("Update")) {
		            val = "Update Record"; // Use "Update Record" instead of "Update"
		        }
		    }
%>
 --%> 
<!-- <form action="AdminDao3" method="get" style="text-align:center">
Enter Id: <input type="text" name="userid"> <br> <br>
<input type="submit" value="view record" name="action" >
<input type="submit" value="Delete Record" name="action" >
<input type="submit" value="Update" name="action" >

</form>  -->
<% 
String message =(String) request.getAttribute("message");

if(message!=null)
{
%>	
	<h1>  <%=message%>  </h1>
<% 
}


     String action = request.getParameter("action");
 String hideView = request.getParameter("hideView");
 String hideDelete = request.getParameter("hideDelete");
 String hideUpdate = request.getParameter("hideUpdate");
 
    boolean hideviewButton = hideView != null && hideView.equals("true");
     boolean hidedeleteButton = hideDelete !=null && hideDelete.equals("true");
     boolean hideupdateButton = hideUpdate !=null && hideUpdate.equals("true");
     
    // ... (existing code)

    %>
    <form action="AdminDao3" method="get" style="text-align:center">
        Enter Id: <input type="text" name="userid"> <br> <br>
        <% if (hideviewButton) { %>
            
            <input type="submit" value="view record" name="action">

        <% }
        else if(hidedeleteButton) {%>
        	
        	 <input type="submit" value="Delete Record" name="action">
        <% }
        
        else if(hideupdateButton){%>
        
             <input type="submit" value="Update" name="action">
               
        <% }
        
        else {%>
           
             <input type="submit" name="action" value="View All">  
             
             
        <% } %>
    </form>
    
</body>
</html>