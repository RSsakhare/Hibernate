package com.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class InstituteHistory {
    @Id
    @PrimaryKeyJoinColumn
    private int instituteId;
    @Column(name = "founder",length = 15)
    private String founder;
    @Temporal(TemporalType.DATE)
    private Date foundationDate;
    @Embedded
    private Address hoAddress;
	public InstituteHistory() {
		super();
	}
	public InstituteHistory(int instituteId, String founder, Date foundationDate, Address hoAddress) {
		super();
		this.instituteId = instituteId;
		this.founder = founder;
		this.foundationDate = foundationDate;
		this.hoAddress = hoAddress;
	}
	
	// Getters and Setters
	
	public int getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public Date getFoundationDate() {
		return foundationDate;
	}
	public void setFoundationDate(Date foundationDate) {
		this.foundationDate = foundationDate;
	}
	public Address getHoAddress() {
		return hoAddress;
	}
	public void setHoAddress(Address hoAddress) {
		this.hoAddress = hoAddress;
	}
	@Override
	public String toString() {
		return "InstituteHistory [instituteId=" + instituteId + ", founder=" + founder + ", foundationDate="
				+ foundationDate + ", hoAddress=" + hoAddress + "]";
	}
    
    
    
}

