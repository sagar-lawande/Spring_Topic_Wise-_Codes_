package in.study.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.study.spring.beans.Student;
import in.study.spring.resources.Configuration;

import org.springframework.context.ApplicationContext;

public class Test {
	
	public static void main(String[]args) {
		System.out.println("Dipendency injection using Constructor fields using Java Configuration");
	
		ApplicationContext context=new AnnotationConfigApplicationContext(Configuration.class);
		Student s=(Student)context.getBean("std");
		s.display();
		
		
	}

}
