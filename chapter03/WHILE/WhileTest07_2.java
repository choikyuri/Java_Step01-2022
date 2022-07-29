package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest07_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.print("1.입력하기\n2.출력하기\n3.삭제하기\n4.끝내기\n작업할 번호를 선택하세요>");
			int num = scan.nextInt();
			
			
			if (num==1) {
				System.out.println("입력하기를 선택하셨습니다"); 
				//continue; //~~메모리 초기화 (=무시)
			} else if (num==2) {
				System.out.println("출력하기를 선택하셨습니다"); 
				//continue;
			} else if (num==3) {
				System.out.println("삭제하기를 선택하셨습니다"); 
				//continue;
			} else if (num==4) {
				System.out.println("끝내기를 선택하셨습니다"); 	
				break;
			} else {
				System.out.println("옳은 번호를 입력해주십시오");
				//continue;
			}
		}
	
		//switch
	/*
		while(true) {
			System.out.println("1.입력하기");
			System.out.println("2.출력하기");
			System.out.println("3.삭제하기");
			System.out.println("4.끝내기");
			System.out.print("작업할 번호를 선택하세요 : ");
			int num=scan.nextInt();
			
			System.out.println();
		// =========================================	
		switch (num) {
		case 1: {
			System.out.println("입력하기를 선택하였습니다.");
			break;
		}
		case 2: {
			System.out.println("출력하기를 선택하였습니다.");
			break;
		}
		case 3: {
			System.out.println("삭제하기를 선택하였습니다.");
			break;
		}
		case 4: {
			System.out.println("끝내기를 선택하였습니다.");
			break;
		}
		default:
			System.out.println("잘못 선택하였습니다.");
		}//switch
		
		//==================================================
		if (num==4) {
			break;
		}//while
		System.out.println();
		}
*/
	}

}
