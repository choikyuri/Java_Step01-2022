package chapter03.IF;

import java.util.Scanner;
//중첩 if문
public class ifExample09 {

	public static void main(String[] args) {


		int score=0;
		char grade=' ';
		char opt='0';
		
		System.out.println("점수를 입력해주세요 > ");
		
		Scanner scan=new Scanner(System.in);
		//score=Integer.parseInt(scan.nextLine());
		score=scan.nextInt(); //정수형 자료를 입력해서 score방에 저장함
		System.out.println("----------------------------");
		System.out.println("당신의 점수는 : "+score);
		
		//90이상이면 'A', 80이상이면 'B', 그밖에 'C'
		if(score >= 90) { //90이상
			grade='A';
			if(score>=98) { //98이상인 사람
				opt='+';
			}else if(score>=94) {//94이상인 사람 
				opt='-';
			}
		}else if(score >=80) {//80이상
			grade='B';
			if(score >=88) { //88이상
				opt='+';
			}else if(score >=84) { //84이상
				opt='-';
			}
		}else {
			grade='C';
		}
		System.out.println("당신의 학점은 : " + grade+ opt);
		
	}

}
