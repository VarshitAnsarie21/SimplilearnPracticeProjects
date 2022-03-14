package com.company.cookieservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DashboardCookieServlet
 */
@WebServlet("/dashboardCookie")
public class DashboardCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashboardCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] coockies = request.getCookies();
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");

		boolean isFound = false;
		
		if (coockies != null) {
			for (int i = 0; i < coockies.length; i++) {
				
				Cookie cookie = coockies[i];
				
				if (cookie.getName() != null && cookie.getName().contentEquals("userId")) {
					isFound = true;
					out.println("Hello "+ cookie.getValue());
					out.println("<br/>Welcome to the application!");	
				}
			}
		}
		
		if(!isFound) {
			out.println("<h4>No UserID found in cookie, please try to login</h4><br/>");
		}
		
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
