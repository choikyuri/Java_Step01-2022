package chapter03.IF;

import java.util.Scanner;

public class ifExample11 {

	public static void main(String[] args) {
		// Scanner scan이라는 인스턴스 변수방을 선언
		Scanner scan=new Scanner(System.in);
		//ID라는 변수방에 아이디 받기(String)
		System.out.print("아이디 : ");
		String ID=scan.nextLine();
		
		//PW라는 변수방에 비밀번호 받기(String)
		System.out.println("비밀번호 : ");
		String PW=scan.nextLine();
		//int PW=Integer.parseInt(scan.nextLine());
		//비밀번호만 형변환
		int pass=Integer.parseInt(PW);
		
		//중첩 if문을 사용하여 로그인 성공, 비밀번호 다름, 아이디 없음
		//방법1
		/*
		if(ID.equals("soldesk")) {
			if(pass == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
			
		}else {
			System.out.println("로그인 실패!!");
		}*/
		
		if(ID.equals("soldesk") && pass == 12345 ) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패!!");
		}
		

	}

}
