package com.demo;
public class TempEmp extends Employee 
{
	int workdays;
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
