package chapter05;

import javax.swing.JOptionPane;

public class FunTest01 {
	
	//합계 매서드(함수)
	public static void sum(int num1, int num2) {
		int total=num1+num2;
		System.out.println("두 수의 합 : "+total);
	}
	

	public static void main(String[] args) {
		
		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		sum(a,b);

	}
	/*
	//메인을 기준으로 하여 메인선언 전 또는 후에 정의해도 됨
	public static void sum(int num1, int num2) {
		int total=num1+num2;
		System.out.println("두 수의 합 : "+total);
	}
	*/

}
