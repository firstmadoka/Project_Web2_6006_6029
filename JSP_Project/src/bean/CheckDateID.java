package bean;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
@Embeddable
public class CheckDateID implements Serializable {
	@ManyToOne
	private People people;

	public CheckDateID() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CheckDateID(People people) {
		super();
		this.people = people;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}
}
