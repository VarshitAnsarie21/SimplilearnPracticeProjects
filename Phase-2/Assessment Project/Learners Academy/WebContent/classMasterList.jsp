<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Learners Academy</title>
</head>
<body>
	<div align="right" style="margin-right: 20px">
		<a href="welcome.jsp" style="margin-right: 20px">DashBoard</a>
		<a href="logout.jsp">Logout</a>
	</div>
	
	<div align='center'>
		<h1>ClassRoom Management</h1>
			
			<form action="classMasterList" method="post">
				<table border="1" cellpadding="10">
				
					<h3>Master List of Class</h3>
					<tr>
						<th>Select Class</th>
						<td><select name="class" id="class">
							<option value="1">FullStack Java class</option>
							<option value="2">Operating System class</option>
							<option value="3">Machine Learning class</option>
							<option value="4">Artificial Intelligence class</option>
							<option value="5">DevOps class</option>
						</select></td>
					</tr>
					<tr>
						<td colspan="2" align="center">
						<input type="submit" value="Submit" /></td>
					</tr>
				</table>
			</form>
	</div>

</body>
</html>