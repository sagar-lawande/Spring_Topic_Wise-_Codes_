package in.study.spring.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.study.spring.Students;
import in.study.spring.resources.SpringConfig;

public class Test {
	
	public static void main(String[]args) {
		System.out.println("Spring Program Using Java Based Configuration");
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		Students std=(Students) context.getBean("stdObj1"); //typecas getBean return object which is we known of Students class 
		//Students std=context.getBean(Students.class);   //without using type cass we can use this type also
		std.display();
		System.out.println("");
		Students std1=(Students) context.getBean("stdObj2");
		
		std1.display();
		
		
		
		
		
			
		}
	}


