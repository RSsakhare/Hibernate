package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp 
{
public static void main(String[] args) 
{
		Configuration c= new Configuration();
		SessionFactory sf = c.configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Employee e1 = new Employee(101, "Amit",17000);
		PerEmp e2 = new PerEmp(102, "sumit", 18500, "Manager", "Sales");
		TempEmp e3 = new TempEmp(103,"Ajit",19000 , 130, "Accenture");
		
		
		s.save(e1);
		s.save(e2);
		s.save(e3);
		
		t.commit();
		
		s.close();
		sf.close();
	}

}
