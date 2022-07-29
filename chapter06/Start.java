package chapter06;

import java.util.Random;
//UP DOWN을 이용하여 System이 갖고 있는 카드의 번호를 맞추기 성공시 result=SUCCESS를 입력하고 
// 몇번만에 맞추었는지 출력하라
public class Start {
	
	//팔드
	private int random=new Random().nextInt(50)+1;
	private int count=0;
	private String result="FAIL";
	
	//기본 생성자
	
	
	public String check(int mynumber) {
		
		count++;
		//random값보다 mynumber값이 작으면 UP / 크면 DOWN / result="SUCCESS"
		if(random > mynumber) {
			System.out.println("UP!!");
		}else if(random < mynumber) {
			System.out.println("DOWN!!");
		}else {
			System.out.println(count + "회 만에 정답!!!");
			result="SUCCESS";
		}	
		return result;
	}

}
