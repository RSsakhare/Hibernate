package com.query;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateQuery {

	public static void main(String[] args) {

		Configuration c = new Configuration();
		SessionFactory sf = c.configure().buildSessionFactory();
		Session s = sf.openSession();

		Transaction tx = s.beginTransaction();
		
		   
		    String hql = "update Employee set ename='vijay' where eid=10";
		    Query q = s.createQuery(hql);
		    int result = q.executeUpdate();
		    tx.commit();
		    System.out.println("Rows affected: " + result);
		
		    s.close();
		    sf.close();
		

		
		
	}

}
