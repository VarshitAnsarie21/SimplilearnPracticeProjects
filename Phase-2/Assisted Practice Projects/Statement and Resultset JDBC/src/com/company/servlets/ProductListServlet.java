package com.company.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.jdbcconnection.DBConnection;

/**
 * Servlet implementation class ProductListServlet
 */
@WebServlet("/productList")
public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductListServlet() {
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
			
			ResultSet rs = stmnt.executeQuery("Select * from eproduct");
			
			out.println("<div align='center'>");
			out.println("<h1>LIST OF PRODUCTS IN DATABASE</h1>");
			
			while(rs.next()) {
				out.println("<h2>"+rs.getInt("ID")+" :- "+rs.getString("name")+" - "+rs.getInt("price")+"</h2>");
			}
			
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
