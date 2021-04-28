package com.te.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("carConfig.xml");
		
	    Class car = context.getBean("car", Class.class);
	    System.out.println(car.getCompany());
	    System.out.println(car.getEngine().getCc());
	    System.out.println(car.getEngine());
	}

}
