package com.controller;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.utility.HibernateUtil;
import com.model.Address;
import com.model.Customer;
import com.model.PassportDetails;

public class MainApp {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Address address = new Address();
        address.setStreet("456 Elm St");
        address.setCity("Pune");
        address.setCountry("India");
        address.setPinCode("411002");

        Customer customer = new Customer();
        customer.setCustId(1);
        customer.setCustName("Jane Doe");
        customer.setContactNum(9876543210l);
        customer.setCustAddress(address);

        PassportDetails passportDetails = new PassportDetails();
        passportDetails.setPassportNo(123456789);
        passportDetails.setFirstName("Jane");
        passportDetails.setLastName("Doe");
        passportDetails.setDob(new Date());
        passportDetails.setGender("Female");
        passportDetails.setNationality("Indian");
        passportDetails.setCountryCode("IN");
        passportDetails.setExpiryDate(new Date());
        passportDetails.setIssueDate(new Date());
        passportDetails.setBirthplace("Pune");
        passportDetails.setCust(customer);

        customer.setPassDetails(passportDetails);

        session.save(customer);
        tx.commit();
        session.close();
    }
}



