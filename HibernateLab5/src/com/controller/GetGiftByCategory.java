package com.controller;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.utility.HibernateUtil;
import com.model.Gift;

public class GetGiftByCategory {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter category to search:");
        String category = scanner.nextLine();

        // Use HQL to search by category name
        Query query = session.createQuery("FROM Gift WHERE category = :category");
        query.setParameter("category", category);
        @SuppressWarnings("unchecked")
		List<Gift> gifts = query.list();

        if (!gifts.isEmpty()) {
            System.out.println("Gifts in category '" + category + "':");
            for (Gift gift : gifts) {
                System.out.println(gift.getGiftId() + " " + gift.getCategory() + " " + gift.getGiftName() + " " + gift.getPrice());
            }
        } else {
            System.out.println("No gifts found in category '" + category + "'");
        }

        scanner.close();
        session.close();
    }
}