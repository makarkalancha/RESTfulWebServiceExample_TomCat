package org.mycompany.webservices.entity;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import org.apache.log4j.Logger;

/**
 * @author makar
 * Date: Feb 13, 2015
 * Time: 12:48:51 PM
 */
public class Dog implements HttpSessionBindingListener{
	private final Logger LOG = Logger.getLogger(Dog.class);
	
	private String breed;
	
	public Dog(String b){
		this.breed = b;
	}

	public String getBreed() {
		return breed;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
//		System.out.println("Dog: value bound, breed:"+this.breed);
		LOG.info("Dog: value bound, breed:"+this.breed);
		
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
//		System.out.println("Dog: value UNbound, breed:"+this.breed);
		LOG.info("Dog: value UNbound, breed:"+this.breed);
	}
}


