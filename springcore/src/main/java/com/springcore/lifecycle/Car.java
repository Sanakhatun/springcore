package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 
 * @author sana 
 * Learning Bean Lifecycle using interfaces 
 * 1. InitializingBean 2. DisposableBean
 *
 */

public class Car implements InitializingBean, DisposableBean {

	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", modelName=" + modelName + ", price=" + price + "]";
	}

	private String modelNumber;

	private String modelName;

	private int price;

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		System.out.println("Initializing modelNumber property: " + modelNumber);
		this.modelNumber = modelNumber;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		System.out.println("Initializing modelName property: " + modelName);
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Initializing Price property: " + price);
		this.price = price;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Car Started");

	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Car Stopped");

	}

}
