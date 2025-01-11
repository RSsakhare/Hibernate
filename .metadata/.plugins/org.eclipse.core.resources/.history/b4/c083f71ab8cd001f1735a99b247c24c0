package com.controller;

import org.hibernate.Session;
import com.hibernate.utility.HibernateUtil;
import com.model.PrimaryStudent;
import com.model.SecondaryStudent;
import com.model.Student;

import java.util.Scanner;

public class GetRecord {
    public static void main(String[] args) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int rollno = scanner.nextInt();

        Student student = (Student) session.get(Student.class, rollno);
        if (student != null) {
            System.out.println("Roll Number: " + student.getRollno());
            System.out.println("Student Name: " + student.getStudentName());
            System.out.println("Admission Date: " + student.getAdmissionDate());
            System.out.println("Address: " + student.getPerAddr().getStreet() + ", " + student.getPerAddr().getCity() + ", " + student.getPerAddr().getCountry() + ", " + student.getPerAddr().getPinCode());

            if (student instanceof PrimaryStudent) {
                System.out.println("Grade: " + ((PrimaryStudent) student).getGrade());
            } else if (student instanceof SecondaryStudent) {
                System.out.println("Percentage: " + ((SecondaryStudent) student).getPercentage());
            }
        } else {
            System.out.println("Student not found!");
        }
        
        scanner.close();
        session.getTransaction().commit();
        session.close();
        
    }
}


