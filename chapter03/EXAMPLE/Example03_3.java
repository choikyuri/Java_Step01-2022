package chapter03.EXAMPLE;

import java.util.Scanner;

public class Example03_3 {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int num;
		int num2;
		boolean run = true;
		int save =0;
		int money;
		
		
		while(run) {
			System.out.print("번호를 입력하여주세요 : ");
			System.out.println("1.예금 2.출금 3.잔고 4. 종료");
			
			num = scan.nextInt();
			
			if(num==1){
				System.out.println("예금을 선택하셨습니다.");
				System.out.println("현재 예금: " + save);
				System.out.println("입금할 금액을 입력해주세요.");
				money = scan.nextInt();
				if(money<0) {
					System.out.println("금액을 잘못 입력하셨습니다.");
				}else if(num==2) {
				System.out.println("출금을 선택하셨습니다.");
				System.out.println("현재 예금: " + save);
				System.out.println("출금할 금액을 입력해주세요.");
				money = scan.nextInt();
				save -= money;
				if(save<0) {
					System.out.println("금액이 모자릅니다.");
					save += money;
				}
			}else if(num==3) {
				System.out.println("잔고를 선택하셨습니다.");
				System.out.println("현재 금액: " + save);
				
			}else if(num==4) {
				System.out.println("종료를 선택하셨습니다.");
				run = false;
			}else {
				System.out.println("잘못 입력");
			}
			
			
			System.out.println("1. 초기메뉴 2.종료");
			num2 = scan.nextInt();
			
			if(num2==2) {
				run = false;
			}
			
		}// while
		System.out.println("시스템이 종료되었습니다.");	
		}
	}
}

