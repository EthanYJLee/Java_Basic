package com.javalec.function;

public class Person {
	
	int gift = 0;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public void giveGift(int gift) {
		Gift.total = Gift.total - gift;
		
		if (Gift.total > 0) {
			System.out.println("남은 선물 갯수는 " + Gift.total + "개입니다.");

		} else if (Gift.total == 0) {
			System.out.println("남은 선물 갯수가 없습니다.");

		} else {
			System.out.println("남은 선물 갯수가 모자랍니다.");
		}

	}
	

}
