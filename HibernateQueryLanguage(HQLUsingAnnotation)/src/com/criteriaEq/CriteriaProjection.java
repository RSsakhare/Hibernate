package com.criteriaEq;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.model.Employee;

public class CriteriaProjection {

	public static void main(String[] args) {
		
		Configuration c=new Configuration();

		 SessionFactory sf=c.configure().buildSessionFactory();

		 Session s=sf.openSession();
		 //select * from Employee
		 Criteria ct = s.createCriteria(Employee.class);
		 Projection p = Projections.property("ename");
		 ct.setProjection(p);
		 @SuppressWarnings("unchecked")
		List<String> lst = ct.list();
		 System.out.println("Employee names are:");
		 for(String str:lst)
		 {
			 System.out.println(str);
		 }
		 
		 s.close();
		 sf.close();
	}

}
