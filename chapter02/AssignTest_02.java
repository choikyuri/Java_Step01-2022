package chapter02;

public class AssignTest_02 {

	public static void main(String[] args) {
		
		int aVar=20;
		
		System.out.println("aVar = aVar + 10 : " + (aVar=aVar+10)); //aVar = aVar + 10 
		//aVar=30
		
		//���������� ������ Ȱ��
		System.out.println("aVar = aVar - 10 : " + (aVar-10)); //aVar-10
		//aVar=30
		
		System.out.println("aVar = aVar * 10 : " + (aVar*10)); //aVar*10
		//aVar=30
		
		//����� �Ǵ� ������
		System.out.println("aVar -=  10 : " + (aVar-=10)); //aVar=aVar-10 
		//aVar=20
		System.out.println("aVar *=  10 : " + (aVar*=10)); //aVar=aVar*10 
		//aVar=200
		System.out.println("aVar /=  10 : " + (aVar/=10)); //aVar=aVar/10 
		//aVar=20
		System.out.println("aVar %=  10 : " + (aVar%=10)); //aVar=aVar%10 =>��������
		//aVar=0
		

	}

}
