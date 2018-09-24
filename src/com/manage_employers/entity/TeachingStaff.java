package com.manage_employers.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="TS")

public class TeachingStaff extends Staff {

	private String qualification;
	private String subjectexpertise;
	public TeachingStaff(int sid, String sname,String qualification, String subjectexpertise) {
		super(sid, sname);
		this.qualification = qualification;
		this.subjectexpertise = subjectexpertise;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSubjectexpertise() {
		return subjectexpertise;
	}
	public void setSubjectexpertise(String subjectexpertise) {
		this.subjectexpertise = subjectexpertise;
	}
	public TeachingStaff() {
		super();
	}


	
	
   
}
