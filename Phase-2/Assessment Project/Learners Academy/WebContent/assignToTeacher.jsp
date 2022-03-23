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
		<h1>Teacher Management</h1>
			
			<form action="assignToTeacher" method="post">
				<table border="1" cellpadding="10">
				
					<h3>Assign Class & Subject to Teacher</h3>
					<tr>
						<th>Select Teacher</th>
						<td>
							<select name="teachername" id="teachername">
								<option value="1">Washington</option>
								<option value="2">Adams</option>
								<option value="3">Jefferson</option>
								<option value="4">Lincoln</option>
								<option value="5">Albert</option>
								<option value="6">Mohan</option>
								<option value="7">Symon</option>
								<option value="8">Richard</option>
								<option value="9">Matt</option>
							</select><br/>
						</td>
					</tr>
					<tr>
						<th>Select Subject</th>
						<td>
        					<select name="subjectname" id="subjectname">
								<option value="1">J2EE </option>
								<option value="2">Hibernate </option>
								<option value="3">Spring </option>
								<option value="4">Spring MVC</option>
								<option value="5">Windows 8</option>
								<option value="6">Windows 10</option>
								<option value="7">Linux</option>
								<option value="8">Unix</option>
								<option value="9">Android</option>
								<option value="10">Artificial Intelligence</option>
								<option value="11">Data Science</option>
								<option value="12">Computer Science</option>
								<option value="13">Statistics</option>
								<option value="14">Mathematics</option>
								<option value="15">Problem Solving</option>
								<option value="16">Reasoning</option>
								<option value="17">Computer Vision</option>
								<option value="18">Mathematics</option>
								<option value="19">Continuous development</option>
								<option value="20">Continuous delivery</option>
								<option value="21">Continuous integration</option>
								<option value="22">Continuous deployment</option>
								<option value="23">Continuous monitoring</option>
							</select><br/>
						</td>
					</tr>
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
						<input type="submit" value="Assign" /></td>
					</tr>
				</table>
			</form>	
	</div>

</body>
</html>