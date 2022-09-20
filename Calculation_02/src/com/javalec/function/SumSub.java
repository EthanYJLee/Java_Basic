package com.javalec.function;

public class SumSub extends Add {
	public int num1;
	public int num2;
	
	Add add = new Add();
	
	
	public SumSub() {
	}
	
	
	public int subtract(int i, int j) {
		int result = num1 - num2;
		return result;
	}
	
	
	

}
