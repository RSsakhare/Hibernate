package com.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.utility.HibernateUtil;
import com.model.Employee;
import com.model.Meeting;

import java.util.Scanner;

public class Query3 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Meeting ID: ");
        int meetingId = scanner.nextInt();

        Meeting meeting = (Meeting) session.get(Meeting.class, meetingId);
        if (meeting != null) {
            System.out.println("Meeting Info:");
            System.out.println("Agenda: " + meeting.getAgenda());
            System.out.println("Date: " + meeting.getMeetingDate());
            System.out.println("Time: " + meeting.getMeetingTime());
            System.out.println("Attended by:");
            for (Employee employee : meeting.getEmployees()) {
                System.out.println(employee.getEmpName());
            }
        } else {
            System.out.println("Meeting not found.");
        }

        tx.commit();
        session.close();
        scanner.close();
    }
}
