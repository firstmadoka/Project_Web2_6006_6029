package bean;

import java.util.Calendar;

public class Leave {
	private CreateDayLeave createday = new CreateDayLeave();
	private Student student = new Student();
	private Calendar checkout = Calendar.getInstance();
	private Calendar checkin = Calendar.getInstance();
	private String detail;
	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Leave(Calendar checkout, Calendar checkin, String detail) {
		super();
		this.checkout = checkout;
		this.checkin = checkin;
		this.detail = detail;
	}
	public CreateDayLeave getCreateday() {
		return createday;
	}
	public void setCreateday(CreateDayLeave createday) {
		this.createday = createday;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
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
