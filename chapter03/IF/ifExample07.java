package chapter03.IF;

import java.util.Scanner;

public class ifExample07 {

	public static void main(String[] args) {
		
		//�Է� Scanner Ŭ���� �ʱ�ȭ �ν��Ͻ� ������(scan) ����
		Scanner scan=new Scanner(System.in);
		//num1
		System.out.println("1. ù��° ��");
		double num1=Double.parseDouble(scan.nextLine());
		System.out.println("-----------------");
		System.out.println("ù��° �Է¹��� �� ��� : " +num1);
		System.out.println();
		
		//num2
		System.out.println("2. �ι�° ��");
		double num2 = Double.parseDouble(scan.nextLine());
		System.out.println("-----------------");
		System.out.println("�ι�° �Է¹��� �� ��� : " +num2);
		System.out.println();
		/*
		//num1/num2 ��� ������ �̴� num2�� 0.0�� �ƴϸ� ���� ���࿡ 0�̸� "0���� ������ �����ϴ�"
		if (num2 != 0.0)
			System.out.println("���� �� : " + num1 / num2);
		else
			System.out.println("0���� ���� �� �����ϴ�");
		
		*/
		if(num2 == 0)
			System.out.println("0���� ���� �� �����ϴ�.");
		else
		{
			double result = num1 / num2;
			System.out.println("num1 / num2 : " + result);
		}

	}

}
