package chapter06;

import java.awt.PageAttributes;

public class Bus {
	
	//�������
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus() {}
	
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	
	public void take(int money) { //�Ű������� �°��� ����
		this.money+=money; //������ ���� ����
		passengerCount++;
	}
	
	public void showInfo() { //������ ����
		System.out.println("���� "+busNumber+"���� �°��� "+passengerCount+"���̰�, ������ "+money+"�� �Դϴ�.");
		
	}

}
