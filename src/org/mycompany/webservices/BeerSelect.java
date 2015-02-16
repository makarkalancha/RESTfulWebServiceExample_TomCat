package org.mycompany.webservices;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mycompany.webservices.entity.BeerExpert;

/**
 * Servlet implementation class BeerSelect
 */
//@WebServlet("/BeerSelect")
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String color = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List<String> result = be.getBrands(color);
		
//		//old
//		response.setContentType("text/html");
//		PrintWriter printWriter = response.getWriter();
//		printWriter.write("Beer Selection Advice<br>");
//		
//		Iterator<String> it = result.iterator();
//		while(it.hasNext()){
//			printWriter.write("<br>try: "+it.next());
//		}
		
		//new
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}
