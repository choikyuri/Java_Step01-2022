package chapter03.FOR;

import java.util.Scanner;

public class ForTest06 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		
		int i; // 선언
		int a=scan.nextInt();
		
		//0보다 크면서 11보다 작은수
		if(a>0 && a<11) {
			
			for(i=1; i<=a; i++) {
				System.out.println("Java 프로그래밍");
			}
			
		}else {
			System.out.println("입력값이 잘못되었습니다");
		}
		
		
		System.out.println("프로그램이 종료됩니다");

	}//main

}//class
