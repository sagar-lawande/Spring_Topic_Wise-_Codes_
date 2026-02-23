package in.study.spring_Jdbc_Module;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.study.spring_Jdbc_Module.resources.ConfigurationFile;

public class Test {
	
	public static void main(String[]args) {
		System.out.println("CRUD Operations using Spring JDBC Module");
		
		String id="1";
		String name="sagar";
		int marks=24;
		
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationFile.class);
	    JdbcTemplate jt=context.getBean(JdbcTemplate.class);
	    
	    
	    System.out.println("*********************************");
	    
	    String name1="Rahul";
	    
	    String query1="update student set name=? where id=?";
	    int count1=jt.update(query1,name1,id);
	    if(count1>0) {
	    	System.out.println("Data Updated sucessfully");
	    	
	    }else {
	    	System.out.println("Data not Updated");
	    }
		
	}

}
