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
 * Servlet implementation class ProductDetailsServlet
 */
@WebServlet("/productDetails")
public class ProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();
        
        RequestDispatcher rd =null;
         
        out.println("<html><body>");
        
        try {
        	
        	int id = Integer.parseInt(request.getParameter ("productId"));
        	String productName = request.getParameter ("productName");
        	String productType = request.getParameter ("productType");
        	int productPrice = Integer.parseInt(request.getParameter ("productPrice"));
        	
        	out.println("<div align='center'>");
        	
        	out.println("<h1> PRODUCT DETAILS</h1>");
        	
        	out.println("<style> table,td,th {border:1px solid green; padding:10px;}</style>");
        	
            out.print("<table>");
      
            out.print("<th> Product ID </th>");
    		out.print("<th> Product Name </th>");
    		out.print("<th> Product Type </th>");
    		out.print("<th> Product Price </th>");
            
            out.print ("</tr>");
            
            	
             out.print("<tr><td>"+ id + "</td><td>" 
            		 	+ productName + " </td><td>" 
            		 	+ productType + " </td><td>" 
            		 	+ productPrice + "</td></tr>");

            out.print ("</table>");
        	
        }catch(NumberFormatException e){
			
			rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			out.println("<div align='center'>");
			out.print("<span style='color: red; margin-left: 25px'>Invalid product ID. Please Enter a valid details</span><br/>");
			out.println("</div>");
			
		}catch (Exception e2){
            e2.printStackTrace ();
            
        }finally{
            out.close ();
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
