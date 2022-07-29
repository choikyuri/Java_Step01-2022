package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int num, cnt=0, sum=0;
		double avg;
		
		//0을 입력하면 중지
		while(true) {
			
			num=scn.nextInt();
			
			if(num == 0) {
				break;
			}
			
			cnt++;
			sum +=num;
			
			
		}
		//avg=sum/cnt;
		//정수형 숫자를 입력받아서 입력된 자료의 갯수
		System.out.println("입력된 자료의 갯수 : "+cnt);
		//정수형 숫자를 입력받아서 입력된 자료의 합계
		System.out.println("입력된 자료의 합계 : "+sum);
		//정수형 숫자를 입력받아서 입력된 자료의 평균(단 평균은 double)
		System.out.println("입력된 자료의 합계 : "+ sum/(double)cnt);
		
		
		

	}

}
