package chapter03.FOR;

import java.util.Scanner;

public class ForTest18 {

	public static void main(String[] args) {
		// ������ �Է¹޾Ƽ� �Էµ� ����ŭ �� ���
		
		Scanner scn = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int i, j;
		int n = scn.nextInt();

		for( i=1; i<=n; i++)
		{
			for( j=1; j<=i; j++)
			{
				System.out.print("��");
			}

			System.out.println();
		}


	}

}
