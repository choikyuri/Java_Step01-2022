package Example.chapter03;

import java.util.Scanner;

public class Work_Ex2 {
	/* Scanner�? ?��?�� ?��?�� n1, n2�? ?��?��받는?��.
	그리�? n1�??�� n2까�??�� ?��?�� 계산?��?�� �? 결과�? 출력?��?�� ?��로그?��?�� ?��?��.
	?��를들?�� 2?? 5�? ?��?��받으�?, 2 + 3 + 4 + 5?�� ?��?��결과?�� 14�? 출력?��?�� ?��?�� */
	public static void main(String[] args) {
		
		int n1 = 0, n2 = 0;
		int result = 0;
		
		System.out.print("첫번�? ?��?��?��?�� : ");
		Scanner scan = new Scanner(System.in);
		n1 = scan.nextInt();
		
		System.out.print("?��번째 ?��?��?��?�� : ");
		n2 = scan.nextInt();
		
		//?��?�� ?��?��?�� ?��?��?���? ?��?���?...
		if(n1 > n2){
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}

		for(int i = n1; i <= n2; i++){
			result += i;
		}
		
		System.out.println("결과 : " + result);

	}

}
