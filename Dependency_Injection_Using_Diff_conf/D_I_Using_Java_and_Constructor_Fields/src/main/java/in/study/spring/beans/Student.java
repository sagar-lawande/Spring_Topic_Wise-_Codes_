package in.study.spring.beans;

public class Student {
	private int id;
	private String name;
	private String address;
	private int rollNo;
	private Courses course;
	public Student(int id, String name, String address, int rollNo, Courses course) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.rollNo = rollNo;
		this.course = course;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		System.out.println("Dipendency Inject in Student of Course");
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		System.out.println("RollNo :"+rollNo);
		System.out.println(course);
		
	}

	
	
	

}
