package com.controller;

import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;
import java.util.List;
import com.hibernate.utility.HibernateUtil;
import com.model.Customer1;

public class Query1 {

    public static void main(String[] args) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        // Select * from Customer1 where city = 'Pune'
        Criteria ct = session.createCriteria(Customer1.class);
        Criterion cr = Restrictions.eq("city", "Pune");
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
