package in.study.spring;

public class Students {
	
	private int id;
	private String name;
	private String email;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		System.out.println("ID : "+id);
		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
		System.out.println("Address :"+address);
	}

}
