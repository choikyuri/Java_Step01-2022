package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		
		while(true) {
			
			Scanner scn=new Scanner(System.in);
			System.out.print("Java ������ ������ �Է��ϼ��� : ");
			int scr=scn.nextInt();
			
			//������ 0�̸� �Ǵ� 100�ʰ��̸� while�� ����, 60�� �̻��̸� �հ�, �׷��� ������ ���հ�
			
			if(scr < 0 || scr > 100) {
				break;
			}else if(scr >= 60){
				System.out.println("�����մϴ�.  �հ��ϼ̽��ϴ�.");
			}else {
				System.out.println("�絵�� �Ͻʽÿ�. ���հ��Դϴ�.");
			}//if
			
			
		}//while
            System.out.println("���α׷��� ����Ǿ����ϴ�");
	}//main

}//class
