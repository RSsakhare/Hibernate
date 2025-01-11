package com.controller;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.utility.HibernateUtil;
import com.model.Gift;

public class GetGiftnameAndPriceInRange {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter minimum price:");
        float minPrice = scanner.nextFloat();
        System.out.println("Enter maximum price:");
        float maxPrice = scanner.nextFloat();
        
        Query query  = session.createQuery("FROM Gift WHERE price BETWEEN :minPrice AND :maxPrice");
        query.setParameter("minPrice", minPrice);
        query.setParameter("maxPrice", maxPrice);
        @SuppressWarnings("unchecked")
		List<Gift> gifts = query.list();

        System.out.println("Gift Name and Price within price range:");
        gifts.forEach(gift -> System.out.println("Name: " + gift.getGiftName()+ ", Price: " + gift.getPrice()));

       scanner.close();
       session.close();
       

	}

}
