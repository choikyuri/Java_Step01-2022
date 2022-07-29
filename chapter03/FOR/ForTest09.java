package chapter03.FOR;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
		// 몇명의 성적을 입력 받을 것이지 정수로 인원수를 입력받아 총점과 평균을 구하시오(단 평균은 실수로 출력한다)
		
		Scanner scn=new Scanner(System.in);
		
		int i, sum=0, avg=0, score, cnt=0;
		//입력
		System.out.println("몇명의 학생 점수를 입력 받으시겠어요? "); 
		int stu=scn.nextInt(); 
		
		for(i=1;i<=stu;i++) {
			System.out.print(i +"번째 학생의 점수를 입력하세요: ");
			score=scn.nextInt(); 
			sum +=score;
			cnt++;  //인원수 누적
		}
		//평균
		avg=sum/cnt;
		System.out.println("총점 : " +sum+ ", 평균 : " + (double)avg);

	}

}
