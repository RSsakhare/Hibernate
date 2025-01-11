package com.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class SecondaryStudent extends Student 
{
    private float percentage;

	public SecondaryStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SecondaryStudent(int rollno, String studentName, Date admissionDate, Address perAddr,float percentage) {
		super(rollno, studentName, admissionDate, perAddr);
		this.percentage=percentage;
	}
	
    // Getters and Setters

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
    
    
	
}

