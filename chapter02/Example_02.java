package chapter02;

public class Example_02 {

	public static void main(String[] args) {
		//���� ���̸� ���Ͻÿ�(������*������*3.14)
		//������ : 10, 3.14�� double�� �����Ͽ� ���Ͻÿ�
		//������ ������ num1 / 3.14 ������ pi /���� ������ result
		
		//���1
		int num1=10;
		double pi=3.14;
		
		//���2
		//int num1=10;
		//int num2=3;
		//int num3=14;
		
		//�� ������ �ڷ�Ÿ������ int�� ������ ����ȯ
		double result=num1*num1*pi;
		
		//int -> double : Double.parseDouble
		//String -> int :Integer.parseInt
		
		//double result=num1*num1*Double.parseDouble(num2 +"."+num3);
		System.out.println("���� ���̴� : " + result);
		
		
		
	}

}
