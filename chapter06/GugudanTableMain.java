package chapter06;

import java.util.Scanner;

public class GugudanTableMain {

	public static void main(String[] args) {
		
		GugudanTable gt=new GugudanTable();
		
		int num;
		
		System.out.print("출력할 단을 입력하세요 : ");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		
		gt.showTable(num);

	}

}
