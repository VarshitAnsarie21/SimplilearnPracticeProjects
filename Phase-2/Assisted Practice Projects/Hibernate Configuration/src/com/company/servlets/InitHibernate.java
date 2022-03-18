package com.company.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.company.util.HibernateUtil;

/**
 * Servlet implementation class InitHibernate
 */
@WebServlet("/initialiseDB")
public class InitHibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitHibernate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		PrintWriter out = response.getWriter();
		
        out.println("<html><body>");
        out.println("<div align='center'>");
		
		try {

            SessionFactory factory = HibernateUtil.getSessionFactory();
                   
            Session session = factory.openSession();
            
            out.println("<h1>Hibernate Session opened.</h1><br>");
            session.close();
            out.println("<h1>Hibernate Session closed.</h1><br>");
            
                
            } catch (Exception ex) {
                    throw ex;
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
