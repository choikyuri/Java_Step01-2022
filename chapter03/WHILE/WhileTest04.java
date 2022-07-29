package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		
		while(true) {
			
			Scanner scn=new Scanner(System.in);
			System.out.print("Java 교과목 점수를 입력하세요 : ");
			int scr=scn.nextInt();
			
			//점수가 0미만 또는 100초과이면 while문 중지, 60점 이상이면 합격, 그렇지 않으면 불합격
			
			if(scr < 0 || scr > 100) {
				break;
			}else if(scr >= 60){
				System.out.println("축하합니다.  합격하셨습니다.");
			}else {
				System.out.println("재도전 하십시오. 불합격입니다.");
			}//if
			
			
		}//while
            System.out.println("프로그램이 종료되었습니다");
	}//main

}//class
