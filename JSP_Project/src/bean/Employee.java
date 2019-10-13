package bean;

import java.util.*;

public class Employee {
	private String empid;
	private String empfirstname;
	private String emplastname;
	private String empphonenumber;
	private List<Employee> manager = new ArrayList<Employee>();
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empid, String empfirstname, String emplastname, String empphonenumber) {
		super();
		this.empid = empid;
		this.empfirstname = empfirstname;
		this.emplastname = emplastname;
		this.empphonenumber = empphonenumber;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpfirstname() {
		return empfirstname;
	}
	public void setEmpfirstname(String empfirstname) {
		this.empfirstname = empfirstname;
	}
	public String getEmplastname() {
		return emplastname;
	}
	public void setEmplastname(String emplastname) {
		this.emplastname = emplastname;
	}
	public String getEmpphonenumber() {
		return empphonenumber;
	}
	public void setEmpphonenumber(String empphonenumber) {
		this.empphonenumber = empphonenumber;
	}
	public List<Employee> getManager() {
		return manager;
	}
	public void setManager(List<Employee> manager) {
		this.manager = manager;
	}
}
