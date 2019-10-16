package bean;

import java.util.*;

public class Domitory {
	private String domid;
	private String domname;
	private List<Room> room = new ArrayList<Room>();
	private Employee DH = new Employee();
	private List<Room> rooms = new ArrayList<Room>();
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public Employee getDH() {
		return DH;
	}
	public void setDH(Employee dH) {
		DH = dH;
	}
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
