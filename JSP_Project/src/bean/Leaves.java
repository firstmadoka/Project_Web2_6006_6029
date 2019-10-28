package bean;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name="leaves")
public class Leaves {
	@EmbeddedId
	private LeaveID pk = new LeaveID();
	@Column(name="checkout")
	private Calendar checkout;
	@Column(name="checkin")
	private Calendar checkin;
	@Column(name="detail")
	private String detail;
	public Leaves() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Leaves(Calendar checkout, Calendar checkin, String detail) {
		super();
		this.checkout = checkout;
		this.checkin = checkin;
		this.detail = detail;
	}
	public LeaveID getPk() {
		return pk;
	}
	public void setPk(LeaveID pk) {
		this.pk = pk;
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
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
