package chapter03.SWITCH;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		
		//Scanner Ŭ������ scan�̶�� �ν��Ͻ� ������ �����Ͽ� ScannerŬ������ ���� �ִ� �޸𸮸� Ȯ��
		Scanner scan=new Scanner(System.in);
		System.out.print("����� �Է��ϼ���(A,B,C) : ");
		char grade;
		//charAt(0) : String -> char
		grade=scan.nextLine().charAt(0);
		//A,a ->���ȸ�� / B.b -> �Ϲ�ȸ�� /������ -> ��
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("���ȸ�� �Դϴ�.");
			break;
			
		case 'B','b':
			System.out.println("�Ϲ�ȸ�� �Դϴ�");
		    break;
		    
		default:
			System.out.println("�� �Դϴ�");
		}
		
	}//main

}//class
