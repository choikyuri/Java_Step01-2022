package chapter06;

import java.util.Scanner;

public class VenMain {
	
	public static void main(String[] args) {
		
		String select=""; 
		int money=0;

         Vending ven=new Vending();
         ven.init();//�����غ�
         
         System.out.print("���� �����ϼ��� : ");
         Scanner scan=new Scanner(System.in);
         money=scan.nextInt();
         ven.showCans(money);
         
         System.out.print("���Ḧ �����ϼ��� : ");
         select=scan.next();
         ven.outCan(select);

	}

}
