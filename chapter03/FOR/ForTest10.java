package chapter03.FOR;

import java.util.Scanner;

public class ForTest10 {

	public static void main(String[] args) {

		//���� �Է¹޾Ƽ� 1���� ���ʷ� �����Ͽ� ���� ���ϵ� �� �Է¹��� ���� ������ �ߴ��ϰ� ���� ���� ���
		
		Scanner scn=new Scanner(System.in);
		
		int i, sum=0;
		//�Է�
		System.out.println("������ �Է��ϼ��� : "); 
		int a=scn.nextInt();
		
		for(i=1;  ; i++) {
			
			if(sum>a) {
				break;
			}
			sum+=i;
		}
		
		System.out.println(i-1+"��°������ ������ : "+sum);

	}

}
