package chapter06;

public class TryCatchThrows {
	/*
	Exception : 예기치 않은 사건(예외=예외이벤트)
	최상의 예외 클래스 Exception
	하위 예외 클래스(RuntimeException, NullPointerException(NPE),NumberFormatException,ClassCastException)
	메서드에서 예외처리를 해서 던짐(즉 메서드 구현시 try catch문을 사용해서 만듬)
	throws : 상위클래스에 전달
	throw : 사용자 정의 
	*/
	public static void fun() throws Exception{
		//System.out.println("fun() 메서드 입니다.");
		
		try {
			System.out.println("fun() 메서드 입니다.");
			throw new Exception(); 
		}catch (RuntimeException e) {
			System.out.println("예외발생"); 
		}finally { //코드의 흐름상 에러가 있던 없던 무조건 수행해야하는 부분
			System.out.println("finally 문장"); 
		}
	}
	
	public static void main(String[] args) {
		
		//fun();
		try {
			fun(); //스텍메모리
		} catch (Exception e) {
			System.out.println("main()의 catch문입니다.");
		}//t
	}//m
}//c
