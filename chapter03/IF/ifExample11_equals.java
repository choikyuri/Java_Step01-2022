package chapter03.IF;

public class ifExample11_equals {

	public static void main(String[] args) {
		
		String str1="soldesk"; //인스턴스 변수(stack)
		String str2=new String("soldesk"); //객체 (heap)
		//== : 메모리 
		if(str1==str2) {
			System.out.println("두개의 값이 같습니다");
			
		}else {
			System.out.println("두개의 값이 같지않다");
		}
		
		System.out.println("-----------------------------");
		
		if(str1.equals(str2)) {
			System.out.println("두개의 값이 같습니다");
			
		}else {
			System.out.println("두개의 값이 같지않다");
		}

	}

}
