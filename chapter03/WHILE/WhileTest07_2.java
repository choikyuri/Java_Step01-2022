package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest07_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.print("1.�Է��ϱ�\n2.����ϱ�\n3.�����ϱ�\n4.������\n�۾��� ��ȣ�� �����ϼ���>");
			int num = scan.nextInt();
			
			
			if (num==1) {
				System.out.println("�Է��ϱ⸦ �����ϼ̽��ϴ�"); 
				//continue; //~~�޸� �ʱ�ȭ (=����)
			} else if (num==2) {
				System.out.println("����ϱ⸦ �����ϼ̽��ϴ�"); 
				//continue;
			} else if (num==3) {
				System.out.println("�����ϱ⸦ �����ϼ̽��ϴ�"); 
				//continue;
			} else if (num==4) {
				System.out.println("�����⸦ �����ϼ̽��ϴ�"); 	
				break;
			} else {
				System.out.println("���� ��ȣ�� �Է����ֽʽÿ�");
				//continue;
			}
		}
	
		//switch
	/*
		while(true) {
			System.out.println("1.�Է��ϱ�");
			System.out.println("2.����ϱ�");
			System.out.println("3.�����ϱ�");
			System.out.println("4.������");
			System.out.print("�۾��� ��ȣ�� �����ϼ��� : ");
			int num=scan.nextInt();
			
			System.out.println();
		// =========================================	
		switch (num) {
		case 1: {
			System.out.println("�Է��ϱ⸦ �����Ͽ����ϴ�.");
			break;
		}
		case 2: {
			System.out.println("����ϱ⸦ �����Ͽ����ϴ�.");
			break;
		}
		case 3: {
			System.out.println("�����ϱ⸦ �����Ͽ����ϴ�.");
			break;
		}
		case 4: {
			System.out.println("�����⸦ �����Ͽ����ϴ�.");
			break;
		}
		default:
			System.out.println("�߸� �����Ͽ����ϴ�.");
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
