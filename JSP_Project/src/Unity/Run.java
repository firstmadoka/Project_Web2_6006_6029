package Unity;

import java.text.SimpleDateFormat;
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
