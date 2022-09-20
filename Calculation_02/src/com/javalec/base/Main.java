package com.javalec.base;

import com.javalec.function.Add;
import com.javalec.function.SumSub;

public class Main {

	public static void main(String[] args) {
		int i = 1, j = 2;
		
		Add add = new Add();
		SumSub sumSub = new SumSub();

		
		add.add(i, j);
//		System.out.println(add.add(i, j));
		
		sumSub.subtract(i, j);
		System.out.println(sumSub.subtract(i, j));

	}

}
