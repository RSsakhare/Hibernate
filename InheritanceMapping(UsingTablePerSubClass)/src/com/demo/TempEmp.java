package com.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="TemporaryEmployee1")
@PrimaryKeyJoinColumn(name = "T_ID")
public class TempEmp extends Employee 
{
	@Column(name="workdays",length = 5)
	int workdays;
	@Column(name = "cname",length = 10)
	String cname;
	public TempEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public TempEmp(int eid,String ename,int esal,int workdays, String cname) {
		super(eid,ename,esal);
		this.workdays = workdays;
		this.cname = cname;
	}




	public int getWorkdays() {
		return workdays;
	}
	public void setWorkdays(int workdays) {
		this.workdays = workdays;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "TempEmp [workdays=" + workdays + ", cname=" + cname + "]";
	}
	
}
