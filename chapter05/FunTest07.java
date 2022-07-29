package chapter05;

import java.util.Scanner;

public class FunTest07 {

	public FunTest07() {
		// TODO Auto-generated constructor stub
	}
	/*
	//return 값이 있는 경우
	public static String Edustep(int edu) {
		String step;
		
		//1->1단계 2->2단계 3->3단계 그외 입력된 스터디가 없습니다
		if(edu==1) {
			step="1단계";
		}else if(edu==2) {
			step="2단계";
		}else if(edu==3) {
			step="3단계";
		}else {
			step="해당하는 스터디단계가 없습니다.";
		}
		
		return step;
	}*/
	//return 값이 없는 경우
	public static void Edustep(int edu) {
	
		//1->1단계 2->2단계 3->3단계 그외 입력된 스터디가 없습니다
		if(edu==1) {
			System.out.println("현재 스터디 단계는 step1 입니다");
		}else if(edu==2) {
			System.out.println("현재 스터디 단계는 step" +edu+" 입니다");
		}else if(edu==3) {
			System.out.println("현재 스터디 단계는 step" +edu+" 입니다");
		}else {
			System.out.println("해당하는 스터디 단계가 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("스터디의 단계를 입력하세요 : ");
		int num=scan.nextInt();
		//return 값이 있는 경우 메서드 호출하는 법
		//System.out.println("현재 수업 단계는 : "+Edustep(num)+" 입니다");
		//return 값이 없는 경우 메서드 호출하는 법
		Edustep(num);

	}

}
