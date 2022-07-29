package chapter02;

public class AssignTest_02 {

	public static void main(String[] args) {
		
		int aVar=20;
		
		System.out.println("aVar = aVar + 10 : " + (aVar=aVar+10)); //aVar = aVar + 10 
		//aVar=30
		
		//독립적으로 변수방 활용
		System.out.println("aVar = aVar - 10 : " + (aVar-10)); //aVar-10
		//aVar=30
		
		System.out.println("aVar = aVar * 10 : " + (aVar*10)); //aVar*10
		//aVar=30
		
		//덮어쓰기 또는 누적값
		System.out.println("aVar -=  10 : " + (aVar-=10)); //aVar=aVar-10 
		//aVar=20
		System.out.println("aVar *=  10 : " + (aVar*=10)); //aVar=aVar*10 
		//aVar=200
		System.out.println("aVar /=  10 : " + (aVar/=10)); //aVar=aVar/10 
		//aVar=20
		System.out.println("aVar %=  10 : " + (aVar%=10)); //aVar=aVar%10 =>나머지값
		//aVar=0
		

	}

}
