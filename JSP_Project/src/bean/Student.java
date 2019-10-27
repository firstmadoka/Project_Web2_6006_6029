package bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Student {
	private String studentid;
	private String studentfirstname;
	private String studentlastname;
	private String phonenumber;
	private Calendar studentbirthday = Calendar.getInstance();
	private Domitory dom = new Domitory();
	private String roomnumber;
	private List<Leave> leave = new ArrayList<Leave>();
	private List<CheckDate> cheackdate = new ArrayList<CheckDate>();
	public List<CheckDate> getCheackdate() {
		return cheackdate;
	}

	public void setCheackdate(List<CheckDate> cheackdate) {
		this.cheackdate = cheackdate;
	}

	public List<Leave> getLeave() {
		return leave;
	}

	public void setLeave(List<Leave> leave) {
		this.leave = leave;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String studentid, String studentfirstname, String studentlastname, String phonenumber,
			Calendar studentbirthday, String roomnumber) {
		super();
		this.studentid = studentid;
		this.studentfirstname = studentfirstname;
		this.studentlastname = studentlastname;
		this.phonenumber = phonenumber;
		this.studentbirthday = studentbirthday;
		this.roomnumber = roomnumber;
	}

	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getStudentfirstname() {
		return studentfirstname;
	}
	public void setStudentfirstname(String studentfirstname) {
		this.studentfirstname = studentfirstname;
	}
	public String getStudentlastname() {
		return studentlastname;
	}
	public void setStudentlastname(String studentlastname) {
		this.studentlastname = studentlastname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Calendar getStudentbirthday() {
		return studentbirthday;
	}
	public void setStudentbirthday(Calendar studentbirthday) {
		this.studentbirthday = studentbirthday;
	}
	public Domitory getDom() {
		return dom;
	}
	public void setDom(Domitory dom) {
		this.dom = dom;
	}
	public String getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
}
