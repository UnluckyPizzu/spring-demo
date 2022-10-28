package com.pizzu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring conf file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		
		//check if they are the same
		
		boolean result = (coach == alphaCoach);
		
		System.out.println(result);
		
		System.out.println("Memory of coach " + coach + ", Memory of alphaCoach " + alphaCoach);
		
		context.close();
		

	}

}
