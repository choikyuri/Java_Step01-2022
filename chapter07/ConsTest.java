package chapter07;

public class ConsTest {
	
	private int aa;
	private int bb;
	
	public ConsTest() {}
	
	//������ �����ε��� ���ؼ� ������� �ʱ�ȭ
	public ConsTest (int aa, int bb) {
		this.aa=aa;
		this.bb=bb;
	}
	
	public static void main(String[] args) {
		
		ConsTest obj1=new ConsTest();
		obj1.aa=10; //��������� private�̿��� ���� Ŭ������ ������ �����ϹǷ� ��밡��
		obj1.bb=20;
		System.out.println(obj1.aa);
		System.out.println(obj1.bb);
		
		ConsTest obj2=new ConsTest(30,40);
		System.out.println(obj2.aa);
		System.out.println(obj2.bb);
		
		
		
		
	}

}
