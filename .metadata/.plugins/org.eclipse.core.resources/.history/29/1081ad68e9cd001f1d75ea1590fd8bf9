package com.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.utility.HibernateUtil;

public class GetAllRecords {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		String hql = "select giftName from Gift";
		Query q = session.createQuery(hql);
		@SuppressWarnings("unchecked")
		List <String> lst = q.list();
		
		System.out.println("Gifts name are :");
		for(String str:lst)
		{
			System.out.println(str);
		}
		session.close();
	}
}