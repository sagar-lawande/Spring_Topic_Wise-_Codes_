package in.study.spring.beans;

public class Student {
	
	private int id;
	private String name;
	private Address address;
	
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		
	}

}
