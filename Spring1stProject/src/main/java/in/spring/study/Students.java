package in.spring.study;

public class Students {
	
	private int id;
	private String name;
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
		System.out.println("ID :"+id);
		System.out.println("Name :  "+name);
		System.out.println("Emai : "+email);
	}

}
