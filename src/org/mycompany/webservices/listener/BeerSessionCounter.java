package org.mycompany.webservices.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;

/**
 * @author makar
 * Date: Feb 18, 2015
 * Time: 1:41:10 PM
 */
public class BeerSessionCounter implements HttpSessionListener{
	//HttpSessionListener -- lets you keep track of the number of active sessions 
	//in this web app. Very simple.
	
	public static final Logger LOG = Logger.getLogger(BeerSessionCounter.class);
	
	private static int activeSessions;
	
	public static int getActiveSessionsCount(){
		return activeSessions;
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		activeSessions++;
		LOG.info("Session created, # of active sessions: "+activeSessions);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		activeSessions--;
		LOG.info("Session destroyed, # of active sessions: "+activeSessions);
	}
	

}


