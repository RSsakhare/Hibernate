package com.demo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PermanentEmployee")
@AttributeOverrides
({ 
	@AttributeOverride(name = "eid",column=@Column(name="PId")),
	@AttributeOverride(name = "ename",column=@Column(name="PEname",length = 20)),
	@AttributeOverride(name = "esal",column=@Column(name="esal"))
})
public class PerEmp extends Employee
{
	@Column(name = "desig",length = 10)
	String desig;
	@Column(name = "dname",length = 10)
	String dname;
	public PerEmp() {
		super();
	}
	
	
	public PerEmp(int eid,String ename,int esal,String desig, String dname) {
		super(eid,ename,esal);
		this.desig = desig;
		this.dname = dname;
	}


	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "PerEmp [desig=" + desig + ", dname=" + dname + "]";
	}
	
}
