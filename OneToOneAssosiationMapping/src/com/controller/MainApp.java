package com.controller;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.utility.HibernateUtil;
import com.model.Employee;
import com.model.EmployeeDetails;

public class MainApp {

	public static void main(String[] args) {
		
		
		

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction txn = session.beginTransaction();

		//create both objects
		EmployeeDetails eDetail = new EmployeeDetails(101, "10th Street","LA", "San Francisco", "U.S.",null);

		@SuppressWarnings("deprecation")
		Employee emp = new Employee(101, "Nina", "Mayers",new Date("2010/03/04"), "114-857-965",null);

		//set each other's references
		emp.setEmployeeDetail(eDetail);
		eDetail.setEmployee(emp);

		//save
		session.save(emp);
		txn.commit();
		session.close();
		
	}

}
