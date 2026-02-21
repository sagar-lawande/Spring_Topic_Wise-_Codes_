package in.study.spring.beans;

public class Courses {

	private String courseName;
	private String duration;
	private int fees;
	public Courses(String courseName, String duration, int fees) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Courses [courseName=" + courseName + ", duration=" + duration + ", fees=" + fees + "]";
	}
	
}
