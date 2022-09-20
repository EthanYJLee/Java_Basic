package com.javalec.function;

public class Car {
	
	//Field
	public String company = "현대자동차";
	public String model;
	public String color;
	public int maxSpeed;
	
	
	//Constructor
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String model) {
		super();
		this.model = model;
	}

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	public Car(String model, String color, int maxSpeed) {
		super();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	//Method


}

//같은 이름의 Constructor에 변수만 다르게 = Overloading

//우클릭
//Source
//Generate Constructor using field
