package com.controller;

import org.hibernate.Session;

import com.hibernate.utility.HibernateUtil;
import com.model.Customer;

public class GetRecord {

	    public static void main(String[] args) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Customer customer = (Customer) session.get(Customer.class, 1); // Replace number with the actual custId
	        if (customer != null) {
	            System.out.println(customer.getCustName());
	        } else {
	            System.out.println("Customer not found");
	        }
	        session.close();
	    
	}

}
