package org.mycompany.webservices;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("test session attributes<br>");
		
//		// version 1
//		HttpSession session = request.getSession();
//		if(session.isNew()){
//			printWriter.println("This is a new session");
//		} else { 
//			printWriter.println("Welcome Back!");
//		}
		
		// version 2
		HttpSession session = request.getSession(false);
//		session.setMaxInactiveInterval((int)TimeUnit.MINUTES.toSeconds(1));
//		session.setMaxInactiveInterval(20);
		//Paramètres->Afficher les paramètres avancés->
		//"Confidentialité"-->Paramètres de contenu->
		//activer --> Autoriser le stockage des données locales (recommandé).
		//désactiver --> Interdire à tous les sites de stocker des données.
		if(session == null){
			//without cookies always new session
			printWriter.println("no session was available<br>");
			printWriter.println("making one...<br>");
			session = request.getSession();
		} else { 
			printWriter.println("there was a session<br>");
		}
		
		printWriter.println("session.getId:"+session.getId());
	}

}
