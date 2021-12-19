package com.springcore.lifecycle;

/*import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;*/

public class Bus {
	
	private int Id;
	
	private String name;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bus [Id=" + Id + ", name=" + name + "]";
	}
	
	/*
	 * Working code but due to build path issue it is commented, uncomment later.
	 * 
	 * @PostConstruct public void start() {
	 * System.out.println("Bus started running"); }
	 * 
	 * @PreDestroy public void stop() {
	 * System.out.println("Bus stopped on station"); }
	 */

}
