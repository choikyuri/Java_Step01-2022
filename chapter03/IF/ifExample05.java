package chapter03.IF;

import javax.swing.JOptionPane;

public class ifExample05 {

	public static void main(String[] args) {
		// ���ð��� ������ ������ �Ƶ��� 1000��
		// ���ð��� ������ �ʵ��л��� 2000��
		// ���ð��� ������ ��.����л��� 3500��
		// ���ð��� ������ ������ 5000��
		
		int age;
	    //���̸� �Է��ϼ���
		age=Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���"));

		int charge=0;
		
		if(age>0 && age<8) {
			charge=1000;
			System.out.println("�� ���� �Ƶ��Դϴ�");
		}
		if(age>=8 && age<14) {
			charge=2000;
			System.out.println("�ʵ��л� �Դϴ�");
		}
		if(age>=14 && age<20) {
			charge=3500;
			System.out.println("��.����л� �Դϴ�");
		}
		
		
		System.out.println("������ "+ charge +"�� �Դϴ�");
	
	}//main

}//class
