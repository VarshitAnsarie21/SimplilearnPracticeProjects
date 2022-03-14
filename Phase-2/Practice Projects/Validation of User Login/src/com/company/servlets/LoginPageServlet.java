package com.company.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginPageServlet
 */
@WebServlet("/login")
public class LoginPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		RequestDispatcher rd = null;
		
		if(username.equals("varshit@gmail.com") && password.equals("var@123")) {
			rd = request.getRequestDispatcher("dashboard");
			rd.forward(request, response);
		}
		else if(username.equals("") || password.equals(""))
			{		
			out.println("<div align='center'>");
			out.println("<h4 style='color: red'>Sorry username or password is empty...Please Try again</h4>");
			out.println("</div>");
			
			rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);

			}
		else {
			out.println("<div align='center'>");
			out.println("<h4 style='color: red'>Sorry you entered the wrong username or password!</h4>");
			out.println("<h4 style='color: red'>Enter the valid username and password</h4>");
			out.println("</div>");
			
			rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
