package com.sv;

import org.apache.log4j.Logger;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class PersonConverter implements Converter{
	private static final Logger LOG = Logger.getLogger(PersonConverter.class);
	@Override
	public boolean canConvert(Class clazz) {
		// TODO Auto-generated method stub
		LOG.info("canConvert");
		return clazz.equals(Person.class);
	}

	@Override
	public void marshal(Object value, HierarchicalStreamWriter writer, MarshallingContext context) {
       LOG.info("marshal");
      Person person = (Person) value;
      LOG.info("starttag");
      writer.startNode("fullname");
      writer.setValue(person.getName());
      LOG.info("endnode");
      writer.endNode();
		
	}

	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		Person person = new Person();
        reader.moveDown();
        person.setName(reader.getValue());
        reader.moveUp();
        LOG.info("unmarshal");
		return person;
	}

}
