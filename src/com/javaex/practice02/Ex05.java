package com.javaex.practice02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
	
	int age;
	
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("나이를 입력해주세요");
	System.out.print("나이: ");
	
	age = scanner.nextInt();
	
	 if(age > 19) {
		 System.out.print("\"1번그룹\"");
		 }else{
			 if(age > 66);
		 System.out.println("\"1번그룹\"");
		} {
			if (age < 66 )
			System.out.println("\"2번그룹\"");
		}else {
	
	 System.out.println("입니다");
		}
		
	}	
	scanner.close();
}