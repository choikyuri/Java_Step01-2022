package chapter06;

public class CanMain {

	public static void main(String[] args) {
		/*
		//�����ڸ� ���Ͽ� �ʱ�ȭ(��, ���������ڰ� public�̿�����)
		Can can=new Can("���⿡�̵�", 3800);
		
		System.out.print("���Ḧ ���� : "+can.canName);
		System.out.println();
		System.out.print("������ : "+can.price);
		*/
		//�⺻ �����ڸ� �̿��� ���
		Can can=new Can();
		
		can.setCanName("���⿡�̵�");
		can.setPrice(3800);
		
		String dk=can.getCanName();
		int money=can.getPrice();
		
		System.out.println("���Ḧ ���� : "+ dk);
		System.out.println("������ : "+ money);
		
		

	}

}
