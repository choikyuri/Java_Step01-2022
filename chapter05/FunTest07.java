package chapter05;

import java.util.Scanner;

public class FunTest07 {

	public FunTest07() {
		// TODO Auto-generated constructor stub
	}
	/*
	//return ���� �ִ� ���
	public static String Edustep(int edu) {
		String step;
		
		//1->1�ܰ� 2->2�ܰ� 3->3�ܰ� �׿� �Էµ� ���͵� �����ϴ�
		if(edu==1) {
			step="1�ܰ�";
		}else if(edu==2) {
			step="2�ܰ�";
		}else if(edu==3) {
			step="3�ܰ�";
		}else {
			step="�ش��ϴ� ���͵�ܰ谡 �����ϴ�.";
		}
		
		return step;
	}*/
	//return ���� ���� ���
	public static void Edustep(int edu) {
	
		//1->1�ܰ� 2->2�ܰ� 3->3�ܰ� �׿� �Էµ� ���͵� �����ϴ�
		if(edu==1) {
			System.out.println("���� ���͵� �ܰ�� step1 �Դϴ�");
		}else if(edu==2) {
			System.out.println("���� ���͵� �ܰ�� step" +edu+" �Դϴ�");
		}else if(edu==3) {
			System.out.println("���� ���͵� �ܰ�� step" +edu+" �Դϴ�");
		}else {
			System.out.println("�ش��ϴ� ���͵� �ܰ谡 �����ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���͵��� �ܰ踦 �Է��ϼ��� : ");
		int num=scan.nextInt();
		//return ���� �ִ� ��� �޼��� ȣ���ϴ� ��
		//System.out.println("���� ���� �ܰ�� : "+Edustep(num)+" �Դϴ�");
		//return ���� ���� ��� �޼��� ȣ���ϴ� ��
		Edustep(num);

	}

}
