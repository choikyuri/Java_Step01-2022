package chapter03.IF;

import java.util.Scanner;
//��ø if��
public class ifExample09 {

	public static void main(String[] args) {


		int score=0;
		char grade=' ';
		char opt='0';
		
		System.out.println("������ �Է����ּ��� > ");
		
		Scanner scan=new Scanner(System.in);
		//score=Integer.parseInt(scan.nextLine());
		score=scan.nextInt(); //������ �ڷḦ �Է��ؼ� score�濡 ������
		System.out.println("----------------------------");
		System.out.println("����� ������ : "+score);
		
		//90�̻��̸� 'A', 80�̻��̸� 'B', �׹ۿ� 'C'
		if(score >= 90) { //90�̻�
			grade='A';
			if(score>=98) { //98�̻��� ���
				opt='+';
			}else if(score>=94) {//94�̻��� ��� 
				opt='-';
			}
		}else if(score >=80) {//80�̻�
			grade='B';
			if(score >=88) { //88�̻�
				opt='+';
			}else if(score >=84) { //84�̻�
				opt='-';
			}
		}else {
			grade='C';
		}
		System.out.println("����� ������ : " + grade+ opt);
		
	}

}
