package in.study.spring.resources;

import org.springframework.context.annotation.Bean;

import in.study.spring.beans.Courses;
import in.study.spring.beans.Student;

public class Configuration {
	@Bean
	public Courses course() {
		Courses c=new Courses("JAVA","2_Months",23000);
		return c;
		
	}
	@Bean
	public Student std() {
		Student s=new Student(1,"Sagar","Pune",23, course());
		return s;
		
	}

}
