package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int num, cnt=0, sum=0;
		double avg;
		
		//0�� �Է��ϸ� ����
		while(true) {
			
			num=scn.nextInt();
			
			if(num == 0) {
				break;
			}
			
			cnt++;
			sum +=num;
			
			
		}
		//avg=sum/cnt;
		//������ ���ڸ� �Է¹޾Ƽ� �Էµ� �ڷ��� ����
		System.out.println("�Էµ� �ڷ��� ���� : "+cnt);
		//������ ���ڸ� �Է¹޾Ƽ� �Էµ� �ڷ��� �հ�
		System.out.println("�Էµ� �ڷ��� �հ� : "+sum);
		//������ ���ڸ� �Է¹޾Ƽ� �Էµ� �ڷ��� ���(�� ����� double)
		System.out.println("�Էµ� �ڷ��� �հ� : "+ sum/(double)cnt);
		
		
		

	}

}
