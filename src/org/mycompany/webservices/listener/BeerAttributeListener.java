package org.mycompany.webservices.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.apache.log4j.Logger;

/**
 * @author makar
 * Date: Feb 18, 2015
 * Time: 2:16:53 PM
 */
public class BeerAttributeListener implements HttpSessionAttributeListener{
	//HttpSessionAttributeListener -- lets you track each time any attribute
	//is added to, removed from, or replaced in a session.
	
	public static final Logger LOG = Logger.getLogger(BeerAttributeListener.class);
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		String name = arg0.getName();
		Object value = arg0.getValue();
		LOG.info("Attribute added: "+name+":"+value);
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		String name = arg0.getName();
		Object value = arg0.getValue();
		LOG.info("Attribute removed: "+name+":"+value);
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		String name = arg0.getName();
		Object value = arg0.getValue();
		LOG.info("Attribute replaced (old): "+name+":"+value);
	}
	

}


