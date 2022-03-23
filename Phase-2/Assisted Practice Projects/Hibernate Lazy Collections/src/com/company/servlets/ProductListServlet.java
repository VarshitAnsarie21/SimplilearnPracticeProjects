package com.company.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.company.entity.Color;
import com.company.entity.EProduct;
import com.company.entity.Finance;
import com.company.entity.OS;
import com.company.entity.ScreenSizes;
import com.company.util.HibernateUtil;

/**
 * Servlet implementation class ProductListServlet
 */
@WebServlet("/listProducts")
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
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            
            Session session = factory.openSession();
            
             
            List<EProduct> list = session.createQuery("from EProduct").list();
            
             PrintWriter out = response.getWriter();
             out.println("<html><body>");
             
                                    
             out.println("<b>One to Many and Many to One Mapping</b><br>");
             for(EProduct p: list) {
                     out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() +
                                     ", Price: " + String.valueOf(p.getPrice()));                           
                     List<Color> colors = p.getColors();
                     out.println("<br>Colors: <ul>");
                     for(Color c: colors) {
                             out.print("<li>" + c.getName() + "</li>");
                     }
                     out.println("</ul>");
                     out.println("<hr>");
                     
             }
             out.println("<b>Many to Many Mapping</b><br>");
             for(EProduct p: list) {
                     out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() +
                                     ", Price: " + String.valueOf(p.getPrice()));
                     Set<Finance> finances= (Set<Finance>) p.getFinance();
                     out.println("<br>Finance Options : <ul>");
                     for(Finance f: finances) {
                             out.print("<li>" + f.getFtype() + "</li>");
                     }
                     out.println("</ul>");
                     out.println("<hr>");
             }
             
             
                    session.close();

         out.println("</body></html>");
         
         
     } catch (Exception ex) {
             throw ex;
     }


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
