package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap07.Calculator;
import chap07.ImpeCalculator;
import config.AppCtx2;
import config.AppCtx3;

public class MainAspect3 {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppCtx3.class);
	
		Calculator cal = ctx.getBean("calculator", Calculator.class);
		long fiveFact = cal.factorial(5);
		System.out.println("cal.factorial(5) = " + fiveFact);
		System.out.println(cal.getClass().getName());
		
		
		ImpeCalculator cal2 = ctx.getBean("impecalculator", ImpeCalculator.class);
		long fiveFact2 = cal2.factorial(5);
		System.out.println("cal.factorial(5) = " + fiveFact2);
		System.out.println(cal2.getClass().getName());		
		ctx.close();
	}
		
	
	
	
	
	
	
	
	

}
