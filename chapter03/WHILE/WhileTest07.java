package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest07 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num;
		String menu = "";
       //do�� ������ ������ ������ �ؾ���
		do
		{
			System.out.println("1.�Է��ϱ�");
			System.out.println("2.����ϱ�");
			System.out.println("3.�����ϱ�");
			System.out.println("4.������");
			System.out.print("�۾��� ��ȣ�� �����ϼ���.: ");
			num = scn.nextInt();
			
			//����ó��
			if(num < 1 || num > 3) // ���� �Ǵ� 4,5,6....
			{
				if( num == 4)
				{
					break;
				}
				menu = "�߸� �Է��ϼ̽��ϴ�";
			}
			else
			{
				if(num == 1)
				{
					menu = "�Է��ϱ⸦";
				}
				else if(num == 2)
				{
					menu = "����ϱ⸦";
				}
				else if(num == 3)
				{
					menu = "�����ϱ⸦";
				}
			}//if
			
			
			System.out.print(menu + " �����Ͽ����ϴ�.\n");

		}while(num != 4);

		System.out.print("\n�����⸦ �����Ͽ����ϴ�.");

	}
}
