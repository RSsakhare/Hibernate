package com.controller;

import org.hibernate.Session;

import com.hibernate.utility.HibernateUtil;

public class CheapestAndExpensivreGift {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Object[] result = (Object[]) session.createQuery("select min(price), max(price), count(*) from Gift").uniqueResult();
		System.out.println("Cheapest Price: " + result[0]);
		System.out.println("Most Expensive Price: " + result[1]);
		System.out.println("Total Number of Gifts: " + result[2]);

		session.close();

	}

}
