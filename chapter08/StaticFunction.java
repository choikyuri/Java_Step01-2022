package chapter08;

public class StaticFunction {
	
	String str1="�Ϲ� ȸ���� ����";
	static String str2="Static ȸ������";
	
	public static String getStatic() {
		
		//return str1; //ERROR : static�޼���� static�� return�� �����ϴ�
		return str2;
	}

}
