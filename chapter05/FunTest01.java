package chapter05;

import javax.swing.JOptionPane;

public class FunTest01 {
	
	//�հ� �ż���(�Լ�)
	public static void sum(int num1, int num2) {
		int total=num1+num2;
		System.out.println("�� ���� �� : "+total);
	}
	

	public static void main(String[] args) {
		
		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("��2"));
		
		sum(a,b);

	}
	/*
	//������ �������� �Ͽ� ���μ��� �� �Ǵ� �Ŀ� �����ص� ��
	public static void sum(int num1, int num2) {
		int total=num1+num2;
		System.out.println("�� ���� �� : "+total);
	}
	*/

}
