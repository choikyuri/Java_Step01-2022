package chapter03.EXAMPLE;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		
		char gender='M';//����
		
		//gender�� F�� �����Դϴ� �׷��� ������ �����Դϴ�
		if(gender=='F') {
			System.out.println("�����Դϴ�");
		}else {
			System.out.println("�����Դϴ�");
		}
		
		
		System.out.println("---------------------------------");
		System.out.println();
		System.out.print("�ֹ��Ͻðڽ��ϱ�? ");
		
		Scanner scan=new Scanner(System.in);
		
		String ch;
		ch=scan.nextLine();
		
		//ch�� Y �Ǵ� y�̸� �޴��� �Է��ϼ��並 ���
		if(ch.equals("Y")  || ch.equals("y") ) {
			System.out.print("�޴��� �Է��ϼ��� : ");
			String m1=scan.nextLine();
			System.out.println(m1 +"(��)�� �ֹ� �Ϸ�Ǿ����ϴ�");
		}else {
			System.out.println("�̿��� �ּż� �����մϴ�.");
		}
		
		

	}

}
