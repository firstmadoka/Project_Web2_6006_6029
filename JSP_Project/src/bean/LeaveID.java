package bean;

import java.io.Serializable;

import javax.persistence.*;
@Embeddable
public class LeaveID implements Serializable {
	
	@ManyToOne
	private People people;
	@ManyToOne
	private CreateDayLeave dayleave;
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	public CreateDayLeave getDayleave() {
		return dayleave;
	}
	public void setDayleave(CreateDayLeave dayleave) {
		this.dayleave = dayleave;
	}
	public LeaveID(People people, CreateDayLeave dayleave) {
		super();
		this.people = people;
		this.dayleave = dayleave;
	}
	public LeaveID() {
		super();
		// TODO Auto-generated constructor stub
	}
}
