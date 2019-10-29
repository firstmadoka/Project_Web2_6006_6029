package bean;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="leaves")
public class Leaves {
	@EmbeddedId
	private LeaveID pk = new LeaveID();
	@Column(name="checkout")
	private Date checkout = new Date();
	@Column(name="checkin")
	private Date checkin = new Date();
	@Column(name="detail")
	private String detail;
	public Leaves() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Leaves(Date checkout, Date checkin, String detail) {
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
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
