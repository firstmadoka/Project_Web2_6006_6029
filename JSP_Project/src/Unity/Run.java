package Unity;

import java.util.Calendar;

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
			Calendar c1 = Calendar.getInstance();
			c1.set(1998, 01, 11);
			People p1 = new People("6004106306","chanaphat","jeensawat","0864395619",c1,"215");
			People p2 = new People("1234567890","SomJai","Jaidee","086699969",c1,null);
			Types t1 = new Types("1","Student");
			Types t2 = new Types("2","Header");
			Domitory dom1 = new Domitory("7","Srikraseat");
			p1.setType(t1);
			p1.setDomitory(dom1);
			p2.setType(t2);
			p2.setDomitory(dom1);
			session.save(p1);
			session.save(p2);
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
