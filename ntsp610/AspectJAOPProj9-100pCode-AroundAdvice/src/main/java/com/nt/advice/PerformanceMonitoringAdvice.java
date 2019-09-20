package com.nt.advice;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

 @Component("pmAdvice")
 @Aspect
 @Order(2)
public class PerformanceMonitoringAdvice {
	
	 @Around(value="execution(float com.nt.service.BankService.calc*(..))")
	public   Object  monitor(ProceedingJoinPoint  pjp) throws Throwable{
		long start=0,end=0;
		Object retVal=null;
		start=System.currentTimeMillis();
		retVal=pjp.proceed();
		end=System.currentTimeMillis();
		System.out.println(pjp.getSignature()+"with args"+Arrays.toString(pjp.getArgs())+" has taken"+(end-start)+" ms time");
		return retVal;
	}

}
