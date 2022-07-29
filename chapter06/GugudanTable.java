package chapter06;

public class GugudanTable {
	
	//필드
	
	//기본 생성자
	
	
	//메서드
	public void showTable(int num) {
		System.out.println(num + "단");
		for(int i=1;i<=9;i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}//for
	}//method

}//class
