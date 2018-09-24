package com.manage_employers.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "NS")
public class NonTeachingStaff extends Staff{

	private String ereaexpertise;

	/**
	 * 
	 */
	public NonTeachingStaff() {
		super();
	}

	/**
	 * @param sid
	 * @param sname
	 */

	/**
	 * @param ereaexpertise
	 */
	public NonTeachingStaff(int sid, String sname, String ereaexpertise) {
		super(sid, sname);
		this.ereaexpertise = ereaexpertise;
	}

	public String getEreaexpertise() {
		return ereaexpertise;
	}

	public void setEreaexpertise(String ereaexpertise) {
		this.ereaexpertise = ereaexpertise;
	}

}
