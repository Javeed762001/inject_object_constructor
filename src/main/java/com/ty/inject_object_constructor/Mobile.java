package com.ty.inject_object_constructor;

public class Mobile {

	private String name;
	public Mobile(String name, String model) {
		super();
		this.name = name;
		this.model = model;
	}

	private String model;
	
	public void ring()
	{
		System.out.println(name+" "+model+"mobile is ringing");
	}
}
