package chapter08;

public class StaticFunction {
	
	String str1="일반 회원의 변수";
	static String str2="Static 회원변수";
	
	public static String getStatic() {
		
		//return str1; //ERROR : static메서드는 static만 return이 가능하다
		return str2;
	}

}
