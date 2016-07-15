package jpl.code.examples.aspject;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PrinterAspect {

	@Before("execution (* jpl.code.examples.aspject.Printer.getNumber())")
	public void beforeGetNumber(JoinPoint joinPoint) {
		
		System.out.println("**[Before method] " + joinPoint.getSignature().getName() );
	}
	
	
	@AfterReturning(value="execution (* jpl.code.examples.aspject.Printer.getNumber())", returning="number")
	public void afterReturningGetNumber(JoinPoint joinPoint, int number) {
		
		System.out.println("**[after method] " + joinPoint.getSignature().getName() +" method returns " + number );
	}
	
}
