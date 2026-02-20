package in.study.spring.beans;

public class Student {
	
	private int id;
	private String name;
	private String email;
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
		System.out.println("Address :"+address.getState());
		System.out.println("Address :"+address.getDistrict());
		System.out.println("Address :"+address.getPincode());
		System.out.println("Address :"+address.getTal());
		
	}

}
