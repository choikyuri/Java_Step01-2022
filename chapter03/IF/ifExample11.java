package chapter03.IF;

import java.util.Scanner;

public class ifExample11 {

	public static void main(String[] args) {
		// Scanner scan�̶�� �ν��Ͻ� �������� ����
		Scanner scan=new Scanner(System.in);
		//ID��� �����濡 ���̵� �ޱ�(String)
		System.out.print("���̵� : ");
		String ID=scan.nextLine();
		
		//PW��� �����濡 ��й�ȣ �ޱ�(String)
		System.out.println("��й�ȣ : ");
		String PW=scan.nextLine();
		//int PW=Integer.parseInt(scan.nextLine());
		//��й�ȣ�� ����ȯ
		int pass=Integer.parseInt(PW);
		
		//��ø if���� ����Ͽ� �α��� ����, ��й�ȣ �ٸ�, ���̵� ����
		//���1
		/*
		if(ID.equals("soldesk")) {
			if(pass == 12345) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
			
		}else {
			System.out.println("�α��� ����!!");
		}*/
		
		if(ID.equals("soldesk") && pass == 12345 ) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����!!");
		}
		

	}

}
