package chapter06;

public class Subway {
	
	//필드
	public String lineNumber;
	int passengerCount; //승객수
	int money; //수입
	
	public Subway() {
		// TODO Auto-generated constructor stub
	}
	
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take(int money) {
		this.money+=money; //버스의 수입 증가
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber+"의 승객은 "+passengerCount+"명이고, 수입은 "+money+"원 입니다.");
	}

}
