package chapter08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {
		
		Bank bk1=new Bank("������","010-1234-5678");
		//static�� Ŭ���������� �����Ͽ� ����Ѵ�
		Bank.interest=0.2f;
		bk1.getBank();
		System.out.println("-------------------------------");
		String point=JOptionPane.showInputDialog("������");
		String tel=JOptionPane.showInputDialog("��ȭ��ȣ");
		Bank bk2=new Bank(point, tel);
		
		Scanner scan=new Scanner(System.in);
		System.out.print(point+" ������ ���ڸ� �Է��ϼ��� : ");
		Bank.interest=scan.nextFloat();
		
		bk2.getBank();

	}

}
