package chapter02;

public class IncreTest_01 {

	public static void main(String[] args) {
		
		int a, b, c;
		a=10;
		b=20;
		c=3;
		
		System.out.println("++a : " + (++a)); //a=a+1 �Ǵ� a+=1
		System.out.println("a++ : " + (a++)); //11
		System.out.println("������� : " + a); //12
		System.out.println("========================");
		System.out.println("c++ : "+ (c++)); //3
		System.out.println("������� : " + c); //4
		
		System.out.println("========================");
		//a������� + b�������
		//#1
		System.out.println("++a + b++ : "+(++a + b++)); //13 + 20 =33
		System.out.println("������� : " + b); //21
		System.out.println("========================");
		
		//#2
		//a������� ��� ���
		System.out.println("++a : "+ (++a)); // 14
		//b������� ��� ���
		System.out.println("b++ : "+ (b++)); // 21
		//a������� + b��������� ��� ���
		System.out.println("������� : " + b); // 22
		System.out.println("++a + b++ : " + (++a + b++)); //15 + 22 =37
		System.out.println("������� : " + b); // 23

	}

}
