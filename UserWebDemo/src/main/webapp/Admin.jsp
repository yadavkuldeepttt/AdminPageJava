<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Admin Page</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body onload="myScript()">
        <div class="container">
            <div class="nav"> <h1>Admin Page</h1>
            
            </div> <main class="maincontent">
                <section class="left">
                    <h3>Usefull Links</h3>
                    <ul>
                        <li>
                            <a href="ViewallAdmin.jsp" onclick="showUserlist()">View User List</a>
                        </li>
                        <li>
                            <a href="UpdateEmployee.jsp">Update User</a>
                        </li>
                        <li>
                            <a href="GetId.jsp">View User By ID</a>
                        </li>
                        <li>
                            <a href="GetId.jsp">Delete User</a>
                        </li>
                        <li>
                            <a href="GetId.jsp?action=Update">Update User</a>
                        </li>
                        <li>
                            <a href="UpdateEmployee.jsp">Change Password</a>
                        </li>
                        <li>
                            <a href="ViewAdmin.jsp">View Admin Profile Info</a>
                        </li>
                         <!--    <li>
                            <a href="ViewAdmin.jsp">Search</a>
                        </li> -->
                       <jsp:include page="Mysearch.html"/>
                        

                    </ul>
                </section>
                <section class="right">
                    <img src="3.jpg" alt="admin" id="image">
                    
                  
                </section>
            </main>
        </div>
      
  <script>
 /*  let myScript = ()=>{
		let username = localStorage.getItem("username");
		alert(username);
		console.log(username);
	}
   */
  </script>
      
      
      </body>
</html>