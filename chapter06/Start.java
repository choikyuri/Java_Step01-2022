package chapter06;

import java.util.Random;
//UP DOWN�� �̿��Ͽ� System�� ���� �ִ� ī���� ��ȣ�� ���߱� ������ result=SUCCESS�� �Է��ϰ� 
// ������� ���߾����� ����϶�
public class Start {
	
	//�ȵ�
	private int random=new Random().nextInt(50)+1;
	private int count=0;
	private String result="FAIL";
	
	//�⺻ ������
	
	
	public String check(int mynumber) {
		
		count++;
		//random������ mynumber���� ������ UP / ũ�� DOWN / result="SUCCESS"
		if(random > mynumber) {
			System.out.println("UP!!");
		}else if(random < mynumber) {
			System.out.println("DOWN!!");
		}else {
			System.out.println(count + "ȸ ���� ����!!!");
			result="SUCCESS";
		}	
		return result;
	}

}
