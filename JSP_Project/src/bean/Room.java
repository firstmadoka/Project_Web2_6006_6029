package bean;

public class Room {
	private String roomid;
	private int amount;
	private Domitory dom = new Domitory();
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(String roomid, int amount, Domitory dom) {
		super();
		this.roomid = roomid;
		this.amount = amount;
		this.dom = dom;
	}
	public String getRoomid() {
		return roomid;
	}
	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Domitory getDom() {
		return dom;
	}
	public void setDom(Domitory dom) {
		this.dom = dom;
	}
}
