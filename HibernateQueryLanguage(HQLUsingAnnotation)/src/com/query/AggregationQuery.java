package com.query;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AggregationQuery {

	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		SessionFactory sf = c.configure().buildSessionFactory();
		Session s = sf.openSession();

		Transaction tx = s.beginTransaction();
		
		   
		    String hql = "select avg(esal)from Employee";
		    Query q = s.createQuery(hql);
		    double avg = (double)q.uniqueResult();

		    System.out.println("Average Salary: " +avg);
		    tx.commit();
		    s.close();
		    sf.close();
	}

}
