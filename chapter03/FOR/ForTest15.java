package chapter03.FOR;

import java.util.Scanner;

public class ForTest15 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int i, j;
		System.out.print("���� �Է��ϼ��� : ");
		int a=scan.nextInt(); //3
		System.out.print("���� �Է��ϼ��� : ");
		int b=scan.nextInt(); //4
		
		for(i=1;i<=a;i++) {
			
			for(j=1;j<=b;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}

	}

}
