package com.controller;

import org.hibernate.Session;
import com.hibernate.utility.HibernateUtil;
import com.model.Address;
import com.model.Batsman;
import com.model.Bowler;

public class MainApp {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Address address1 = new Address("Street1", "City1", "Country1", "123456");
        Address address2 = new Address("Street2", "City2", "Country2", "654321");

        Batsman batsman1 = new Batsman();
        batsman1.setPlayerName("Batsman1");
        batsman1.setNumMatches(50);
        batsman1.setNumRuns(2000);
        batsman1.setResAddr(address1);

        Batsman batsman2 = new Batsman();
        batsman2.setPlayerName("Batsman2");
        batsman2.setNumMatches(30);
        batsman2.setNumRuns(1500);
        batsman2.setResAddr(address2);

        Bowler bowler1 = new Bowler();
        bowler1.setPlayerName("Bowler1");
        bowler1.setNumMatches(40);
        bowler1.setNumWickets(100);
        bowler1.setResAddr(address1);

        Bowler bowler2 = new Bowler();
        bowler2.setPlayerName("Bowler2");
        bowler2.setNumMatches(60);
        bowler2.setNumWickets(150);
        bowler2.setResAddr(address2);

        session.save(batsman1);
        session.save(batsman2);
        session.save(bowler1);
        session.save(bowler2);

        session.getTransaction().commit();
        session.close();
        
    }
}

