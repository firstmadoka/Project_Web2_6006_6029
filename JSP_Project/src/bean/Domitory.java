package bean;

import javax.persistence.*;

@Entity
@Table(name="domitory")
public class Domitory {
	@Id
	@Column(name="domitoryid")
	private String Domitoryid;
	@Column(name="domitoryname")
	private String Domitoryname;
	public String getDomitoryid() {
		return Domitoryid;
	}
	public void setDomitoryid(String domitoryid) {
		Domitoryid = domitoryid;
	}
	public String getDomitoryname() {
		return Domitoryname;
	}
	public void setDomitoryname(String domitoryname) {
		Domitoryname = domitoryname;
	}
	public Domitory(String domitoryid, String domitoryname) {
		super();
		Domitoryid = domitoryid;
		Domitoryname = domitoryname;
	}
	public Domitory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
