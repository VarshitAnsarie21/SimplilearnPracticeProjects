package com.company.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.jdbcconnection.DBConnection;

/**
 * Servlet implementation class InsertDataServlet
 */
@WebServlet("/insert")
public class InsertDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dbUrl = "jdbc:mysql://localhost:3306/ecommerce";
		String username = "root";
		String password = "Simplilearn";
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		
		try {
			DBConnection dbConnection = new DBConnection(dbUrl, username, password);
			
			Statement stmnt = dbConnection.getConnection().createStatement();
			
			stmnt.executeUpdate("insert into eproduct (name, price) values ('Vivo', 65000)");
			
			out.println("<div align='center'>");
			out.println("<h1>Data Has been inserted into Database Successfully</h1>");
			
			stmnt.close();
			dbConnection.closeConnection();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		out.println("</div>");
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
