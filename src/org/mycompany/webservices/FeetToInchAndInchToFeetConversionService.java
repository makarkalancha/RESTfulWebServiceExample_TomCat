package org.mycompany.webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.mycompany.converter.FeetConverter;
import org.mycompany.converter.InchConverter;

import com.google.gson.JsonObject;

@Path("ConversionService")
public class FeetToInchAndInchToFeetConversionService {
	// //http://localhost:8080/RESTfulWebServiceExample_TomCat/rest/ConversionService/InchToFeet/2
	@GET
	@Path("/InchToFeet/{i}")
	@Produces(MediaType.TEXT_XML)
	public String convertInchToFeet(@PathParam("i") int inch) {
		InchConverter converter = new InchConverter(inch);
		double feet = converter.toFeet();
		return "<InchToFeetService>" + "<Inch>" + inch + "</Inch>" + "<Feet>"
				+ feet + "</Feet>" + "</InchToFeetService>";
	}

	// http://localhost:8080/RESTfulWebServiceExample_TomCat/rest/ConversionService/json/InchToFeet/2
	@GET
	@Path("/json/InchToFeet/{i}")
	@Produces(MediaType.TEXT_PLAIN)
	public String convertInchToFeetJson(@PathParam("i") int inch) {
		InchConverter converter = new InchConverter(inch);
		double feet = converter.toFeet();
		JsonObject obj = new JsonObject();
		obj.addProperty("Inch", new Integer(inch));
		obj.addProperty("Feet", feet);
		return obj.toString();
	}

	// http://localhost:8080/RESTfulWebServiceExample_TomCat/rest/ConversionService/FeetToInch/3
	@GET
	@Path("/FeetToInch/{f}")
	@Produces(MediaType.TEXT_XML)
	public String convertFeetToInch(@PathParam("f") int feet) {
		FeetConverter converter = new FeetConverter(feet);
		int inch = converter.toInch();
		return "<FeetToInchService>" + "<Feet>" + feet + "</Feet>" + "<Inch>"
				+ inch + "</Inch>" + "</FeetToInchService>";
	}

	// http://localhost:8080/RESTfulWebServiceExample_TomCat/rest/ConversionService/json/FeetToInch/3
	@GET
	@Path("/json/FeetToInch/{f}")
	@Produces(MediaType.TEXT_PLAIN)
	public String convertFeetToInchJson(@PathParam("f") int feet) {
		FeetConverter converter = new FeetConverter(feet);
		int inch = converter.toInch();
		JsonObject obj = new JsonObject();
		obj.addProperty("Feet", feet);
		obj.addProperty("Inch", new Integer(inch));
		return obj.toString();
	}

}
