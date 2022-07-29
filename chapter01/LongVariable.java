package chapter01;

public class LongVariable {

	public static void main(String[] args) {
		
		//int num1=12345678900; //32비트 = 4Byte
		long num2=12345678900L;
		long num3=1000; //long형의 64비트이지만 L로 long 선언을 안했으므로 int로 인식 
		
		int level; //정수형으로 선언만
		level=10; //level이라는 변수방에 리터널값 10을 저장 
		
		System.out.println(num2+num3); //결과는 long
		System.out.println(level);

	}

}
