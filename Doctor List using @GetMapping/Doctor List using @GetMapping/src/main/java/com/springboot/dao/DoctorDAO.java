package com.springboot.dao;

import java.util.*;
import org.springframework.stereotype.Component;

import com.springboot.domain.Doctor;

@Component
public class DoctorDAO {
		
	static List<Doctor> doctorList = new ArrayList<>(); 

	static {
		doctorList.add(new Doctor(1, "Elizabeth", "MBBS", 4.2, "Cardiologist",750.0));
		doctorList.add(new Doctor(2, "Michael", "MBBS", 2.0, "Dermatologist",1500.0));
		doctorList.add(new Doctor(3, "Charlotte", "MBBS", 3.1, "Pediatrics",200.0));
		doctorList.add(new Doctor(4, "Lucas", "BDS", 1.9, "Dentist",250.0));
	}
	public List<Doctor> list() {
		
		return doctorList;		
	}
	
}
