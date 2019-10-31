package Unity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import bean.*;

public class Run {
	public static void main(String[] args) {
		SessionFactory sesionFactory = HibernateConnection.doHibernateConnection();
		Session session = sesionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			String dateInString = "11-01-1998";
			Date date = sdf.parse(dateInString);
			People p1 = new People("6004106306","chanaphat","jeensawat","0864395619",date,"215");
			People p2 = new People("1234567890","SomJai","Jaidee","086699969",date,null);
			Types t1 = new Types("1","Student");
			Types t2 = new Types("2","Header");
			Domitory dom1 = new Domitory("7","Srikraseat");
			session.save(dom1);
			p1.setType(t1);
			Room r1 = new Room();
			RoomID rid1 = new RoomID();
			rid1.setPeople(p1);
			rid1.setDom(dom1);;
			r1.setPk(rid1);
			r1.setRoomid("201");
			p2.setType(t2);
			Room r2 = new Room();
			RoomID rid2 = new RoomID();
			rid2.setPeople(p2);
			rid2.setDom(dom1);
			r2.setPk(rid2);
			session.save(p1);
			session.save(p2);
			CheckDate c1 = new CheckDate();
			Calendar dc = Calendar.getInstance();
			c1.setDatechk(dc);
			CheckDateID ck1id = new CheckDateID();
			ck1id.setPeople(p1);
			c1.setPk(ck1id);
			c1.setStatus("Stay");
			session.save(c1);
			News n1 = new News();
			Calendar dn = Calendar.getInstance();
			n1.setNewsid("1");
			n1.setHints(0);
			n1.setNewscreated(dn);
			n1.setNewsdiscription("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			n1.setNewstitle("Test");
			n1.setPeople(p2);
			session.save(n1);
			CreateDayLeave cdl1 = new CreateDayLeave();
			cdl1.setDayleaveid("1");
			cdl1.setCheckout(new Date());
			cdl1.setCheckout(new Date());
			cdl1.setPeople(p2);
			session.save(cdl1);
			Leaves l1 = new Leaves();
			l1.setCheckin(new Date());
			l1.setCheckout(new Date());
			l1.setDetail("Go Home!!!!!!!");
			LeaveID lid1 = new LeaveID();
			lid1.setDayleave(cdl1);
			lid1.setPeople(p1);
			l1.setPk(lid1);
			session.save(l1);
			session.save(r1);
			session.save(r2);
			tx.commit();
			
			System.out.println("insert successfully!!");
		}catch(Exception e) {
			if(tx != null)
				tx.rollback();
			System.out.println("insert failed!!");
		}finally {
			session.close();
		}
		sesionFactory.close();
		
	}
}
