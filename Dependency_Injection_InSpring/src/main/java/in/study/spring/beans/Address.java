package in.study.spring.beans;

public class Address {
	
	private String state;
	private String district;
	private int pincode;
	private String tal;
	
	
	
	
	
	public String getState() {
		return state;
	}

	public String getDistrict() {
		return district;
	}

	public int getPincode() {
		return pincode;
	}

	public String getTal() {
		return tal;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public void setTal(String tal) {
		this.tal = tal;
	}
	
	
	

}
