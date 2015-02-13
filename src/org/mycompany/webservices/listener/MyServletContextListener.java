package org.mycompany.webservices.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.mycompany.webservices.entity.Dog;

/**
 * @author makar
 * Date: Feb 13, 2015
 * Time: 12:46:23 PM
 */
public class MyServletContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext sc = arg0.getServletContext();
		String dogBreed = sc.getInitParameter("breed");
		Dog d = new Dog(dogBreed);
		sc.setAttribute("dog", d);
	}
}


