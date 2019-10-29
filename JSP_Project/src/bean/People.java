package bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="people")
public class People {
	@Id
	private String peopleid;
	@Column(name = "peoplefirstname")
	private String peoplefirstname;
	@Column(name = "peoplelastname")
	private String peoplelastname;
	@Column(name = "phonenumber")
	private String phonenumber;
	@Column(name = "peoplebirthday")
	private Date peoplebirthday = new Date();
	@Column(name = "roomnumber")
	private String roomnumber;
	@Column(name = "email")
	private String email;
	@Column(name = "facebook")
	private String facebook;
	@Column(name = "Line")
	private String Line;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="typeid")
	private Types type;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="domitoryid")
	private Domitory domitory;
	
	public Types getType() {
		return type;
	}
	public void setType(Types type) {
		this.type = type;
	}
	public Domitory getDomitory() {
		return domitory;
	}
	public void setDomitory(Domitory domitory) {
		this.domitory = domitory;
	}
	public List<Leaves> getLeaves() {
		return leaves;
	}
	public void setLeaves(List<Leaves> leaves) {
		this.leaves = leaves;
	}
	@OneToMany(cascade = {CascadeType.ALL},mappedBy="pk.people")
	private List<Leaves> leaves = new ArrayList<Leaves>();
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}
	public People(String peopleid, String peoplefirstname, String peoplelastname, String phonenumber,
			Date peoplebirthday, String roomnumber) {
		super();
		this.peopleid = peopleid;
		this.peoplefirstname = peoplefirstname;
		this.peoplelastname = peoplelastname;
		this.phonenumber = phonenumber;
		this.peoplebirthday = peoplebirthday;
		this.roomnumber = roomnumber;
	}
	public People(String peopleid, String peoplefirstname, String peoplelastname, String phonenumber,
			Date peoplebirthday, String roomnumber, String email, String facebook, String line) {
		super();
		this.peopleid = peopleid;
		this.peoplefirstname = peoplefirstname;
		this.peoplelastname = peoplelastname;
		this.phonenumber = phonenumber;
		this.peoplebirthday = peoplebirthday;
		this.roomnumber = roomnumber;
		this.email = email;
		this.facebook = facebook;
		Line = line;
	}
	public String getPeopleid() {
		return peopleid;
	}
	public void setPeopleid(String peopleid) {
		this.peopleid = peopleid;
	}
	public String getPeoplefirstname() {
		return peoplefirstname;
	}
	public void setPeoplefirstname(String peoplefirstname) {
		this.peoplefirstname = peoplefirstname;
	}
	public String getPeoplelastname() {
		return peoplelastname;
	}
	public void setPeoplelastname(String peoplelastname) {
		this.peoplelastname = peoplelastname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Date getPeoplebirthday() {
		return peoplebirthday;
	}
	public void setPeoplebirthday(Date peoplebirthday) {
		this.peoplebirthday = peoplebirthday;
	}
	public String getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getLine() {
		return Line;
	}
	public void setLine(String line) {
		Line = line;
	}
}
