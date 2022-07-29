package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		
		StaticFunction st=new StaticFunction();
		//멤버변수를 참조하여 Static 회원변수 출력
		
		System.out.println(st.str1);
		System.out.println(st.str2);
		System.out.println(StaticFunction.str2);
		
		//메서드를 이용하여 Static 회원변수 출력
		System.out.println(st.getStatic());
		System.out.println(StaticFunction.getStatic());

	}

}
