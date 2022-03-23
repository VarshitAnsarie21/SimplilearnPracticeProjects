<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Implicit Objects</title>
</head>
<body>
	<%
        String office = request.getParameter("office");
        if (office != null)
                out.println("<h2>value of Office obtained: " + office + "</h2>");
        else
                out.println("<h2> value of Office found</h2>");
	%>
	
</body>
</html>