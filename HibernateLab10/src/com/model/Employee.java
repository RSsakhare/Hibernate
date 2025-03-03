package com.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Employee23")
public class Employee {
    @Id
    
    private int empId;
    @Column(name = "empName",length = 20)
    private String empName;
    @Temporal(TemporalType.DATE)
    private Date jdate;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "Employee_Meeting",
        joinColumns = @JoinColumn(name = "empId"),
        inverseJoinColumns = @JoinColumn(name = "meetingId")
    )
    private Set<Meeting> meetings = new HashSet<>();

	public Employee() {	}

	public Employee(int empId, String empName, Date jdate, Set<Meeting> meetings) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.jdate = jdate;
		this.meetings = meetings;
	}
	
	// Getters and Setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getJdate() {
		return jdate;
	}

	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}

	public Set<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(Set<Meeting> meetings) {
		this.meetings = meetings;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", jdate=" + jdate + ", meetings=" + meetings
				+ "]";
	}

    
    
}


