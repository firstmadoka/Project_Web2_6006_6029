package bean;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class RoomID implements Serializable {
	@ManyToOne
	private People people;
	@ManyToOne
	private Domitory dom;
	public RoomID() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoomID(People people, Domitory dom) {
		super();
		this.people = people;
		this.dom = dom;
	}
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	public Domitory getDom() {
		return dom;
	}
	public void setDom(Domitory dom) {
		this.dom = dom;
	}
}
