package chapter08;

public class Guide2 {
	
	static String point;
	Guest[] guest; //����
	
	//�����ε� ������
	public Guide2(int n) {
		point="�Ͽ���";
		guest=new Guest[n]; //�迭�� ����
		
	//��ü����
	for(int i=0;i<guest.length;i++) {
		guest[i]=new Guest();
	}

	}
	
	

}
