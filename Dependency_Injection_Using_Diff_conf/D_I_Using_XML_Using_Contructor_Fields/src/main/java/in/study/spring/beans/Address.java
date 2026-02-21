package in.study.spring.beans;

public class Address {
	
	private String state;
	private String district;
	private String  tal;
	public Address(String state, String district, String tal) {
		super();
		this.state = state;
		this.district = district;
		this.tal = tal;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", district=" + district + ", tal=" + tal + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
