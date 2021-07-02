package com.blogging.constructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		System.out.println("Default constructor");
		System.out.println(v.RegNo+"\n"+v.type);
		
		System.out.println("Paramterised constructor");
		Vehicle v1 = new Vehicle("Royal Enfield",6754);
		System.out.println(v1.RegNo+"\n"+v1.type);

	}

}
