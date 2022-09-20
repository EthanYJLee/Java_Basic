package com.javalec.base;

public class Main {

	public static void main(String[] args) {

//		HeadQuarter headQuarter = new HeadQuarter();
//		System.out.println("HQ--------------------------");
//
//		headQuarter.orderKim();
//		headQuarter.orderBu();
//		headQuarter.orderBi();
//		headQuarter.orderSoon();
//		headQuarter.orderKong();
//		System.out.println("");
//
//		HeadQuarter shop1 = new Shop1();
//		System.out.println("Shop1-----------------------");
//
//		shop1.orderKim();
//		shop1.orderBu();
//		shop1.orderBi();
//		shop1.orderSoon();
//		shop1.orderKong();
//		System.out.println("");
//
//		HeadQuarter shop2 = new Shop2();
//		System.out.println("Shop2-----------------------");
//
//		shop2.orderKim();
//		shop2.orderBu();
//		shop2.orderBi();
//		shop2.orderSoon();
//		shop2.orderKong();
//		System.out.println("");
//
//		HeadQuarter shop3 = new Shop3();
//		System.out.println("Shop3-----------------------");
//		shop3.orderKim();
//		shop3.orderBu();
//		shop3.orderBi();
//		shop3.orderSoon();
//		shop3.orderKong();

		System.out.println("================================");
		HeadQuarter[] array = { new HeadQuarter(), new Shop1(), new Shop2(), new Shop3() };
		// [0]: HeadQuarter 0 = new HeadQuarter
		// [1]: HeadQuarter 1 = new Shop1
		// [2]: HeadQuarter 2 = new Shop2
		// [3]: HeadQuarter 3 = new Shop3

		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.println("Head Quarter-------------");
			}else if (i < array.length) {
				System.out.println("Store" + i + "-------------------");
			}
			
			array[i].orderKim();
			array[i].orderBu();
			array[i].orderBi();
			array[i].orderSoon();
			array[i].orderKong();
			System.out.println("");

		}

	}

}
