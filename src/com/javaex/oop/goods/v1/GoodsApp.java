package com.javaex.oop.goods.v1;

// Goods v1. 필드
class Goods {
	// 필드 선언
	String name;
	int price;
}
//  Goods 테스트 클래스
public class GoodsApp {
	

	public static void main(String[] args) {
		Goods camera = new Goods();
		// 생성자를 호출 -> 인스턴스 생성 -> camera로 참조
		
		camera.name = "Nikon";
		camera.price = 400_000;
		System.out.printf("%s -> %,d%n", camera.name,camera.price);
		
		Goods go = new Goods();
		
		go.name = "LG그램";
		go.price = 900_000;
		System.out.printf("%s -> %,d%n", go.name,go.price);
		
		Goods mug = new Goods();
		mug.name = "머그컵";
		mug.price = 2_000;
		System.out.printf("%s -> %,d%n", mug.name,mug.price);
				
		
		

	}
	
	

}
