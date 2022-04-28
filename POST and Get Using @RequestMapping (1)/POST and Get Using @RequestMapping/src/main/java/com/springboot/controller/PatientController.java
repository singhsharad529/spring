package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dao.PatientDAO;
import com.springboot.domain.Patient;


@RestController
public class PatientController {
	
	@Autowired
	private PatientDAO patientDao;
	@RequestMapping(value="/patient/list",method = RequestMethod.GET )
	public List<Patient> listPatients(){
		
		List<Patient> list = patientDao.getPatients();
		return list;		
	}
	@RequestMapping(value="/patient/create",method = RequestMethod.POST )
	List<Patient> createPatient(@RequestBody Patient patient){
		
		List<Patient> list = patientDao.createPatient(patient);
		return list;
		
	}
	
}
