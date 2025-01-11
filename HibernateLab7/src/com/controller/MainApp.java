package com.controller;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.utility.HibernateUtil;
import com.model.Address;
import com.model.Institute;
import com.model.InstituteHistory;

public class MainApp {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Address address = new Address();
        address.setStreet("123 Main St");
        address.setCity("Pune");
        address.setCountry("India");
        address.setPinCode("411001");

        InstituteHistory history = new InstituteHistory();
        history.setInstituteId(1);
        history.setFounder("John Doe");
        history.setFoundationDate(new Date());
        history.setHoAddress(address);

        Institute institute = new Institute();
        institute.setInstituteId(1);
        institute.setInstituteName("ABC Institute");
        institute.setHistory(history);

        session.save(institute);
        tx.commit();
        session.close();
    }
}

