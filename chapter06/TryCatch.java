package chapter06;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {
		
	
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("��2"));
		/*
		int result=num1/num2;
		System.out.println(result);
		*/
		
		try {
			
			int result=num1/num2;
			System.out.println(result);
			
		} catch (Exception e) {
			System.out.println("num2�� ���� 0�� �Է��Ͻø� �ȵ˴ϴ�"); //�����ÿ� ���๮
		}
		System.out.println("���α׷� ����");
	}//main

}//class
