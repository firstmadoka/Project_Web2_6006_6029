package bean;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table
public class CheckDate {
	@Id
	@Column(name="datechk")
	private Calendar datechk = Calendar.getInstance();
	@Column(name="location")
	private String location;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(name="status")
	private String status;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="peopleid")
	private People people;
	public Calendar getDatechk() {
		return datechk;
	}
	public CheckDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CheckDate(Calendar datechk, String location) {
		super();
		this.datechk = datechk;
		this.location = location;
	}
	public void setDatechk(Calendar datechk) {
		this.datechk = datechk;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
}
