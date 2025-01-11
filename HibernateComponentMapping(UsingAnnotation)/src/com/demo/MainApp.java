package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainApp {

	public static void main(String[] args) {

		Configuration c = new Configuration();
		SessionFactory sf = c.configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Employee e1 = new Employee(101, "Amit",new Address(12,"r villa","br lane","pune"));
		Employee e2 = new Employee(102, "sumit",new Address(13,"pr villa","br lane","pune"));
		
		s.save(e1);
		s.save(e2);
		t.commit();
		s.close();
		sf.close();
	}

}
