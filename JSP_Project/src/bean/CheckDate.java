package bean;

import java.util.Calendar;

public class CheckDate {
	private Student student = new Student();
	private Calendar check = Calendar.getInstance();
	private String location;
	public CheckDate(Calendar check, String location) {
		super();
		this.check = check;
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	public CheckDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CheckDate(Calendar check) {
		super();
		this.check = check;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Calendar getCheck() {
		return check;
	}
	public void setCheck(Calendar check) {
		this.check = check;
	}
}
