package chapter03.FOR;

public class ForTest02 {


	public static void main(String[] args) {
		
		System.out.println("1���� 100������ ���� ���");
		
		int i;
		int sum=0;
		for(i=1;i<=100;i++) {
			System.out.print(i+" ");
			sum+=i;
		}
		System.out.println();
		System.out.println("1���� 100������ �� : " + sum +"�Դϴ�");
		
		
	}
}
