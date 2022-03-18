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
 * Servlet implementation class InsertProductServlet
 */
@WebServlet("/insert-product")
public class InsertProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertProductServlet() {
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
		String dbUrl = "jdbc:mysql://localhost:3306/ecommerce";
		String username = "root";
		String password = "Simplilearn";

        PrintWriter out = response.getWriter();
        
        RequestDispatcher rd =null;
		
			try {
				
				String name = request.getParameter("productName");
				
		    	int price = Integer.parseInt(request.getParameter("productPrice"));

				// Initialize the database
				DBConnection dbConnection = new DBConnection(dbUrl, username, password);

				// Create a SQL query to insert data into demo table
				PreparedStatement stmnt = dbConnection.getConnection().prepareStatement ("insert into eproduct(name, price, date_added) values (?, ?, now())");

				// For the first parameter,
				// get the data using request object
				// sets the data to st pointer
				stmnt.setString(1, name);

				// Same for second parameter
				stmnt.setInt(2, price);

				// Execute the insert command using executeUpdate()
				// to make changes in database
				stmnt.executeUpdate();
				
	            // Close all the connections
				stmnt.close();
				dbConnection.closeConnection();
	            
				//response.sendRedirect("successPage");
				out.println("<div align='center'>");
				out.println("<h1>Product Succesfully Inserted</h1>");
				out.println("</div>");
				
			}catch(NumberFormatException e){
				
				rd = request.getRequestDispatcher("index.html");
				rd.include(request, response);
				out.println("<div align='center'>");
				out.print("<span style='color: red; margin-left: 25px'>Invalid product details. Please Enter a valid product details</span><br/>");
				out.println("</div>");
				
			}catch (Exception e) {
	            e.printStackTrace();
	            
			}
	}

}
