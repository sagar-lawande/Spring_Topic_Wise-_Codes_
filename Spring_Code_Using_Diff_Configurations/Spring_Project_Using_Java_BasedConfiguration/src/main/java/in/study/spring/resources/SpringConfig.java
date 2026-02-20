package in.study.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.study.spring.Students;

@Configuration
public class SpringConfig {
	
	@Bean("stdObj1")
	public Students  dataInsert1()
	{		Students std=new Students();
		std.setId(1);
		std.setName("sagar");
		std.setAddress("Bhusawal");
		std.setEmail("sagar@gmail.com");
		return std;
		
		
	}
	
	
	@Bean("stdObj2")
	public Students  dataInsert2()
	{		Students std=new Students();
		std.setId(1);
		std.setName("Jay");
		std.setAddress("Nashik");
		std.setEmail("jay@gmail.com");
		return std;
		
		
	}

}
