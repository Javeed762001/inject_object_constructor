package com.ty.inject_object_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		ApplicationContext appCont=new ClassPathXmlApplicationContext("my_config.xml");
		Person person=(Person)appCont.getBean("myPerson");
		
		person.use();
	}
}
