package com.art.application;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DoctorServiceAspect {
	
	
	@Before(value = "execution(* com.art.application.DoctorService.*(..)) and args(doctorId, name, experience)")
	public void beforeAdvice(JoinPoint joinPoint, String doctorId, String name, Double experience)
	{
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Creating doctor with id - " + doctorId + ", name - " + name+ "and experience - " + experience);
	}
	@Before(value = "execution(* com.art.application.DoctorService.*(..)) and args(doctorId)")
	public void beforeAdvice(JoinPoint joinPoint, String doctorId){
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Deleting doctor with id - " + doctorId);
	}

    //Fill your code
	public void log()   
	{   
		
	}  
	
	//Fill your code  
	public void aroundAdvice(ProceedingJoinPoint jp) throws Throwable   
	{  
		//Fill your code
	}  

}