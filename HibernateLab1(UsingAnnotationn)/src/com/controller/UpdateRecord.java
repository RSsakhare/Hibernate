package com.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.utility.HibernateUtil;
import com.model.Product;

public class UpdateRecord {

	
	    public static void main(String[] args) {
	        Session s = HibernateUtil.getSessionFactory().openSession();
	        Transaction t = s.beginTransaction();

	        Product product = (Product) s.get(Product.class, 100); // Replace number with the actual code
	        product.setPrice(product.getPrice() * 0.9); // Apply 10% discount

	        s.update(product);
	        t.commit();
	        s.close();
	    
	}

}
