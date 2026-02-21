package in.study.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.study.spring.beans.Student;
public class Test {
	
	public static  void main(String[]args) {
		System.out.println("D_I_Using Constructor Fields using XML Configuration");
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("Configure.xml");
		Student s=(Student)context.getBean("stdObj");
		s.display();
	}

}
