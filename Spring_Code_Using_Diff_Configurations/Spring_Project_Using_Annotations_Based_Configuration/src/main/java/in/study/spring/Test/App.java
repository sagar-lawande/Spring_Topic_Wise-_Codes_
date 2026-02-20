package in.study.spring.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.study.spring.Students;
import in.study.spring.resources.SpringConfig;

public class App {
	
	public static void main(String[]args) {
		System.out.println("Spring code using Annotaion Based Configuration using Java class component scan");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		Students std=(Students) context.getBean("students");
		std.display();
		
		
	}

}
