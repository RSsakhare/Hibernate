package com.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class PrimaryStudent extends Student 
{
	@Column(name = "grade",length = 5)
    private String grade;

	public PrimaryStudent() {
		super();
		
	}

	public PrimaryStudent(int rollno, String studentName, Date admissionDate, Address perAddr,String grade) {
		super(rollno, studentName, admissionDate, perAddr);
		this.grade=grade;
	}
	
    // Getters and Setters

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "PrimaryStudent [grade=" + grade + ", getRollno()=" + getRollno() + ", getStudentName()="
				+ getStudentName() + ", getAdmissionDate()=" + getAdmissionDate() + ", getPerAddr()=" + getPerAddr()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
	
}



