package org.mycompany.webservices;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.mycompany.webservices.entity.Dog;

/**
 * @author makar
 * Date: Feb 13, 2015
 * Time: 12:52:31 PM
 */
public class ListenerTester extends HttpServlet{
	private final Logger LOG = Logger.getLogger(ListenerTester.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("test context attributes set by listener<br>");
		out.println("<br>");
		
		Dog dog = (Dog) getServletContext().getAttribute("dog");
		out.println("Dog's breed is "+dog.getBreed());
		LOG.info("ListenerTester: doGet, breed:"+dog.getBreed());
	}
}


