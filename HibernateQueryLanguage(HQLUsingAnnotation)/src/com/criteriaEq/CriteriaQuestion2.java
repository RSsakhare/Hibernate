package com.criteriaEq;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.model.Employee;

public class CriteriaQuestion2 {

	public static void main(String[] args) {

		Configuration c=new Configuration();

		 SessionFactory sf=c.configure().buildSessionFactory();

		 Session s=sf.openSession();
		 //select * from Employee
		 Criteria ct = s.createCriteria(Employee.class);
		 ProjectionList plist = Projections.projectionList();
		 plist.add(Projections.property("eid"));
		 plist.add(Projections.property("ename"));
		 plist.add(Projections.property("esal"));

		 ct.setProjection(plist);
		 
		 @SuppressWarnings("unchecked")
		 List<Object> lst = ct.list();
		 System.out.println("Employee details are:");
		 
		 for(Object o:lst)
		 {
			 Object ar[] = (Object[])o;
			 System.out.println(ar[0]+"\n"+ar[1]+"\n"+ar[2]);
		 }
		 
		 s.close();
		 sf.close();
	}

}
