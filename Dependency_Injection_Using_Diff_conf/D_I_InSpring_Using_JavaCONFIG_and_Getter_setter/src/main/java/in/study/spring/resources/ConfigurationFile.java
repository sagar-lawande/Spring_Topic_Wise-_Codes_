package in.study.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.study.spring.beans.Address;
import in.study.spring.beans.Student;

@Configuration
public class ConfigurationFile {

		@Bean
		public Address addObj() {
			Address ads=new Address();
			ads.setState("Maharashtra");
			ads.setDistrict("Nahsik");
			ads.setTal("sinner");
			return ads;
			
		}
		
		@Bean
		public Student stdObj() {
			
			Student std=new Student();
			std.setId(1);
			std.setName("sagar");
			std.setAddress(addObj());
			
			return std;
		}
		
		
		

	}



