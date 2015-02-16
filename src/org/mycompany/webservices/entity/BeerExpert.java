package org.mycompany.webservices.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author makar
 * Date: Feb 16, 2015
 * Time: 10:27:05 AM
 */
public class BeerExpert {
	public List<String> getBrands(String color){
		List<String> brands = new ArrayList<String>();
		if(color.equalsIgnoreCase("amber")){
			brands.add("Jack Amber");
			brands.add("Red Moose");
		} else {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
		}
		return brands;
	}

}


