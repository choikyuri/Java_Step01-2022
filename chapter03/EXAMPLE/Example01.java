package chapter03.EXAMPLE;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		//����ó������� �� ������ ���䰳���� int�� Ÿ���� ���� 5���� �����ϰ� �Է¹�������(�� �Է��� ScannerŬ���� ���)
        //����Ʈ���� ����(soft1), ����Ʈ���� ����(soft2), �����ͺ��̽� ����(DB), ���α׷��־��Ȱ��(pro), �����ý��� ����(os)
		//�� �����̶� 8�� �̸�, ����� 60�� �̸��� ��� ���հ��Դϴٷ� ���
		//�׷��� ������ �հ��Դϴ����� ���
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("����Ʈ���� ���� : ");
		int soft1=scan.nextInt();
		System.out.print("����Ʈ���� ���� : ");
		int soft2=scan.nextInt();
		System.out.print("�����ͺ��̽� ���� : ");
		int DB=scan.nextInt();
		System.out.print("���α׷��־��Ȱ�� : ");
		int pro=scan.nextInt();
		System.out.print("�����ý��� ���� : ");
		int os=scan.nextInt();
		
		int sum=soft1+soft2+DB+pro+os;

		
		if(soft1<8 || soft2<8 || DB<8 || pro<8 || os<8 || sum<60) {
			System.out.println("���հ��Դϴ�.");
		}else {
			System.out.println("�հ��Դϴ�");
		}
		
		
	}

}





