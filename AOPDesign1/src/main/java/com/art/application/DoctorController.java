package com.art.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.springboot.model.Doctor;
//import com.springboot.service.DoctorService;

@RestController
public class DoctorController {
	
	@Autowired
	private DoctorService service;
	
	@RequestMapping(value = "/add/doctor", method = RequestMethod.GET)
	public Doctor addDoctor(@RequestParam("doctorId") String doctorId, @RequestParam("name") String name, @RequestParam("experience") String experience) {
		return service.createDoctor(doctorId, name, Double.parseDouble(experience));
	}
	
	@RequestMapping(value = "/remove/doctor", method = RequestMethod.GET)
	public String removeDoctor( @RequestParam("doctorId") String doctorId)
	{
		return service.deleteDoctor(doctorId);
	}
	
	//Fill your code
	public void displayDoctor(@RequestParam("doctorId") String doctorId) {

		//Fill your code

	}



}