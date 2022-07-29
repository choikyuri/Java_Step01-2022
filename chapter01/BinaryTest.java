package chapter01;

public class BinaryTest {

	// 카멜 : 맨앞에는 소문자이고 중간단어의 첫자는 대문자
	// 파스칼 : 첫글자는 무조건 대문자
	public static void main(String[] args) {
		
		int num=10;
		int bNum1=0B1000; //2진수(0B)
		int oNum=010; //8진수(OCT)
		
		int bNum2=0B10000; //2진수(0B)
		int hNum=0x10; //16진수(HEX)
		
		
		System.out.println(num);
		System.out.println(bNum1);
		System.out.println(oNum);
		System.out.println(bNum2);		
		System.out.println(hNum);

	}

}
