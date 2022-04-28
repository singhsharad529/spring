package com.art.application;

public class Doctor {
	
	private String doctorId;
	private String name;
	private Double experience;
		
	public Doctor() {}
	
	public String getId() {
		return doctorId;
	}
	public void setId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getExperience() {
		return experience;
	}
	public void setExperience(Double experience) {
		this.experience = experience;
	}
	
	
}
