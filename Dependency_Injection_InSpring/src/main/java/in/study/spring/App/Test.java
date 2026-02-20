package in.study.spring.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.study.spring.beans.Address;
import in.study.spring.beans.Student;

public class Test {
	
	public static void main(String[]args) {
		System.out.println("Dependency injection using Getter and Setter ");
		//String conig="/in/study/spring/resources/applicationConfig.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationConfig.xml");//in this file we can inject object
		
		Student std=(Student)context.getBean("stdObj");
		std.display();
		Address ads=(Address)context.getBean("addObj");
		
	
	}

}
