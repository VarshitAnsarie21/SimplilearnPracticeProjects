package com.company.servlets;

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.company.jdbcconnection.DBConnection;



/**
 * Servlet implementation class ClassesLIstServlet
 */
@WebServlet("/classMasterList")
public class ClassesMasterLIstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassesMasterLIstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
				
				
				int ClassId = Integer.parseInt(request.getParameter("class"));
				
				// Initialize the database
				DBConnection dbConnection = new DBConnection(dbUrl, username, password);

				// Create a SQL query to insert data into demo table
				PreparedStatement stmnt1 = dbConnection.getConnection().prepareStatement ("select stuname from students where cid=?  ");
				PreparedStatement stmnt2 = dbConnection.getConnection().prepareStatement ("select tname from teachers where cid=? ");
				PreparedStatement stmnt3 = dbConnection.getConnection().prepareStatement ("select subname from subjects where cid=? ");
				
				
				stmnt1.setInt(1, ClassId);
				stmnt2.setInt(1, ClassId);
				stmnt3.setInt(1, ClassId);

			    ResultSet rs1 = stmnt1.executeQuery();
			    ResultSet rs2 = stmnt2.executeQuery();
			    ResultSet rs3 = stmnt3.executeQuery();

				out.println("<div align='right' style='margin-right: 20px'>");
				out.println("<a href='welcome.jsp' style='margin-right: 20px'>DashBoard</a>");
				out.println("<a href='logout.jsp'>Logout</a>");
				out.println("</div>");
			    
				out.println("<h1 style='text-align: center'>CLASS REPORT DETAILS</h1>");
				
				out.println("<h2 style='text-align: center'>List of Students, Teachers and Subjects Related to this Class is Mentioned Below</h2>");
				
				out.println("<div align='center' style='display: flex;'>");

				out.println("<style> table,td,th {border:1px solid green; padding:10px;}</style>");

				out.print("<table style='margin-left: 620px'>");

				out.print("<th> Student Name </th>");
			
				out.print ("</tr>");

				while (rs1.next()){

				out.print("<tr><td>" + rs1.getString("stuname") + " </td></tr>");

				
				}

				out.print ("</table>");
				
				out.print("<table style='margin-left: 100px'>");

			
				out.print("<th> Subject Name </th>");
			
				out.print ("</tr>");

				while (rs3.next()){

				out.print("<tr><td>" + rs3.getString("subname") + " </td></tr>");

				
				}

				out.print ("</table>");
				
				out.print("<table style='margin-left: 100px'>");

				out.print("<th> Teacher Name </th>");
			
				out.print ("</tr>");

				while (rs2.next()){

				out.print("<tr><td>" + rs2.getString("tname") + " </td></tr>");

				
				}

				out.print ("</table>");
				out.println("</div>");
				
				stmnt1.close();
				stmnt2.close();
				stmnt3.close();
				dbConnection.closeConnection();
				
			}catch (Exception e) {
	            e.printStackTrace();
	            
			}

	}

}
