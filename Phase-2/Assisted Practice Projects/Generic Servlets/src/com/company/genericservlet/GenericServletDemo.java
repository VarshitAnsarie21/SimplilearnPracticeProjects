package com.company.genericservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GenericServletDemo
 */
@WebServlet(name="GenericServletDemo", urlPatterns= {"/genericServlet"})
public class GenericServletDemo extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenericServletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    	PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h1>Hello Simplilearn !</h1>");
		out.println("<h3>The date and time now is "+ new Date()+"</h3>");
		out.println("<html><body>");
		
		out.close();
		
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
