package chapter03.FOR;

public class ForTest03 {

	public static void main(String[] args) {
		//1���� 100������ ���� ���ϵ� ���� 100�����̸鼭 ���� ū��
		/*���1
		System.out.println("1���� 100������ ���� ���ϵ� ���� 100�̸��̸鼭 ���� ū��");
		
		int i;
		int sum=0;
		for(i=1;i<=100;i++) {
			sum+=i;
			//if��
			if(sum<100)
			System.out.println("���� "+i +"������ �� : " + sum +"�Դϴ�");	
		}
		*/
		//���2
		
		System.out.println("1���� 100������ ���� ���ϵ� ���� 100�̸��̸鼭 ���� ū��");
		int i;
		int sum=0;
		for(i=1;i<=100;i++) {
			sum+=i;
			//if��
			if(sum>=100)
			  break;
		}
		System.out.println("�ش� ���� : "+ (i-1) +"�Դϴ�");
		System.out.println("���� "+(i-1) +"������ �� : " + (sum-i) +"�Դϴ�");	
		
		/*���3 
		System.out.println("1���� 100������ ���� ���ϵ� ���� 100�� �ʰ��ϴ� ù��° ���� ��");
		int i;
		int sum=1;
		for(i=1;sum<100;i++) {
			sum+=i;
		}
		
		System.out.println("���� "+ (i-1) +"������ �� : " + (sum-i) +"�Դϴ�");	
	
		*/
		
		
		
		
		
		
	}

}
