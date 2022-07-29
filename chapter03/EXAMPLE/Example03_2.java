package chapter03.EXAMPLE;

import java.util.Scanner;

public class Example03_2 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		boolean run = true;
		int money=0;
		int input;
	
	while(run) {
		System.out.println("-----------------------------------");
		System.out.println("ㅣ 1.예금 ㅣ 2.출금 ㅣ 3.잔고 ㅣ 4.종료 ㅣ");
		System.out.println("-----------------------------------");
		System.out.print("원하시는 메뉴의 번호를 입력해 주세요 : ");
		input=scan.nextInt();
		
		switch (input) {
		case 1: {
			System.out.print("얼마를 입금하시겠습니까? ");
			money+=scan.nextInt();
			System.out.println("---------------------");
			System.out.println("ㅣ 1.초기메뉴 ㅣ 2.종료 ㅣ");
			System.out.println("---------------------");
			input=scan.nextInt();
				if(input==2) 
					run=false;
			break; //switch
		}
		case 2: {
			System.out.print("얼마를 출금하시겠습니까? ");
			money-=scan.nextInt();
			
			System.out.println("---------------------");
			System.out.println("ㅣ 1.초기메뉴 ㅣ 2.종료 ㅣ");
			System.out.println("---------------------");
			input=scan.nextInt();
			if(input==2)
				run=false;
			break;
		}
		case 3: {
			System.out.print("현재잔고 : " + money);
			System.out.println("---------------------");
			System.out.println("ㅣ 1.초기메뉴 ㅣ 2.종료 ㅣ");
			System.out.println("---------------------");
			input=scan.nextInt();
			if(input==2)
				run=false;
			break;
		}
		case 4: {
			run=false;
			}
		}
	}
	System.out.println("감사합니다.");
	
}
}
