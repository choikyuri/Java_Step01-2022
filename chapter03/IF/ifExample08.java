package chapter03.IF;

import javax.swing.JOptionPane;

public class ifExample08 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		//num1이 크면 num1이 큽니다
		//num2이 크면 num2이 큽니다
		//두 수는 같습니다
		
		if(num1 > num2) {
			System.out.println(num1+"이(가) 큽니다");
		}else if(num1 < num2) {
			System.out.println(num2+"이(가) 큽니다");
		}else {
			System.out.println("두수가 같습니다");
		}

	}

}
