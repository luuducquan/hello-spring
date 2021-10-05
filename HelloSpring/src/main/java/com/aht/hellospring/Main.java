package com.aht.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("applicationconfig.xml");
		
		HelloWorld obj = context.getBean(HelloWorld.class);
		obj.getMessage();
	}
}
