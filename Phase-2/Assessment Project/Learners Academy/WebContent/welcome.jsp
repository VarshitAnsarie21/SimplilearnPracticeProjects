<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Learners Academy</title>
</head>
<body>

	<div align="right" style="margin-right: 20px"><h3><a href="logout.jsp">Logout</a></h3></div>
	
	
	<div align="center">
	
		 <h1>WELCOME TO DASHBOARD</h1>
		 
		<div style="display: flex;" align="center">
			<div style="margin-left: 185px">
			<h2>Student Management</h2>
			
				<a href="assignToStudent.jsp">Assign Class</a>  ||  <a href="studentList">List Students</a>
			</div>	
			
			<div style="margin-left: 185px">
			<h2>ClassRoom Management</h2>
			
			<a href="classMasterList.jsp">MasterList Classes</a>
			</div>
		
		
			<div style="margin-left: 185px" >
			<h2>Teacher Management</h2>
			
				<a href="assignToTeacher.jsp">Assign Class & Subject</a>  ||  <a href="teacherList">List Teachers</a>
			</div>
			
			<div style="margin-left: 185px">
			<h2>Subject Management</h2>
			
				<a href="assignToSubject.jsp">Assign Class</a>  ||  <a href="subjectList">List Subjects</a>
			</div>	
		</div>
		
	</div>

</body>
</html>