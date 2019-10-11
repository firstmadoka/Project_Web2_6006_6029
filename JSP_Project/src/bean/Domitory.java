package bean;

import java.util.*;

public class Domitory {
	private String domid;
	private String domname;
	private List<Room> room = new ArrayList<Room>();
	public Domitory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Domitory(String domid, String domname, List<Room> room) {
		super();
		this.domid = domid;
		this.domname = domname;
		this.room = room;
	}
	public String getDomid() {
		return domid;
	}
	public void setDomid(String domid) {
		this.domid = domid;
	}
	public String getDomname() {
		return domname;
	}
	public void setDomname(String domname) {
		this.domname = domname;
	}
	public List<Room> getRoom() {
		return room;
	}
	public void setRoom(List<Room> room) {
		this.room = room;
	}
}
