package com.controller;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.utility.HibernateUtil;
import com.model.Product;

public class GetRecord {

	public static void main(String[] args) {
	    Session s = HibernateUtil.getSessionFactory().openSession();
	    String hql="from Product where code=:code";
	    Query q =s.createQuery(hql);
	    q.setParameter("code",100); // Replace number with the actual code
	    Object o = q.uniqueResult();
	    Product e = (Product)o;
	    
	    if (e != null) {
	        System.out.println(e.getBrand()+" "+e.getName());
	    } else {
	        System.out.println("Product not found");
	    }
	    s.close();
	}

	

}




