package bean;

import java.util.Calendar;

public class News {
	private String newstitle;
	private String newsdiscription;
	private Calendar newscreated = Calendar.getInstance();
	private int hints;
	private Domitory dom = new Domitory();
	private HeadofDom headdom = new HeadofDom();
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	public News(String newstitle, String newsdiscription, Calendar newscreated, int hints) {
		super();
		this.newstitle = newstitle;
		this.newsdiscription = newsdiscription;
		this.newscreated = newscreated;
		this.hints = hints;
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
	public Calendar getNewscreated() {
		return newscreated;
	}
	public void setNewscreated(Calendar newscreated) {
		this.newscreated = newscreated;
	}
	public int getHints() {
		return hints;
	}
	public void setHints(int hints) {
		this.hints = hints;
	}
	public Domitory getDom() {
		return dom;
	}
	public void setDom(Domitory dom) {
		this.dom = dom;
	}
	public HeadofDom getHeaddom() {
		return headdom;
	}
	public void setHeaddom(HeadofDom headdom) {
		this.headdom = headdom;
	}
}
