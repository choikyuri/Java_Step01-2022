package chapter03.SWITCH;

public class SwitchCase05 {

	public static void main(String[] args) {
		System.out.print("주사위 점수 : ");
		int num=(int)(Math.random()*10)+1;
		/*
		switch(num) {
		case 1:
			System.out.println("1점"); 
			break;
		case 2:
			System.out.println("2점"); 
			break;
		case 3:
			System.out.println("3점"); break;
		case 4:
			System.out.println("4점"); 
			break;
		case 5:
			System.out.println("5점"); break;
		case 6:
			System.out.println("6점"); break;
		default:
			System.out.println("잘못된 숫자");
		}
		*/
		
		switch (num) {
		case 1,2,3,4,5,6: {
			
			System.out.println(num + "점 획득");
			break;
		}
		default:
			System.out.println("잘못된 숫자입니다.");
		}
		
		System.out.println("주사위를 굴려 나온 숫자는 "+num+" 입니다.");
		
		
	}
}
