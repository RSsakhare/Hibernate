package com.criteriaEq;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.model.Employee;

public class CriteriaEx {

	public static void main(String[] args) {
		Configuration c=new Configuration();

		 SessionFactory sf=c.configure().buildSessionFactory();

		 Session s=sf.openSession();
		 //select * from Employee
		 Criteria ct = s.createCriteria(Employee.class);
		 Criterion cr = Restrictions.eq("eid", 11);
		 ct.add(cr);
		 
		 Object o = ct.uniqueResult();
		 Employee e = (Employee)o;
		 
		 System.out.println("Employee No:"+e.getEid());
		 System.out.println("Employee Name:"+e.getEname());
		 System.out.println("Employee No:"+e.getEsal());
		 
		 s.close();
		 sf.close();
	}

}
