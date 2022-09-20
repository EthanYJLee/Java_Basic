package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Gift;
import com.javalec.function.Person1;
import com.javalec.function.Person2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 person1 = new Person1();
		Person2 person2 = new Person2();

		Scanner scanner = new Scanner(System.in);
		System.out.print("1번 친구에게 선물할 갯수를 입력하세요 : ");
		person1.giveGift(scanner.nextInt());
		
		System.out.println("");
		
		if (Gift.total > 0) {
			System.out.print("2번 친구에게 선물할 갯수를 입력하세요 : ");
			person2.giveGift(scanner.nextInt());
		}

		// 1번 친구에게 선물할 갯수를 입력하세요 : 5
		// 남은 선물 갯수는 5개입니다.
		// 2번 친구에게 선물할 갯수를 입력하세요 : 3
		// 남은 선물 갯수는 2개입니다.
//		-----------
		// 1번 친구에게 선물할 갯수를 입력하세요 : 10
		// 남은 선물 갯수가 없습니다.
//		-----------
		// 1번 친구에게 선물할 갯수를 입력하세요 : 11
		// error: 남은 선물 갯수가 모자랍니다.
	}

}
