package chapter01;

public class BinaryTest2 {

	
	//카멜 : 
	public static void main(String[] args) {
		//int : 정수(4바이트) => 32비트
		// 0 => 양수 | 1 => 음수
		int num1=0B00000000000000000000000000000101;
		int num2=0B11111111111111111111111111111010; //코드오류는 아니지만 1의 보수로는 정확한 표현이 안됨(즉 + -> -)
		int num3=0B11111111111111111111111111111011; //1의 보수에 마지막 자리에 1를 더함 => 2의보수(즉 + -> -) 맨
		
		System.out.println(num1); //5
		System.out.println(num2); //-6
		System.out.println(num3); //-5

	}

}
