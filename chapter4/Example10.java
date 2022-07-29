package chapter4;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		
		boolean run = true;

		int studentNum = 0;
		int[] scores = null;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.�븰�깮�닔 | 2.�젏�닔�엯�젰 | 3.�젏�닔由ъ뒪�듃 | 4.遺꾩꽍 | 5.醫낅즺");
			System.out.println("--------------------------------------------------------------");
			System.out.print("�꽑�깮> ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.print("�븰�깮�닔> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("理쒓퀬 �젏�닔: " + max);
				System.out.println("�룊洹� �젏�닔: " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("�봽濡쒓렇�옩 醫낅즺");
	}


	}


