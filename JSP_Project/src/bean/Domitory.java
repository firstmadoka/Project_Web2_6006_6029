package bean;

import java.util.ArrayList;
import java.util.List;

public class Domitory {
	private String Domitoryid;
	private String Domitoryname;
	private List<Student> students = new ArrayList<Student>();
	private HeadofDom head = new HeadofDom();
	private List<News> news = new ArrayList<News>();
	public List<News> getNews() {
		return news;
	}
	public void setNews(List<News> news) {
		this.news = news;
	}
	public Domitory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HeadofDom getHead() {
		return head;
	}
	public Domitory(String domitoryid, String domitoryname) {
		super();
		Domitoryid = domitoryid;
		Domitoryname = domitoryname;
	}
	public void setHead(HeadofDom head) {
		this.head = head;
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
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
