package chapter06;

public class TryCatchThrows {
	/*
	Exception : ����ġ ���� ���(����=�����̺�Ʈ)
	�ֻ��� ���� Ŭ���� Exception
	���� ���� Ŭ����(RuntimeException, NullPointerException(NPE),NumberFormatException,ClassCastException)
	�޼��忡�� ����ó���� �ؼ� ����(�� �޼��� ������ try catch���� ����ؼ� ����)
	throws : ����Ŭ������ ����
	throw : ����� ���� 
	*/
	public static void fun() throws Exception{
		//System.out.println("fun() �޼��� �Դϴ�.");
		
		try {
			System.out.println("fun() �޼��� �Դϴ�.");
			throw new Exception(); 
		}catch (RuntimeException e) {
			System.out.println("���ܹ߻�"); 
		}finally { //�ڵ��� �帧�� ������ �ִ� ���� ������ �����ؾ��ϴ� �κ�
			System.out.println("finally ����"); 
		}
	}
	
	public static void main(String[] args) {
		
		//fun();
		try {
			fun(); //���ظ޸�
		} catch (Exception e) {
			System.out.println("main()�� catch���Դϴ�.");
		}//t
	}//m
}//c
