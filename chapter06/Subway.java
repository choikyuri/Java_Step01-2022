package chapter06;

public class Subway {
	
	//�ʵ�
	public String lineNumber;
	int passengerCount; //�°���
	int money; //����
	
	public Subway() {
		// TODO Auto-generated constructor stub
	}
	
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take(int money) {
		this.money+=money; //������ ���� ����
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber+"�� �°��� "+passengerCount+"���̰�, ������ "+money+"�� �Դϴ�.");
	}

}
