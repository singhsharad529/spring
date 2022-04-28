package com.art.application;

import org.springframework.stereotype.Service;

@Service
public class DoctorService {

	public Doctor createDoctor(String doctorId, String name, Double experience) {
		Doctor d=new Doctor();
		d.setId(doctorId);
		d.setName(name);
		d.setExperience(experience);
	return d;
	}
	
	public String deleteDoctor(String doctorId){
		return "Doctor removed";
	}	
	

    public void displayDoctor(String doctorId) {
		//Fill your code
	}
}