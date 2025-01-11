package com.controller;

import org.hibernate.Session;
import com.hibernate.utility.HibernateUtil;
import com.model.Gift;

public class MainApp {
    public static void main(String[] args) {

    	Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Gift gift1 = new Gift(1, "Smartphone", "Electronics", 29999.99f);
        Gift gift2 = new Gift(2, "Laptop", "Electronics", 59999.99f);
        Gift gift3 = new Gift(3, "Teddy Bear", "Toys", 499.99f);
        Gift gift4 = new Gift(4, "Action Figure", "Toys", 999.99f);
        Gift gift5 = new Gift(5, "Watch", "Accessories", 1999.99f);
        Gift gift6 = new Gift(6, "Necklace", "Accessories", 2999.99f);
        Gift gift7 = new Gift(7, "Vitamin Supplements", "HealthCare", 999.99f);
        Gift gift8 = new Gift(8, "First Aid Kit", "HealthCare", 499.99f);
        Gift gift9 = new Gift(9, "Bluetooth Speaker", "Electronics", 1999.99f);
        Gift gift10 = new Gift(10, "Board Game", "Toys", 1499.99f);

        session.save(gift1);
        session.save(gift2);
        session.save(gift3);
        session.save(gift4);
        session.save(gift5);
        session.save(gift6);
        session.save(gift7);
        session.save(gift8);
        session.save(gift9);
        session.save(gift10);

        session.getTransaction().commit();
        session.close();
        
    }
}
