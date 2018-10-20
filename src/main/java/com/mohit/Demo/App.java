package com.mohit.Demo;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//    	Car car = new Car();
//    	car.drive();
    	
//    	Bike obj = new Bike();
//    	obj.drive();
    	
//    	Vehicle veh = new Bike();
//    	veh.drive();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	Vehicle obj = (Vehicle)context.getBean("car");
//    	Vehicle obj2 = (Vehicle)context.getBean("bike");
//    	obj.drive();
//    	obj2.drive();
    	
//    	Tyre t = (Tyre)context.getBean("tyre");
//    	System.out.println(t);
    	
    	Car obj = (Car)context.getBean("car");
    	obj.drive();
    }
}
