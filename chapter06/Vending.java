package chapter06;

public class Vending {
	
	//멤버변수
	private Can can[]=new Can[5]; //선언
	private int money;
	
	//디폴트 생성자
	
	//객체를 초기화 시켜주는 메서드
	public void init() {
		can[0]=new Can("환타", 1000);
		can[1]=new Can("사이다" , 1200); 
		can[2]=new Can("제로콜라" , 1500); 
		can[3]=new Can("오렌지쥬스" , 1100); 
		can[4]=new Can("바나나우유" , 1400); 
	}
	
	//사용 가능한 음료만 출력하기 메서드
	public void showCans(int m) {
		 
		money=m; //1300
		
		for(int i=0;i<can.length;i++) {
			
			if(can[i].getPrice()<=money) {
				System.out.println("이름: "+can[i].getCanName()+" "+"가격: "+can[i].getPrice());
			}//if			
		}//for
	}//method
	
	//선택한 음료수 제공과 잔액 Output
	public void outCan(String name) {
		
		for(int i=0;i<can.length;i++) {
			if(can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName()+"을 선택하셨습니다. 맛있게 드세요");
				System.out.println("잔액 : "+(money-can[i].getPrice())+ "원");
			}//if
		}//for
	}//method
}//class














