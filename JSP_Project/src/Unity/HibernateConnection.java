package Unity;

import java.util.*;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import bean.*;

public class HibernateConnection {
	static String url = "jdbc:mysql://localhost:3308/project?characterEncoding=UTF-8";
	static String uname = "root";
	static String pwd = "root";
	public static SessionFactory sessionFactory;

	public static SessionFactory doHibernateConnection() {
		Properties database = new Properties();
		database.setProperty("hibernate.hbm2ddl.auto","create");
		database.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		database.setProperty("hibernate.connection.username", uname);
		database.setProperty("hibernate.connection.password", pwd);
		database.setProperty("hibernate.connection.url", url);
		database.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
		Configuration cfg = new Configuration().setProperties(database).addPackage("bean").addAnnotatedClass(People.class)
				.addAnnotatedClass(Types.class)
				.addAnnotatedClass(Domitory.class)
				.addAnnotatedClass(CheckDate.class)
				.addAnnotatedClass(News.class)
				.addAnnotatedClass(CreateDayLeave.class)
				.addAnnotatedClass(Leaves.class)
				.addAnnotatedClass(Room.class);
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		sessionFactory = cfg.buildSessionFactory(ssrb.build());
		return sessionFactory;
	}
}
