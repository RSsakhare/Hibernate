package com.controller;

import org.hibernate.Session;

import com.hibernate.utility.HibernateUtil;
import com.model.Customer;

public class Query2 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        int custId = 1; // Example custId
        Customer customer = (Customer) session.get(Customer.class, custId);

        if (customer != null) {
            System.out.println("Customer Name: " + customer.getCustName());
            System.out.println("Contact Number: " + customer.getContactNum());
            System.out.println("Nationality: " + customer.getPassDetails().getNationality());
            System.out.println("Passport Number: " + customer.getPassDetails().getPassportNo());
        } else {
            System.out.println("Customer not found!");
        }

        session.close();
    }
}
