package chapter05;

public class FunTest_Overloading {

	//�ʵ�=�������
	
	//������(����Ʈ ����)
	
	//----------------------------
	//�������� �����Ѵ�
	//Overloading : �޼������ ���ϼ� �ְ� ����ؾ��ϴ� ��� �޼����� �Ű������� ������ ������ �ٸ����Ͽ� �����Ѵ�
	public void getResult(int n) {
		System.out.println(n +"��(��) int�Դϴ�");
	}
	public void getResult(char n) {
		System.out.println(n +"��(��) char�Դϴ�");
	}
	public void getResult(String n) {
		System.out.println(n);
	}
	
	public void getResult(int n, String str) {
		System.out.println(n +str+"�Դϴ�");
	}
	
	

}
