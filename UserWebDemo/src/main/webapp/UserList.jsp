<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List Page</title>
<link rel="stylesheet" href="style2.css">
</head>
<body>
 <div class="container">
            <div class="nav"> <h1>Admin Page</h1>
            </div> <main class="maincontent">
                <section class="left">
                    <h3>Usefull Links</h3>
                    <ul>
                        <li>
                            <a href="Admin.html" onclick="showUserlist()">Go to Admin Page</a>
                        </li>
                        <li>
                            <a href>Update User</a>
                        </li>
                        <li>
                            <a href>View User By ID</a>
                        </li>
                        <li>
                            <a href>Delete User</a>
                        </li>
                        <li>
                            <a href>Update User</a>
                        </li>
                        <li>
                            <a href>Change Password</a>
                        </li>
                        <li>
                            <a href>View Admin Profile Info</a>
                        </li>

                    </ul>
                </section>
                <section class="right">
                    <h2>User List</h2>
                   <table>
                     <thead>
                       <tr>
	                       <th>User_ID</th>
	                       <th>User_Password</th>
	                       <th>User_Name</th>
	                       <th>User_Age</th>
	                       <th>User_City</th>
	                   
                       </tr>
                   
                     </thead>
                   
                   <tbody>
                       <tr>
                           <td ><%=request.getAttribute("userId") %></td>
                          <td ><%=request.getAttribute("userpassword") %></td>
                          <td ><%=request.getAttribute("username") %></td>
                          <td ><%=request.getAttribute("userage") %></td>
                          <td ><%=request.getAttribute("usercity") %></td>
                          
                       
                       </tr>
                       
                   
                   </tbody>
                   </table>
                  
                  
                </section>
            </main>
        </div>

</body>
</html>