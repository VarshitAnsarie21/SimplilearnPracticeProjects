package com.company.servlets;

import java.io.IOException;



import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.jdbcconnection.DBConnection;



/**
 * Servlet implementation class AddStudentServlet
 */
@WebServlet("/assignClassToStudent")
public class AssignClassToStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignClassToStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//				
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String dbUrl = "jdbc:mysql://localhost:3306/learnersacademy";
		String username = "root";
		String password = "Simplilearn";

        PrintWriter out = response.getWriter();
		
			try {
				
				
				int studentId = Integer.parseInt(request.getParameter("studentname"));
				int classId = Integer.parseInt(request.getParameter("class"));
		    

				// Initialize the database
				DBConnection dbConnection = new DBConnection(dbUrl, username, password);

				// Create a SQL query to insert data into demo table
				PreparedStatement stmnt = dbConnection.getConnection().prepareStatement ("update students set cid =? where stuid=?");
				
				
				// For the first parameter,
				// get the data using request object
				stmnt.setInt(1, classId);

				// Same for second parameter
				stmnt.setInt(2, studentId);

				// Execute the insert command using executeUpdate()
				// to make changes in database
				stmnt.executeUpdate();
				
	            // Close all the connections
				stmnt.close();
				dbConnection.closeConnection();
	            
				out.println("<div align='right' style='margin-right: 20px'>");
				out.println("<a href='welcome.jsp' style='margin-right: 20px'>DashBoard</a>");
				out.println("<a href='logout.jsp'>Logout</a>");
				out.println("</div>");
				
				out.println("<div align='center'>");
				out.println("<h1>Class Assigned To Student Succesfully</h1>");
				out.println("</div>");
				
			}catch (Exception e) {
	            e.printStackTrace();
	            
			}
	}

}
