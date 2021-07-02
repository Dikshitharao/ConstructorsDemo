package com.blogging.constructor;

public class Vehicle {

	String type;
	int RegNo;
	
	public Vehicle() {
		System.out.println("This is a No-arg constructor");
		type = "Car";
		RegNo = 1244;
	}
	public Vehicle(String type, int regNo) {
		
		this.type = type;
		RegNo = regNo;
	}
	
	//Comment one constructor at a time and observe how other constructor works
	
	
}
