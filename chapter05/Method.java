package chapter05;

import java.util.Scanner;

public class Method {
	
	//필드 또는 멤버변수
	
	//디폴트 생성자(생략가능)
	
	//오버로딩 : 메서드의 이름은 같지만 매개변수값이 다름
	void makeBread() {
		System.out.println("빵을 만듭니다.");
	}//method1
	
	void makeBread(int count) {
		//1번째 빵을 만들었습니다
		//2번째 빵을 만들었습니다
		for(int i=0;i<count;i++) {
			System.out.println((i+1) + "번째 빵을 만들었습니다");
		}
		System.out.println("요청하신 " +count+"개의 빵이 모두 완료되었습니다.");
	}//method2
	
	void makeBread(int count, String name) {
		//1번째 생크림 빵을 만들었습니다
		//2번째 생크림 빵을 만들었습니다
		for(int i=0;i<count;i++) {
			System.out.println((i+1) + "번째 " +name+ " 빵을 만들었습니다");
		}
		System.out.println("요청하신 " +count+"개의 " +name+ " 빵이 모두 완료되었습니다.");
	}
	
	void order() {
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료 : ");
			System.out.print("선택> ");
			int input_num=scan.nextInt();
			
			if(input_num==1) {
				System.out.print("주문할 빵의 갯수 : ");
				int cnt=scan.nextInt();
				makeBread(cnt);
			}else if(input_num==2) {
				System.out.print("주문할 빵의 갯수 : ");
				int cnt=scan.nextInt();
				System.out.print("주문할 빵의 종류 : ");
				String name=scan.next();
				makeBread(cnt, name);
			}else {
				System.out.println("프로그램 종료");
				break;
			}//if
	
		}//while
	}//main
}//class
