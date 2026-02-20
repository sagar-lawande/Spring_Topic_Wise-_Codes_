package in.spring.study.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.study.Students;

public class Main {
	
	public static void main(String[]args) {
		
		System.out.println("1st Spring Program Code Using XML Based Configuration");
		//String config="/src/main/java/applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Students std=(Students) context.getBean("stdId");
        std.display();
        System.out.println("");
        Students std1=(Students) context.getBean("stdId1");
        std1.display();
        
        
        System.out.println("\nData Fetch Sucessfully");
	}

}
