package chapter06;

public class CanMain {

	public static void main(String[] args) {
		/*
		//생성자를 통하여 초기화(단, 접근한정자가 public이여야함)
		Can can=new Can("딸기에이드", 3800);
		
		System.out.print("음료를 선택 : "+can.canName);
		System.out.println();
		System.out.print("가격은 : "+can.price);
		*/
		//기본 생성자를 이용할 경우
		Can can=new Can();
		
		can.setCanName("딸기에이드");
		can.setPrice(3800);
		
		String dk=can.getCanName();
		int money=can.getPrice();
		
		System.out.println("음료를 선택 : "+ dk);
		System.out.println("가격은 : "+ money);
		
		

	}

}
