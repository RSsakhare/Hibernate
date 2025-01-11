package com.controller;

import org.hibernate.Session;

import com.hibernate.utility.HibernateUtil;
import com.model.Institute;

public class Query2 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        int instituteId = 1; // Example instituteId
        Institute institute = (Institute) session.get(Institute.class, instituteId);

        if (institute != null) {
            System.out.println("Institute Name: " + institute.getInstituteName());
            System.out.println("Founder: " + institute.getHistory().getFounder());
            System.out.println("City: " + institute.getHistory().getHoAddress().getCity());
            System.out.println("Country: " + institute.getHistory().getHoAddress().getCountry());
        } else {
            System.out.println("Institute not found!");
        }

        session.close();
    }
}

