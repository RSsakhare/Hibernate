package com.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.utility.HibernateUtil;
import com.model.Director;
import com.model.Movie;

import java.util.Date;
import java.util.Scanner;

public class Query3 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Director ID: ");
        int directorId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Director director = (Director) session.get(Director.class, directorId);
        if (director != null) {
            System.out.print("Enter Movie Name: ");
            String movieName = scanner.nextLine();
            System.out.print("Enter Movie Budget: ");
            float budget = scanner.nextFloat();

            Movie newMovie = new Movie();
            newMovie.setMovieName(movieName);
            newMovie.setReleaseDate(new Date());
            newMovie.setBudget(budget);
            newMovie.setDir(director);

            director.getMovies().add(newMovie);
            session.save(newMovie);
            session.update(director);

            System.out.println("Movie added successfully.");
        } else {
            System.out.println("Director not found.");
        }

        tx.commit();
        session.close();
        scanner.close();
    }
}
