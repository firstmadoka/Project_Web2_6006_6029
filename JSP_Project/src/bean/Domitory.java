package bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="domitory")
public class Domitory {
	@Id
	@Column(name="domitoryid")
	private String Domitoryid;
	@Column(name="domitoryname")
	private String Domitoryname;
	@OneToMany(cascade = {CascadeType.ALL},mappedBy="pk.dom")
	private List<Room> rooms = new ArrayList<Room>();
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
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
