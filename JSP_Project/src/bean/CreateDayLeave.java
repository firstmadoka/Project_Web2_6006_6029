package bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CreateDayLeave {
	private HeadofDom head = new HeadofDom();
	private Calendar checkout = Calendar.getInstance();
	private Calendar checkin = Calendar.getInstance();
	private List<Leave> leave = new ArrayList<Leave>();
	public List<Leave> getLeave() {
		return leave;
	}
	public void setLeave(List<Leave> leave) {
		this.leave = leave;
	}
	public CreateDayLeave() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateDayLeave(Calendar checkout, Calendar checkin) {
		super();
		this.checkout = checkout;
		this.checkin = checkin;
	}
	public HeadofDom getHead() {
		return head;
	}
	public void setHead(HeadofDom head) {
		this.head = head;
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
}
