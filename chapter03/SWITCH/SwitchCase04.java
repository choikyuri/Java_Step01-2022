package chapter03.SWITCH;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		
		//Scanner 클래스의 scan이라는 인스턴스 변수를 생성하여 Scanner클래스에 들어갈수 있는 메모리를 확보
		Scanner scan=new Scanner(System.in);
		System.out.print("등급을 입력하세요(A,B,C) : ");
		char grade;
		//charAt(0) : String -> char
		grade=scan.nextLine().charAt(0);
		//A,a ->우수회원 / B.b -> 일반회원 /나머지 -> 고객
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원 입니다.");
			break;
			
		case 'B','b':
			System.out.println("일반회원 입니다");
		    break;
		    
		default:
			System.out.println("고객 입니다");
		}
		
	}//main

}//class
