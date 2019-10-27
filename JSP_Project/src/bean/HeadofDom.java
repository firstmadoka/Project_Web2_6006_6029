package bean;

import java.util.ArrayList;
import java.util.List;

public class HeadofDom {
	private String headid;
	private String headfirstname;
	private String headlastname;
	private String headphonenumber;
	private String email;
	private String facebook;
	private String Line;
	private Domitory dom = new Domitory();
	private List<News> news = new ArrayList<News>();
	private List<CreateDayLeave> dayleave = new ArrayList<CreateDayLeave>();
	public List<CreateDayLeave> getDayleave() {
		return dayleave;
	}
	public void setDayleave(List<CreateDayLeave> dayleave) {
		this.dayleave = dayleave;
	}
	public List<News> getNews() {
		return news;
	}
	public void setNews(List<News> news) {
		this.news = news;
	}
	public HeadofDom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HeadofDom(String headid, String headfirstname, String headlastname, String headphonenumber, String email,
			String facebook, String line) {
		super();
		this.headid = headid;
		this.headfirstname = headfirstname;
		this.headlastname = headlastname;
		this.headphonenumber = headphonenumber;
		this.email = email;
		this.facebook = facebook;
		Line = line;
	}
	public String getHeadid() {
		return headid;
	}
	public void setHeadid(String headid) {
		this.headid = headid;
	}
	public String getHeadfirstname() {
		return headfirstname;
	}
	public void setHeadfirstname(String headfirstname) {
		this.headfirstname = headfirstname;
	}
	public String getHeadlastname() {
		return headlastname;
	}
	public void setHeadlastname(String headlastname) {
		this.headlastname = headlastname;
	}
	public String getHeadphonenumber() {
		return headphonenumber;
	}
	public void setHeadphonenumber(String headphonenumber) {
		this.headphonenumber = headphonenumber;
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
	public Domitory getDom() {
		return dom;
	}
	public void setDom(Domitory dom) {
		this.dom = dom;
	}
}
