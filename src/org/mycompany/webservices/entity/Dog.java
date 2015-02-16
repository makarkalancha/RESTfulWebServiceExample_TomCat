package org.mycompany.webservices.entity;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @author makar
 * Date: Feb 13, 2015
 * Time: 12:48:51 PM
 */
public class Dog implements HttpSessionBindingListener{
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
		
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}


