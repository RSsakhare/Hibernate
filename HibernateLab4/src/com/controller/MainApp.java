package com.controller;

import java.util.Date;

import org.hibernate.*;
import com.hibernate.utility.HibernateUtil;
import com.model.Address;
import com.model.PrimaryStudent;
import com.model.SecondaryStudent;

public class MainApp {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Address address1 = new Address("Street1", "City1", "Country1", "123456");
        Address address2 = new Address("Street2", "City2", "Country2", "654321");

        PrimaryStudent ps = new PrimaryStudent();
        ps.setStudentName("Primary Student");
        ps.setAdmissionDate(new Date());
        ps.setGrade("A");
        ps.setPerAddr(address1);

        SecondaryStudent ss = new SecondaryStudent();
        ss.setStudentName("Secondary Student");
        ss.setAdmissionDate(new Date());
        ss.setPercentage(85.5f);
        ss.setPerAddr(address2);

        session.save(ps);
        session.save(ss);

        session.getTransaction().commit();
        session.close();
        
    }
}


