package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;

		System.out.println("Add : " + (i + j));
		System.out.println("Sub : " + (i - j));
		System.out.println("Mul : " + (i * j));
		try { // 나눗셈을 try해서
			System.out.println("Div : " + (i / j));
		} catch (Exception e) { // 에러를 캐치하면 아래 실행
			System.out.println("0을 사용하시면 나누기가 불가능합니다.");
			e.printStackTrace();
		}

	}

}