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
		System.out.println("�� 1.���� �� 2.��� �� 3.�ܰ� �� 4.���� ��");
		System.out.println("-----------------------------------");
		System.out.print("���Ͻô� �޴��� ��ȣ�� �Է��� �ּ��� : ");
		input=scan.nextInt();
		
		switch (input) {
		case 1: {
			System.out.print("�󸶸� �Ա��Ͻðڽ��ϱ�? ");
			money+=scan.nextInt();
			System.out.println("---------------------");
			System.out.println("�� 1.�ʱ�޴� �� 2.���� ��");
			System.out.println("---------------------");
			input=scan.nextInt();
				if(input==2) 
					run=false;
			break; //switch
		}
		case 2: {
			System.out.print("�󸶸� ����Ͻðڽ��ϱ�? ");
			money-=scan.nextInt();
			
			System.out.println("---------------------");
			System.out.println("�� 1.�ʱ�޴� �� 2.���� ��");
			System.out.println("---------------------");
			input=scan.nextInt();
			if(input==2)
				run=false;
			break;
		}
		case 3: {
			System.out.print("�����ܰ� : " + money);
			System.out.println("---------------------");
			System.out.println("�� 1.�ʱ�޴� �� 2.���� ��");
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
	System.out.println("�����մϴ�.");
	
}
}
