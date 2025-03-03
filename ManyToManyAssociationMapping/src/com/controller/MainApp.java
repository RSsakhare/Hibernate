package com.controller;



import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.utility.HibernateUtil;
import com.model.Actor;
import com.model.Movie;

public class MainApp {

	public static void main(String[] args) {
		
		
		

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.beginTransaction();

		

		//create Movie objects
		Movie m1 = new Movie();
		m1.setMovieId(101);
		m1.setMovieName("DDLJ");
		
		Movie m2 = new Movie();
		m2.setMovieId(102);
		m2.setMovieName("Kal ho na ho");
		
		Movie m3 = new Movie();
		m3.setMovieId(103);
		m3.setMovieName("Karan Arjun");
		
		Movie m4 = new Movie();
		m4.setMovieId(104);
		m4.setMovieName("Sultan");

		//create Actor objects
		Actor a1 = new Actor();
		a1.setActorId(1);
		a1.setActorName("SRK");
		
		Actor a2 = new Actor();
		a2.setActorId(2);
		a2.setActorName("Salman");

		HashSet<Movie> hs = new HashSet<>();
		hs.add(m1);
		hs.add(m2);
		hs.add(m3);
		
		HashSet<Movie> hs1 = new HashSet<>();
		hs1.add(m3);
		hs1.add(m4);

		HashSet<Actor> hs3 = new HashSet<>();
		hs3.add(a1);
		
		HashSet<Actor> hs4 = new HashSet<>();
		hs4.add(a2);
		
		HashSet<Actor> hs5 = new HashSet<>();
		hs5.add(a1);
		hs5.add(a2);

		a1.setMovies(hs);
		a2.setMovies(hs1);
		
		m1.setActors(hs3);
		m2.setActors(hs3);
		m3.setActors(hs3);
		
		m4.setActors(hs4);
		
		m4.setActors(hs5);

		//save movies
		session.save(m1);
		session.save(m2);
		session.save(m3);
		session.save(m4);
		
		session.save(a1);
		session.save(a2);
		
		txn.commit();
		session.close();
		
	}
}
