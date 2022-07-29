package Example.chapter03;

import java.util.Scanner;

public class Work_Ex4 {
	/* 키보드에서 숫자를 두 개 입력 받아, 입력받은 두 수의 최대공약수 구하기.
		예를들어 10과 4를 입력받았다면 2가,
         3과 7을 입력받았다면 “최대공약수가 없습니다”라는 문자열이 출력 되어야 한다. */
	public static void main(String[] args) {
		
		int n1 = 0, n2 = 0;
		int check = 0;

		System.out.print("첫번째 숫자입력 : ");
		Scanner scan = new Scanner(System.in);
		n1 = scan.nextInt();

		System.out.print("두번째 숫자입력 : ");
		n2 = scan.nextInt();

		if(n1 >= n2)
			check = n2;
		else
			check = n1;

		int i;
		for (i = check; i >= 1; i--) {
			if ((n1 % i == 0) && (n2 % i == 0)) {
				break;
			}
		}
		
		if (i == 1) {//두 숫자에는 1이외의 공통된 약수가 없다는 의미.
			System.out.print("최대공약수가 없습니다.");	
		}else {
			System.out.print("최대공약수 : " + i);
		}

	}

}
