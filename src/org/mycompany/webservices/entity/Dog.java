package org.mycompany.webservices.entity;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

import org.apache.log4j.Logger;

/**
 * @author makar
 * Date: Feb 13, 2015
 * Time: 12:48:51 PM
 */
public class Dog implements HttpSessionBindingListener, HttpSessionActivationListener, Serializable{
	//HttpSessionBindingListener -- 
	
	//HttpSessionActivationListener -- lets an attribute (dog as session attribute) keep
	//track of events that might be important to the attribute itself — when it’s added to or
	//removed from a session, and when the session migrates from one VM to another.
	private final Logger LOG = Logger.getLogger(Dog.class);
	
	private String breed;
	
	public Dog(String b){
		this.breed = b;
	}

	public String getBreed() {
		return breed;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + "]";
	}
	
	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		LOG.info("Dog: value bound, breed:"+this.breed);
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		LOG.info("Dog: value UNbound, breed:"+this.breed);
	}

	@Override
	public void sessionDidActivate(HttpSessionEvent arg0) {
		LOG.info("Dog: session Did Activate, breed:"+this.breed);
		
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		LOG.info("Dog: session Will Passivate, breed:"+this.breed);
		
	}

	
	
	
}


