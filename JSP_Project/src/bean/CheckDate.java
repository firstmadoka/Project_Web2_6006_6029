package bean;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table
public class CheckDate {
	@EmbeddedId
	private CheckDateID pk = new CheckDateID();
	@Column(name="datechk")
	private Calendar datechk = Calendar.getInstance();
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(name="status")
	private String status;
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
	}
	public void setDatechk(Calendar datechk) {
		this.datechk = datechk;
	}
	public CheckDateID getPk() {
		return pk;
	}
	public void setPk(CheckDateID pk) {
		this.pk = pk;
	}
	
}
