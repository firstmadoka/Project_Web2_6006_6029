package bean;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name="news")
public class News {
	@Id
	private Calendar newscreated = Calendar.getInstance();
	@Column(name="newstitle")
	private String newstitle;
	@Column(name="newsdiscription")
	private String newsdiscription;
	@Column(name="hints")
	private int hints;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="peopleid")
	private People people;
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	public News(Calendar newscreated, String newstitle, String newsdiscription, int hints) {
		super();
		this.newscreated = newscreated;
		this.newstitle = newstitle;
		this.newsdiscription = newsdiscription;
		this.hints = hints;
	}
	public Calendar getNewscreated() {
		return newscreated;
	}
	public void setNewscreated(Calendar newscreated) {
		this.newscreated = newscreated;
	}
	public String getNewstitle() {
		return newstitle;
	}
	public void setNewstitle(String newstitle) {
		this.newstitle = newstitle;
	}
	public String getNewsdiscription() {
		return newsdiscription;
	}
	public void setNewsdiscription(String newsdiscription) {
		this.newsdiscription = newsdiscription;
	}
	public int getHints() {
		return hints;
	}
	public void setHints(int hints) {
		this.hints = hints;
	}
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
}
