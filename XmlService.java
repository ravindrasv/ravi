package com.sv;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
@Path("/")
public class XmlService {
	private static final Logger LOG = Logger.getLogger(XmlService.class);
	@GET
	@Path("/name")
	@Produces(MediaType.APPLICATION_XML)
	public Person getPerson(){
		LOG.info("start");
		Person person=new Person();
		
		person.setName("mytestName");
		
		  
		return person;
	}

}
