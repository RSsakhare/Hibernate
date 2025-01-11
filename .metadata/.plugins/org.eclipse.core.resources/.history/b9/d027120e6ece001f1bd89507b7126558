package com.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.hibernate.utility.HibernateUtil;
import com.model.Customer1;

public class Query2 {

	 public static void main(String[] args) {
	        
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        // Select * from Customer1 where city = 'Pune'
	        Criteria ct = session.createCriteria(Customer1.class);
	        Criterion cr = Restrictions.between("annualSal", 250000f,750000f);
	        ct.add(cr);
	        
	        @SuppressWarnings("unchecked")
			List<Customer1> customers = ct.list();
	        
	        for (Customer1 c : customers) {
	            System.out.println("Customer1 FirstName: " + c.getFirstName());
	            System.out.println("Customer1 LastName: " + c.getLastName());
	            System.out.println("Customer1 AnnualSal: " + c.getAnnualSal());
	        }
	        
	        session.close();
	    }

}
