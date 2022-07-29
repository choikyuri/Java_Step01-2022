package chapter02;

public class AssignTest_04 {

	public static void main(String[] args) {
		//전위 계산
		System.out.println("==전위 연산==");
		int gameScore=150;
		int lastScore1=++gameScore; //1을 더한후 읽기
		System.out.println(lastScore1);
		System.out.println("-------------");
		int lastScore2 = --gameScore; //1을 뺀후 읽기
		System.out.println(lastScore2);
		
		
		//후위연산
		System.out.println("==후위 연산==");
		int lastScore3=gameScore++; //읽고 난 후 더하기 
		System.out.println(lastScore3); //150
		System.out.println(gameScore); //151
		System.out.println("-------------");
	

		int lastScore4=gameScore--; //읽고 난 후 더하기 
		System.out.println(lastScore4); //151
		System.out.println(gameScore); //150
		System.out.println("-------------");
		
		
	}

}
