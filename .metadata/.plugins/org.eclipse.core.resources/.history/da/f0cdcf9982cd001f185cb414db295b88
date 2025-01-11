package com.demo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TemporaryEmployee")
@AttributeOverrides
({ 
	@AttributeOverride(name = "eid",column=@Column(name="TId")),
	@AttributeOverride(name = "ename",column=@Column(name="TEname",length = 10)),
	@AttributeOverride(name = "esal",column=@Column(name="esal"))
})
public class TempEmp extends Employee 
{
	@Column(name="workdays",length = 5)
	int workdays;
	@Column(name = "cname",length = 10)
	String cname;
	public TempEmp() {
		super();
		
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
