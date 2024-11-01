package com.iavaex.basic.types;

//	상수
// 	다루는 데이터에 불변성(immutable)을 부여하는 것
public class ConstantXEx {

	public static void main(String[] args) {
		//	final은 한 번 할당 되면 재할당 불가
		// 상수의 이름은 모두 대문자, 단어의 조합은 _로 구분
		
		final int SPEED_LTMIT = 110;
		System.out.println("현재 도로의 제한속도는" + SPEED_LTMIT + "입니다.");
		
		//	SPEED_LTMIT = 300; //	붛변성제한
		System.out.println("제한 속도" + SPEED_LTMIT + "이하로 주행해 주세요");
		
		
		
		

	}

}
