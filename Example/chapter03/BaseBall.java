package Example.chapter03;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		// ��ǻ�� ���� �ִ� ������ ���ڿ� �ڸ����� ����ڰ� �Է��� ���ڿ� ��� ��ġ�ϸ� strike,
		// �ڸ��� Ʋ���� ���ڸ� ��ġ�ϸ� ball
		
		Scanner scan=new Scanner(System.in);
		
		//��ǻ�Ͱ� �߻��� ���� 1��
		int com1=0;
		int com2=0;
		int com3=0;
		
		do {
		    // 1���� 9������ ���� �߻�
			com1=new Random().nextInt(9)+1;
			com2=new Random().nextInt(9)+1;
			com3=new Random().nextInt(9)+1;
		
		}while(com1==com2 || com1==com3 || com2==com3 );
		//----------------------��ǻ�� ���� �غ� �Ϸ�-------------------
		
		//����ڰ� �Է��� ��
		int user1=0;
		int user2=0;
		int user3=0;
		while(true) {
			System.out.println("1 ~ 9 ������ ���ڸ� �Է��ϼ���");
			System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
			user1=scan.nextInt();
			System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
			user2=scan.nextInt();
			System.out.print("����° ���ڸ� �Է��ϼ��� : ");
			user3=scan.nextInt();
			
			int strike=0;
			int ball=0;
			
			//���࿡ com1�� ����ڰ� �Է��� ù��°(user1) ���ڰ� ���� ���
			if(user1==com1) //���ڿ� �ڸ����� ��� �¾��� ���
				strike++; //strike=strike+1
			else if((user1==com2) || (user1==com3)) //�ڸ��� �ٸ����
				ball++;
			// -------------------------------------------------------
			if(user2==com2) 
				strike++;
			else if((user2==com1) || (user2==com3)) //�ڸ��� �ٸ����
				ball++;
			//--------------------------------------------------------
			if(user3==com3) //���ڿ� �ڸ����� ��� �¾��� ���
				strike++; //strike=strike+1
			else if((user3==com2) || (user3==com1)) //�ڸ��� �ٸ����
				ball++;
			//-----------------------------------------------------
			if(strike==3) {
				System.out.println("����!! - "+com1+" "+com2+" "+com3);
				break;
			}else {
				if((strike>0)||(ball>0))
					System.out.println(strike+"Strike, "+ball+"Ball");
				else //�ƹ��� ��ġ���� ����
					System.out.println("OUT!!"); //inner if end
				System.out.println("===============================");
			}//outter if end
		}//while
	}//main
}//class
