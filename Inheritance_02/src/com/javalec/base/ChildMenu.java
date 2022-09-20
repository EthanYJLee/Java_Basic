package com.javalec.base;

public class ChildMenu extends ParentsMenu {

	public ChildMenu() {
		// TODO Auto-generated constructor stub
	}

	public void makeBeefChung() {
		System.out.println("소고기 청국장");
	}
	
	public void makeHotDoen() {
		System.out.println("얼큰 된장국");
	}
	
	public void makeKongNa() {
		System.out.println("콩나물국");
	}
	
	@Override	//주석 (오버로딩 됨)
	public void makeChung() {
		super.makeChung();	//super=>상속클래스와 피상속클래스 동시에 실행
		System.out.println("냄새 없는 청국장");
	}
	
}
