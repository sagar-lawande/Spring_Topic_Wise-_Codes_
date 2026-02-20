package in.study.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Students {
	@Value("1")
	private int id;
	@Value("sagar")
	private String name;
	@Value("90.89")
	private float marks;
	@Value("Bhusawal")
	private String address;
	public int getId() {
		return id;
	}
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
public void display() {
	System.out.println("ID :"+id);
	System.out.println("Name :"+name);
	System.out.println("Marks :"+marks);
	System.out.println("Address :"+address);
}
}
