package com.demo;
public class PerEmp extends Employee
{
	String desig;
	String dname;
	public PerEmp() {
		super();
		// TODO Auto-generated constructor stub
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
