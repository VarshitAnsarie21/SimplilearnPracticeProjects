<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page errorPage = "handleError.jsp" %>   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Implicit Objects</title>
</head>
<body>
	<%
        String responseCheck = request.getParameter("office");
        if (responseCheck != null ) {
                 response.setStatus(response.SC_MOVED_TEMPORARILY);
                 response.setHeader("Location", "responseRedirect.jsp?office=" + responseCheck);
        }
        
        String errorCheck = request.getParameter("error");
        if (errorCheck != null ) {
                 int x = 0;
                 if (x == 0)
                         throw new RuntimeException("Exception has been raised");
        }
	%>
	<%

	   int serverPort =  request.getServerPort() ;
	   out.println("<h2>The Server is running on port " + String.valueOf(serverPort) + "</h2>");
	   out.println("<h2>Servlet Name is " + config.getServletName() + "</h2>");
	   out.println("<h2>Server Info:" + application.getServerInfo() + "</h2>");
	   
	   String pageName = page.toString();
	   out.println("<h2>The name of the page is " + pageName + "</h2>");
	   
	   pageContext.setAttribute("userid", "John Doe");
	   out.println("<h2>userId attribute from pageContext: " + pageContext.getAttribute("userid") + "</h2>");    
	%>
	
	<a href="index.jsp?office=head_office">Show usage of response object</a><br><br>
	<a href="index.jsp?error=1">Show usage of error  object</a><br><br>


	<%
	   if (response.containsHeader("Office"))
	            out.println("Current location is: " + response.getHeader("Office"));
 	%>
	
</body>
</html>