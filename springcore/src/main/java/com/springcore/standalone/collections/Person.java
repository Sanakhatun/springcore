package com.springcore.standalone.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class Person {

	private List<String> friendList;

	private HashMap<String, Integer> pincodeMap;

	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<String> getFriendList() {
		return friendList;
	}

	public void setFriendList(List<String> friendList) {
		this.friendList = friendList;
	}

	public HashMap<String, Integer> getPincodeMap() {
		return pincodeMap;
	}

	public void setPincodeMap(HashMap<String, Integer> pincodeMap) {
		this.pincodeMap = pincodeMap;
	}

	@Override
	public String toString() {
		return "Person [friendList=" + friendList + ", pincodeMap=" + pincodeMap + ", properties=" + properties + "]";
	}

}
