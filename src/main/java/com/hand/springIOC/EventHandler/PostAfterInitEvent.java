package com.hand.springIOC.EventHandler;

import org.springframework.beans.factory.config.BeanPostProcessor; 
import org.springframework.beans.BeansException;
public class PostAfterInitEvent implements BeanPostProcessor 
{ 
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Log:BeforeInitialization : " + beanName); 
		return bean;  // you can return any other object as well
		
	} public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException { 
		System.out.println("Log:AfterInitialization : " + beanName); 
		return bean;  // you can return any other object as well
		
	} 
}
	

