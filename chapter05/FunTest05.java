package chapter05;

public class FunTest05 {

	public String channel;
	public int chanelInt;
	public int volume;
	
	//��������
	public FunTest05() {
	}
	
	public void channelUp(int volume) {
		System.out.println("�Ҹ��� "+ volume +"��ŭ �ø��ϴ�.");
	}
	public void channelDown(int volume) {
		System.out.println("�Ҹ��� "+ volume +"��ŭ �����ϴ�.");
	}
	
	//�����ε�
	public void channelChange(String channel) {
		System.out.println("TV ä���� "+channel+ " �� �ٲߴϴ�.");
	}
	//�����ε�
	public void channelChange(int chanelInt) {
		System.out.println("ä���� " + chanelInt + "������ �ٲߴϴ�");
	}
	
	// -------------------------------------------------------
	public static void main(String[] args) {
		
		FunTest05 tv=new FunTest05();
		
		tv.channelUp(3);
		tv.channelDown(5);
		
		tv.channelChange("TVN");
		tv.channelChange(5);
		
	}

}
