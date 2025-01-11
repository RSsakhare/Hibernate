package com.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.utility.HibernateUtil;

public class GetRecordBySelect {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
       
		
		Query query= session.createQuery("select giftName, price from Gift");
		@SuppressWarnings("unchecked")
		List<Object[]> gifts = query.list();
		for(Object[] gift: gifts )
		{
			System.out.println("Name: " + gift[0] + ", Price: " + gift[1]);
		}
		
		
		@SuppressWarnings("unchecked")
		List <String> lst = query.list();
		for(Object o:lst)
		{
			Object ar[] = (Object[])o; 
			for(Object e:ar)
			{
				System.out.println(e);
			}
		}
		session.close();

	}

}
