package com.model;

import javax.persistence.*;

@Entity
public class Institute {
    @Id
    private int instituteId;
    @Column(name = "instituteName",length = 25)
    private String instituteName;
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private InstituteHistory history;
	public Institute() {
		super();
	}
	public Institute(int instituteId, String instituteName, InstituteHistory history) {
		super();
		this.instituteId = instituteId;
		this.instituteName = instituteName;
		this.history = history;
	}
	 // Getters and Setters
	public int getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public InstituteHistory getHistory() {
		return history;
	}
	public void setHistory(InstituteHistory history) {
		this.history = history;
	}
	@Override
	public String toString() {
		return "Institute [instituteId=" + instituteId + ", instituteName=" + instituteName + ", history=" + history
				+ "]";
	}
    
   
	
}

