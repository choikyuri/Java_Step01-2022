package Example.chapter04;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int studentNum = 0;
		int scores[] = null;
		boolean run = true;
		int grade = 0;
		int sum = 0;
		double avg = 0.0;
		int max = 0;

		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1. ?��?��?�� | 2. ?��?��?��?��  | 3. ?��?��리스?�� | 4.분석  | 5. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("?��?�� > ");

			a = s.nextInt();

			switch (a) {

			case 1:
				System.out.print("?��?��?�� ?��?�� : ");
				studentNum = s.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print(i + 1 + "번째 ?��?��?�� ?��?�� ?��?�� : ");
					grade = s.nextInt();
					scores[i] = grade;

				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번째 ?��?��?�� ?��?��?�� ->" + scores[i]);
				}
				break;

			case 4:
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if(scores[i]>=max) {
						max = scores[i];
					}
				}
				
				avg = (double) sum / scores.length;
				System.out.println("?��?��?�� 총합?? : " + sum);
				System.out.println("?��균�? : " + avg);
				System.out.println("최�?�?  : "+max);
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("?��로그?�� 종료?��?��?��?��?��.");

	}

	}


