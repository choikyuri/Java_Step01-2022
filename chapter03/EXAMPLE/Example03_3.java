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
			System.out.print("��ȣ�� �Է��Ͽ��ּ��� : ");
			System.out.println("1.���� 2.��� 3.�ܰ� 4. ����");
			
			num = scan.nextInt();
			
			if(num==1){
				System.out.println("������ �����ϼ̽��ϴ�.");
				System.out.println("���� ����: " + save);
				System.out.println("�Ա��� �ݾ��� �Է����ּ���.");
				money = scan.nextInt();
				if(money<0) {
					System.out.println("�ݾ��� �߸� �Է��ϼ̽��ϴ�.");
				}else if(num==2) {
				System.out.println("����� �����ϼ̽��ϴ�.");
				System.out.println("���� ����: " + save);
				System.out.println("����� �ݾ��� �Է����ּ���.");
				money = scan.nextInt();
				save -= money;
				if(save<0) {
					System.out.println("�ݾ��� ���ڸ��ϴ�.");
					save += money;
				}
			}else if(num==3) {
				System.out.println("�ܰ� �����ϼ̽��ϴ�.");
				System.out.println("���� �ݾ�: " + save);
				
			}else if(num==4) {
				System.out.println("���Ḧ �����ϼ̽��ϴ�.");
				run = false;
			}else {
				System.out.println("�߸� �Է�");
			}
			
			
			System.out.println("1. �ʱ�޴� 2.����");
			num2 = scan.nextInt();
			
			if(num2==2) {
				run = false;
			}
			
		}// while
		System.out.println("�ý����� ����Ǿ����ϴ�.");	
		}
	}
}

