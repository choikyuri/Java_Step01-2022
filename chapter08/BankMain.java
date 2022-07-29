package chapter08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {
		
		Bank bk1=new Bank("종각점","010-1234-5678");
		//static은 클래스명으로 참조하여 사용한다
		Bank.interest=0.2f;
		bk1.getBank();
		System.out.println("-------------------------------");
		String point=JOptionPane.showInputDialog("지점명");
		String tel=JOptionPane.showInputDialog("전화번호");
		Bank bk2=new Bank(point, tel);
		
		Scanner scan=new Scanner(System.in);
		System.out.print(point+" 지점의 이자를 입력하세요 : ");
		Bank.interest=scan.nextFloat();
		
		bk2.getBank();

	}

}
