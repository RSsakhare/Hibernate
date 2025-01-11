package com.controller;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.utility.HibernateUtil;
import com.model.Product;

public class DeleteRecord {

	
	    public static void main(String[] args) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction transaction = session.beginTransaction();

	        Product p1 = (Product) session.get(Product.class, 100); // Replace number with the actual code
	        session.delete(p1);

	        transaction.commit();
	        session.close();
	   }
	}
