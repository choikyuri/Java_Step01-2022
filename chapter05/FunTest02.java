package chapter05;

import javax.swing.JOptionPane;

public class FunTest02 {

   
	public void sum(int num1, int num2) {
		int result=num1+num2;
		
		System.out.println(num1+ " + " +num2+ " = " + result);
		
	}
	
	public static void main(String[] args) {
		
		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		//static에서 호출되지 않았으므로 Error발생
		//sum(a,b)
		
		//생성자를 통한 객체생성
		FunTest02 Obj=new FunTest02();
		Obj.sum(a,b);
		
		

	}

}





