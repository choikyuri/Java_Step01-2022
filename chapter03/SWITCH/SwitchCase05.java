package chapter03.SWITCH;

public class SwitchCase05 {

	public static void main(String[] args) {
		System.out.print("�ֻ��� ���� : ");
		int num=(int)(Math.random()*10)+1;
		/*
		switch(num) {
		case 1:
			System.out.println("1��"); 
			break;
		case 2:
			System.out.println("2��"); 
			break;
		case 3:
			System.out.println("3��"); break;
		case 4:
			System.out.println("4��"); 
			break;
		case 5:
			System.out.println("5��"); break;
		case 6:
			System.out.println("6��"); break;
		default:
			System.out.println("�߸��� ����");
		}
		*/
		
		switch (num) {
		case 1,2,3,4,5,6: {
			
			System.out.println(num + "�� ȹ��");
			break;
		}
		default:
			System.out.println("�߸��� �����Դϴ�.");
		}
		
		System.out.println("�ֻ����� ���� ���� ���ڴ� "+num+" �Դϴ�.");
		
		
	}
}
