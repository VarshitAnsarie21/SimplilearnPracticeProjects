package com.company.servlets;

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.jdbcconnection.DBConnection;


/**
 * Servlet implementation class SubjectListServlet
 */
@WebServlet("/subjectList")
public class SubjectListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dbUrl = "jdbc:mysql://localhost:3306/learnersacademy";
		String userName = "root";
		String pwd = "Simplilearn";
		
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		
		try {
			DBConnection dConnection = new DBConnection(dbUrl, userName, pwd);
			
			Statement stmt = dConnection.getConnection().createStatement();
			
			ResultSet rs = stmt.executeQuery("select s.subname, c.cname from subjects s, classes c where s.cid = c.cid");
			
			
			out.println("<div align='right' style='margin-right: 20px'>");
			out.println("<a href='welcome.jsp' style='margin-right: 20px'>DashBoard</a>");
			out.println("<a href='logout.jsp'>Logout</a>");
			out.println("</div>");
			
			out.println("<div align='center'>");
			
			out.println("<h1>SUBJECT DETAILS</h1>");

			out.println("<style> table,td,th {border:1px solid green; padding:10px;}</style>");

			out.print("<table>");

			out.print("<th> Subject Name </th>");

			out.print("<th> Class Name </th>");

			out.print ("</tr>");

			while (rs.next()){

			out.print("<tr><td>" + rs.getString("subname") + " </td><td>" + rs.getString("cname") + " </td></tr>");

			
			}

			out.print ("</table>");
			out.println("</div>");
			
			stmt.close();
			dConnection.closeConnection();
			
		} catch (Exception e) {
            e.printStackTrace();
            
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
