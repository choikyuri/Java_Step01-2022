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
			System.out.println("1. ??? | 2. ? ??? ₯  | 3. ? ?λ¦¬μ€?Έ | 4.λΆμ  | 5. μ’λ£");
			System.out.println("-------------------------------------------------------");
			System.out.print("? ? > ");

			a = s.nextInt();

			switch (a) {

			case 1:
				System.out.print("??? ?? ₯ : ");
				studentNum = s.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print(i + 1 + "λ²μ§Έ ??? ? ? ?? ₯ : ");
					grade = s.nextInt();
					scores[i] = grade;

				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "λ²μ§Έ ??? ? ?? ->" + scores[i]);
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
				System.out.println("? ?? μ΄ν©?? : " + sum);
				System.out.println("?κ· μ? : " + avg);
				System.out.println("μ΅λ?κ°?  : "+max);
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("?λ‘κ·Έ?¨ μ’λ£???΅??€.");

	}

	}


