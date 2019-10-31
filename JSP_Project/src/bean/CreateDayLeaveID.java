package bean;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class CreateDayLeaveID implements Serializable{
	@ManyToOne
	private Domitory dom;
	private String round;
	public CreateDayLeaveID() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateDayLeaveID(Domitory dom, String round) {
		super();
		this.dom = dom;
		this.round = round;
	}
	public Domitory getDom() {
		return dom;
	}
	public void setDom(Domitory dom) {
		this.dom = dom;
	}
	public String getRound() {
		return round;
	}
	public void setRound(String round) {
		this.round = round;
	}
	
}
