package org.mycompany.webservices;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author makar
 * Date: Feb 13, 2015
 * Time: 11:04:25 AM
 */
public class TestInitParams extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("test init paramters<br>");
		
		Enumeration<String> e = getServletConfig().getInitParameterNames();
		while(e.hasMoreElements()){
			out.println("<br>para name="+e.nextElement()+"<br>");
		}
		
		out.println("main email is "+getServletConfig().getInitParameter("mainEmail"));
		out.println("<br>");
		out.println("admin email is "+getServletConfig().getInitParameter("adminEmail"));
		
	}
	

}


