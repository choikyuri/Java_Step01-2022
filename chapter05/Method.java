package chapter05;

import java.util.Scanner;

public class Method {
	
	//�ʵ� �Ǵ� �������
	
	//����Ʈ ������(��������)
	
	//�����ε� : �޼����� �̸��� ������ �Ű��������� �ٸ�
	void makeBread() {
		System.out.println("���� ����ϴ�.");
	}//method1
	
	void makeBread(int count) {
		//1��° ���� ��������ϴ�
		//2��° ���� ��������ϴ�
		for(int i=0;i<count;i++) {
			System.out.println((i+1) + "��° ���� ��������ϴ�");
		}
		System.out.println("��û�Ͻ� " +count+"���� ���� ��� �Ϸ�Ǿ����ϴ�.");
	}//method2
	
	void makeBread(int count, String name) {
		//1��° ��ũ�� ���� ��������ϴ�
		//2��° ��ũ�� ���� ��������ϴ�
		for(int i=0;i<count;i++) {
			System.out.println((i+1) + "��° " +name+ " ���� ��������ϴ�");
		}
		System.out.println("��û�Ͻ� " +count+"���� " +name+ " ���� ��� �Ϸ�Ǿ����ϴ�.");
	}
	
	void order() {
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("1. �� ���� ���� | 2. ���� ������ ���� | 3. ���� : ");
			System.out.print("����> ");
			int input_num=scan.nextInt();
			
			if(input_num==1) {
				System.out.print("�ֹ��� ���� ���� : ");
				int cnt=scan.nextInt();
				makeBread(cnt);
			}else if(input_num==2) {
				System.out.print("�ֹ��� ���� ���� : ");
				int cnt=scan.nextInt();
				System.out.print("�ֹ��� ���� ���� : ");
				String name=scan.next();
				makeBread(cnt, name);
			}else {
				System.out.println("���α׷� ����");
				break;
			}//if
	
		}//while
	}//main
}//class
