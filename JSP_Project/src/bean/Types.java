package bean;

import javax.persistence.*;

@Entity
@Table(name = "types")
public class Types {
	@Id
	@Column(name = "typeid")
	private String typeid;
	@Column(name = "typedetail")
	private String typedetail;
	public Types() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Types(String typeid, String typedetail) {
		super();
		this.typeid = typeid;
		this.typedetail = typedetail;
	}
	public String getTypeid() {
		return typeid;
	}
	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}
	public String getTypedetail() {
		return typedetail;
	}
	public void setTypedetail(String typedetail) {
		this.typedetail = typedetail;
	}
}
