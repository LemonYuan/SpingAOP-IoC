package com.hand.springIOC.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	@Pointcut("execution(* com.hand.springIOC.entity.*.*(..))")
	private void selectAll(){}
	
	@Pointcut("execution(* com.hand.springIOC.entity.Student.*(..))")
	private void studentPointcut(){}
	
	@Before("selectAll()") 
   public void doBefore()
   {
	   System.out.println("=====selectAll:before action=====");
   }
	
	@After("selectAll()") 
   public void doAfter()
   {
	   System.out.println("=====selectAll:after action=====");
   }
	
	@After("studentPointcut()")
	public void special(){
		System.out.println("=====justBefore:test=====");
	}
   public void doAfterReturning()
   {
	   System.out.println("after action returning");
   }
   public void doAfterException()
   {
	   System.out.println("after throwing exception");
   }
}
