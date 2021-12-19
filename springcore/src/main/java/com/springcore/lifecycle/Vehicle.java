package com.springcore.lifecycle;

public class Vehicle {

	private String vehicleType;

	private int price;

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {

		System.out.println("Setting Vehicle Type: " + vehicleType);
		this.vehicleType = vehicleType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting Price: " + price);
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleType=" + vehicleType + ", price=" + price + "]";
	}

	public void init() {
		System.out.println("Inside init method");
	}

	public void destroy() {
		System.out.println("Inside destroy method");
	}

}
