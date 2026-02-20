package in.study.spring.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import in.study.spring.beans.Address;
import in.study.spring.beans.Student;
import in.study.spring.resources.ConfigurationFile;

public class Test {
	
	public static void main(String[]args) {
		System.out.println("Dependency injection using JAVA baed Configuration using Getter and Setter");
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationFile.class);
		
		Student std=(Student)context.getBean("stdObj");
		std.display();
		
	}

}
