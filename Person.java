package com.sv;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="person")
public class Person {
	private String name;

    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }
}
