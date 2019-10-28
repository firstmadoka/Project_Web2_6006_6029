package bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="createdayleave")
public class CreateDayLeave {
	@Id
	private String dayleaveid;
	@Column(name="checkout")
	private Calendar checkout;
	@Column(name="checkin")
	private Calendar checkin;
	@ManyToOne
	@JoinColumn(name="peopleid")
	private People people;
	@OneToMany(cascade = {CascadeType.ALL},mappedBy="pk.dayleave")
	private List<Leaves> leaves = new ArrayList<Leaves>();
	public List<Leaves> getLeaves() {
		return leaves;
	}
	public void setLeaves(List<Leaves> leaves) {
		this.leaves = leaves;
	}
	public CreateDayLeave() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateDayLeave(String dayleaveid, Calendar checkout, Calendar checkin) {
		super();
		this.dayleaveid = dayleaveid;
		this.checkout = checkout;
		this.checkin = checkin;
	}
	public String getDayleaveid() {
		return dayleaveid;
	}
	public void setDayleaveid(String dayleaveid) {
		this.dayleaveid = dayleaveid;
	}
	public Calendar getCheckout() {
		return checkout;
	}
	public void setCheckout(Calendar checkout) {
		this.checkout = checkout;
	}
	public Calendar getCheckin() {
		return checkin;
	}
	public void setCheckin(Calendar checkin) {
		this.checkin = checkin;
	}
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
}
