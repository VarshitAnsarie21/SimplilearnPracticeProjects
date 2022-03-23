<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Directives</title>
</head>
<body>
		<h1>This is content from the main file.</h1>
		
		<%@ include file="included.jsp" %>
		<hr>
		<h2></h2>Example of using JSTL taglibs for formatting output</h2>
		<p>
		        Currency = <fmt:formatNumber value = "145" type = "currency"/>
		<p>
		<p>
		        <c:set var = "now" value = "<%= new java.util.Date()%>" />
		        Current date and time is <fmt:formatDate pattern = "yyyy-MM-dd hh:mm:ss" value = "${now}" />
		</p>
	
</body>
</html>