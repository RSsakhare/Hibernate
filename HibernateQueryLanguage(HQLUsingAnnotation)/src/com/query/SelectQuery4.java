package com.query;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class SelectQuery4 {

	public static void main(String[] args) {

		Configuration c = new Configuration();
		SessionFactory sf = c.configure().buildSessionFactory();
		Session s = sf.openSession();
		
		String hql="from Employee where eid=?";
		Query q =s.createQuery(hql);
		q.setParameter(0,3);
		Object o = q.uniqueResult();
		Employee e = (Employee)o;
		
		System.out.println("Employee No:"+e.getEid());
		System.out.println("Employee Name:"+e.getEname());
		System.out.println("Employee No:"+e.getEsal());
		
		s.close();
		sf.close();
	}

}
