package com.controller;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.utility.HibernateUtil;
import com.model.Product;

public class SaveRecord {

	public static void main(String[] args) {
		
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		
		@SuppressWarnings("deprecation")
		Product p1 = new Product(100,"milk", 50, "godavri",new Date("12/12/2012"));
		
		s.save(p1);
		
		t.commit();
		s.close();
		
	}

}
