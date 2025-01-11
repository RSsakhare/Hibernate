package com.controller;

import org.hibernate.Session;

import com.hibernate.utility.HibernateUtil;
import com.model.Customer1;

public class MainApp {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
		Customer1 customer1 = new Customer1(1, "John", "Doe", 500000.0f, "Pune");
		Customer1 customer2 = new Customer1(2, "Jane", "Smith", 300000.0f, "Mumbai");
		Customer1 customer3 = new Customer1(3, "David", "Lee", 700000.0f, "Delhi");
		Customer1 customer4 = new Customer1(4, "Robert", "Jones", 200000.0f, "Pune");
		Customer1 customer5 = new Customer1(5, "Sarah", "Williams", 800000.0f, "Bangalore");
		Customer1 customer6 = new Customer1(6, "Richard", "Davis", 450000.0f, "Pune");
		Customer1 customer7 = new Customer1(7, "Michael", "Brown", 150000.0f, "Chennai");
		Customer1 customer8 = new Customer1(8, "Christopher", "Johnson", 600000.0f, "Kolkata");
		Customer1 customer9 = new Customer1(9, "Daniel", "Anderson", 250000.0f, "Pune");
		Customer1 customer10 = new Customer1(10, "Paul", "Thomas", 900000.0f, "Hyderabad");
		
		session.save(customer1);
        session.save(customer2);
        session.save(customer3);
        session.save(customer4);
        session.save(customer5);
        session.save(customer6);
        session.save(customer7);
        session.save(customer8);
        session.save(customer9);
        session.save(customer10);

        session.getTransaction().commit();
        session.close();
	}

}
