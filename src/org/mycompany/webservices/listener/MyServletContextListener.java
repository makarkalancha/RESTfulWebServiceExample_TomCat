package org.mycompany.webservices.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.mycompany.webservices.entity.Dog;

/**
 * @author makar
 * Date: Feb 13, 2015
 * Time: 12:46:23 PM
 */
public class MyServletContextListener implements ServletContextListener{
	//ServletContextListener -- You want to know if a context has been created or destroyed
	//You want to know if a context has been created or destroyed
	//can be used to perform an action when the servlet context is about to be shut down.

	public static final Logger LOG = Logger.getLogger(MyServletContextListener.class);
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		LOG.info("context Destroyed");	
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext sc = arg0.getServletContext();
		String dogBreed = sc.getInitParameter("breed");
		Dog dog = new Dog(dogBreed);
		sc.setAttribute("dog", dog);
		
		LOG.info("context Initialized: Dog-->"+dog);
	}
}


