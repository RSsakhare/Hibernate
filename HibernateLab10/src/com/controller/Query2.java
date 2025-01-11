package com.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.utility.HibernateUtil;
import com.model.Employee;
import com.model.Meeting;

import java.util.Scanner;

public class Query2 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();

        Employee employee = (Employee) session.get(Employee.class, empId);
        if (employee != null) {
            System.out.println("Meetings attended by " + employee.getEmpName() + ":");
            for (Meeting meeting : employee.getMeetings()) {
                System.out.println(meeting.getAgenda() + " on " + meeting.getMeetingDate() + " at " + meeting.getMeetingTime());
            }
        } else {
            System.out.println("Employee not found.");
        }

        tx.commit();
        session.close();
        scanner.close();
    }
}
