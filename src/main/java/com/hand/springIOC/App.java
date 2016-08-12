package com.hand.springIOC;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.springIOC.entity.Person;
import com.hand.springIOC.entity.Student;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
         Person p=(Person) context.getBean("person");
         Student s=(Student) context.getBean("student");
         context.registerShutdownHook();
         p.sayHello();
         p.introduceYourself();
         System.out.println('\n');
         s.introduceYourself();
    }
}
