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
			System.out.println("1. ?•™?ƒ?ˆ˜ | 2. ? ?ˆ˜?…? ¥  | 3. ? ?ˆ˜ë¦¬ìŠ¤?Š¸ | 4.ë¶„ì„  | 5. ì¢…ë£Œ");
			System.out.println("-------------------------------------------------------");
			System.out.print("?„ ?ƒ > ");

			a = s.nextInt();

			switch (a) {

			case 1:
				System.out.print("?•™?ƒ?ˆ˜ ?…? ¥ : ");
				studentNum = s.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print(i + 1 + "ë²ˆì§¸ ?•™?ƒ?˜ ? ?ˆ˜ ?…? ¥ : ");
					grade = s.nextInt();
					scores[i] = grade;

				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "ë²ˆì§¸ ?•™?ƒ?˜ ? ?ˆ˜?Š” ->" + scores[i]);
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
				System.out.println("? ?ˆ˜?˜ ì´í•©?? : " + sum);
				System.out.println("?‰ê· ì? : " + avg);
				System.out.println("ìµœë?ê°?  : "+max);
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("?”„ë¡œê·¸?¨ ì¢…ë£Œ?˜?—ˆ?Šµ?‹ˆ?‹¤.");

	}

	}


