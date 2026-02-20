package in.study.spring;


public class Students {
	
	private int id;
	private String name;
	private String address;
	private String email;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		System.out.println("Id :"+id);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Email :"+email);
	}
	

}
