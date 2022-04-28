package com.springboot.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springboot.domain.Patient;

@Component
public class PatientDAO {
	
	static List<Patient> patientList = new ArrayList<>(); 
	
	static {
			patientList.add(new Patient(1L, "Swathy", "9876567234", "swathy@gmail.com", "31-07-1989"));
			patientList.add(new Patient(2L, "Vanmathi", "9873877234", "vanmathi@gmail.com", "23-04-1992"));
			patientList.add(new Patient(3L, "Kevin", "9823641234", "kevin@gmail.com", "01-04-2000"));
	}
	public List<Patient> createPatient(Patient p){
		patientList.add(new Patient(p.getId(),p.getName(),p.getContactNumber(),p.getEmail(),p.getDateOfBirth()));
		return patientList;
	}
	
	public List<Patient> getPatients(){
		return patientList;
	}
	
}
