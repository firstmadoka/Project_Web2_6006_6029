package bean;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="room")
public class Room {
	@EmbeddedId
	private RoomID pk = new RoomID();
	@Column(name = "roomid")
	private String Roomid;
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(RoomID pk, String roomid) {
		super();
		this.pk = pk;
		Roomid = roomid;
	}
	public RoomID getPk() {
		return pk;
	}
	public void setPk(RoomID pk) {
		this.pk = pk;
	}
	public String getRoomid() {
		return Roomid;
	}
	public void setRoomid(String roomid) {
		Roomid = roomid;
	}
	
}
