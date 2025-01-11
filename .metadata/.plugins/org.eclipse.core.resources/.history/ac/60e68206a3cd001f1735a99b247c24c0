package com.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.utility.HibernateUtil;
import com.model.Customer;
import com.model.Address;
import java.util.Date;

public class SaveRecord {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Address address1 = new Address();
        address1.setStreet("Street 1");
        address1.setCity("City 1");
        address1.setCountry("Country 1");
        address1.setPinCode("123456");

        Customer customer1 = new Customer();
        customer1.setCustName("Customer 1");
        customer1.setContactNo("1234567890");
        customer1.setBirthDate(new Date());
        customer1.setResAddr(address1);

        Address address2 = new Address();
        address2.setStreet("Street 2");
        address2.setCity("City 2");
        address2.setCountry("Country 2");
        address2.setPinCode("654321");

        Customer customer2 = new Customer();
        customer2.setCustName("Customer 2");
        customer2.setContactNo("0987654321");
        customer2.setBirthDate(new Date());
        customer2.setResAddr(address2);

        Address address3 = new Address();
        address3.setStreet("Street 3");
        address3.setCity("City 3");
        address3.setCountry("Country 3");
        address3.setPinCode("112233");

        Customer customer3 = new Customer();
        customer3.setCustName("Customer 3");
        customer3.setContactNo("1122334455");
        customer3.setBirthDate(new Date());
        customer3.setResAddr(address3);

        session.save(customer1);
        session.save(customer2);
        session.save(customer3);

        transaction.commit();
        session.close();
    }
}
