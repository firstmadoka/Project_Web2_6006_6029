package bean;

import java.util.Date;

public class Student {
	private String Studentid;
	private String Studentfirstname;
	private String Studentlastname;
	private String StudentPhoneNumber;
	private Date StudentBirthday = new Date();
	private Room room = new Room();
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentid, String studentfirstname, String studentlastname, String studentPhoneNumber,
			Date studentBirthday) {
		super();
		Studentid = studentid;
		Studentfirstname = studentfirstname;
		Studentlastname = studentlastname;
		StudentPhoneNumber = studentPhoneNumber;
		StudentBirthday = studentBirthday;
	}
	public String getStudentid() {
		return Studentid;
	}
	public void setStudentid(String studentid) {
		Studentid = studentid;
	}
	public String getStudentfirstname() {
		return Studentfirstname;
	}
	public void setStudentfirstname(String studentfirstname) {
		Studentfirstname = studentfirstname;
	}
	public String getStudentlastname() {
		return Studentlastname;
	}
	public void setStudentlastname(String studentlastname) {
		Studentlastname = studentlastname;
	}
	public String getStudentPhoneNumber() {
		return StudentPhoneNumber;
	}
	public void setStudentPhoneNumber(String studentPhoneNumber) {
		StudentPhoneNumber = studentPhoneNumber;
	}
	public Date getStudentBirthday() {
		return StudentBirthday;
	}
	public void setStudentBirthday(Date studentBirthday) {
		StudentBirthday = studentBirthday;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
}
