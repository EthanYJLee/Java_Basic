package com.javalec.function;

public class Person1 {
	int gift1 = 0;

	public Person1() {
		// TODO Auto-generated constructor stub
	}

	public void giveGift(int gift1) {
		Gift.total = Gift.total - gift1;
		
		if (Gift.total > 0) {
			System.out.println("남은 선물 갯수는 " + Gift.total + "개입니다.");

		} else if (Gift.total == 0) {
			System.out.println("남은 선물 갯수가 없습니다.");

		} else {
			System.out.println("남은 선물 갯수가 모자랍니다.");
		}

	}

}
