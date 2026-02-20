package in.study.spring.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.study.spring.Students;

public class Test {
	
	public static void main(String[]args) {
		System.out.println("1st Spring program using XML based Configuration");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Students std=(Students)context.getBean("stdId");
		std.display();
	}

}
