package com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int meetingId;
    @Column(name = "agenda",length = 20)
    private String agenda;
    @Temporal(TemporalType.DATE)
    private Date meetingDate;
    @Column(name = "meetingTime",length = 10)
    private String meetingTime;

    @ManyToMany(mappedBy = "meetings")
    private Set<Employee> employees = new HashSet<>();

	public Meeting() {}

	public Meeting(int meetingId, String agenda, Date meetingDate, String meetingTime, Set<Employee> employees) {
		super();
		this.meetingId = meetingId;
		this.agenda = agenda;
		this.meetingDate = meetingDate;
		this.meetingTime = meetingTime;
		this.employees = employees;
	}

	// Getters and Setters
	public int getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public Date getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(Date meetingDate) {
		this.meetingDate = meetingDate;
	}

	public String getMeetingTime() {
		return meetingTime;
	}

	public void setMeetingTime(String meetingTime) {
		this.meetingTime = meetingTime;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Meeting [meetingId=" + meetingId + ", agenda=" + agenda + ", meetingDate=" + meetingDate
				+ ", meetingTime=" + meetingTime + ", employees=" + employees + "]";
	}
    
    
    
}
