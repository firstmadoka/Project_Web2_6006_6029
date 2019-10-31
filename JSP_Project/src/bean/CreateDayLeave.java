package bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="createdayleave")
public class CreateDayLeave {
	@EmbeddedId
	private CreateDayLeaveID pk = new CreateDayLeaveID();
	@Column(name="checkout")
	private Date checkout = new Date();
	@Column(name="checkin")
	private Date checkin = new Date();
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
	
	public CreateDayLeave(Date checkout, Date checkin) {
		super();
		this.checkout = checkout;
		this.checkin = checkin;
	}
	public CreateDayLeave(CreateDayLeaveID pk, Date checkout, Date checkin, People people, List<Leaves> leaves) {
		super();
		this.pk = pk;
		this.checkout = checkout;
		this.checkin = checkin;
		this.people = people;
		this.leaves = leaves;
	}
	public CreateDayLeaveID getPk() {
		return pk;
	}
	public void setPk(CreateDayLeaveID pk) {
		this.pk = pk;
	}
	public Date getCheckout() {
		return checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	public Date getCheckin() {
		return checkin;
	}
	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
}
