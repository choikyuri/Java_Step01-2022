package chapter03.FOR;

import java.util.Scanner;

public class ForTest08 {
	
	public static void main(String[] args) {
		//10���� ������ �Է¹޾� 3�� ����� 5�� ����� ���� ����Ͻÿ�
		
		Scanner scn=new Scanner(System.in);
		int a, cnt3=0, cnt5=0;
		System.out.print("������ �Է��ϼ��� : ");
		
		for(int i=1; i<=10; i++) {
			a=scn.nextInt();
			
			if(a%3 == 0) {
				//System.out.print("3�� ��� : "+ a);
				cnt3++;
			}
			
			System.out.println();
			if(a%5 == 0) {
				//System.out.print("5�� ��� : "+ a);
				cnt5++;
			}
		}
		
		System.out.println("3�ǹ�� : "+cnt3+"��");
		
		System.out.println("5�ǹ�� : "+cnt5+"��");
		
	}

}
