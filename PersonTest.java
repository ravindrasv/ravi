package com.sv;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.apache.log4j.Logger;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

@Path("/x")
public class PersonTest {
	private static final Logger LOG = Logger.getLogger(PersonTest.class);
@GET
@Path("/myexstream")
	public Person getXstream(){
		LOG.info("xstramTest");
	Person person=new Person();
	person.setName("testName");
	
	   XStream xStream = new XStream(new DomDriver());
	   xStream.registerConverter(new PersonConverter());
	   xStream.alias("Person",Person.class );
	   System.out.println(xStream.toXML(person));
	   return person;
}
}
