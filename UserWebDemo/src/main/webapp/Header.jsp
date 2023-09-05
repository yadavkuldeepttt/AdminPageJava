<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	*{
		margin:0;
		padding: 0;
		box-sizing: border-box;
	}
	div{
		background-color: lightblue;
		color: white;
		width: 100%;
		padding: 1.5rem ;
			text-align: center;
		font-size: 18px;
		
	}
	h2{
		margin-bottom: 0.5rem;
		color: black;
	}
	tr td a {
		text-decoration: none;
		color: white;
	}
	
</style>

	<!--<script>
		let hideButtons = ()=>{
			let deleteButton = document.querySelector('input[value="Delete Record"]');
			let updateButton = document.querySelector('input[value="Update"]');
			
			deleteButton.style.display = 'none';
			updateButton.style.display = 'none';
			
		}
		
	</script>-->
<body>


	<div>
		<h2>User Details</h2>
<table border="2" width="100%">
	<tr>
		<td>
			<a href="GetId.jsp?action=view record&hideView=true" >View User</a>
		</td>
		<td>
			<a href="GetId.jsp?action=Delete Record&hideDelete=true">Delete User</a>
		</td>
		<td>
			<a href="GetId.jsp?action=Update&hideUpdate=true">Update User</a>
		</td>
		<td>
			<a href="AdminDao3?action=View All&page=1">View All User</a>
		</td>
		<td>
			<a href="Register.jsp">Add admin</a>
		</td>
			<td>
			<a href="Admin.jsp">Go to Home</a>
		</td>
			
		
	</tr>
	
	
</table>
<jsp:include page="Mysearch.html"/>
</div>	
	



</body>
</html>