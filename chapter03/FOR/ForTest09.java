package chapter03.FOR;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
		// ����� ������ �Է� ���� ������ ������ �ο����� �Է¹޾� ������ ����� ���Ͻÿ�(�� ����� �Ǽ��� ����Ѵ�)
		
		Scanner scn=new Scanner(System.in);
		
		int i, sum=0, avg=0, score, cnt=0;
		//�Է�
		System.out.println("����� �л� ������ �Է� �����ðھ��? "); 
		int stu=scn.nextInt(); 
		
		for(i=1;i<=stu;i++) {
			System.out.print(i +"��° �л��� ������ �Է��ϼ���: ");
			score=scn.nextInt(); 
			sum +=score;
			cnt++;  //�ο��� ����
		}
		//���
		avg=sum/cnt;
		System.out.println("���� : " +sum+ ", ��� : " + (double)avg);

	}

}
