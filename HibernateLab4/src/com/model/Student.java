package com.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rollno;
    @Column(name = "studentName",length = 20)
    private String studentName;
    @Temporal(TemporalType.DATE)
    @Column(name = "admissionDate")
    private Date admissionDate;

    @Embedded
    private Address perAddr;
    
    
    public Student() {
		super();
	}

	public Student(int rollno, String studentName, Date admissionDate, Address perAddr) {
		super();
		this.rollno = rollno;
		this.studentName = studentName;
		this.admissionDate = admissionDate;
		this.perAddr = perAddr;
	}

	// Getters and Setters

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Address getPerAddr() {
		return perAddr;
	}

	public void setPerAddr(Address perAddr) {
		this.perAddr = perAddr;
	}

    
}

