package chapter03.FOR;

import java.util.Scanner;

public class ForTest17 {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력된 수만큼 ★ 출력
		
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int i, j, k;
		int n = scn.nextInt();
		/*
		for (i=0; i<n; i++) { 
			
			for(j=n-1; j>i; j--)
				System.out.print(" ");
			for(k=0; k<=i; k++)
				System.out.print("★");
			System.out.println();
		}*/
		
		for( i=1; i<=n; i++)
		{
			for( j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for( j=1; j<=i; j++)
			{
				System.out.print("★");
			}

			System.out.println();
		}

	}

}
