package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycle_config.xml");
		Vehicle vehicle = (Vehicle) context.getBean("vehicle");
		System.out.println(vehicle);

		/* Registering Shutdown hook */
		context.registerShutdownHook();
		
		
		Car car = (Car) context.getBean("car");
		System.out.println(car);
		
		Bus bus = (Bus) context.getBean("bus");
		System.out.println(bus);
		

	}

}
