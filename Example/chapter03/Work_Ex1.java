package Example.chapter03;

import java.util.Scanner;

public class Work_Ex1 {
	/*Scanner�? ?��?�� ?��?�� n?�� ?��?��받는?��.
	그리�? 1�??�� ?��?��받�? ?��?�� n까�??�� ?��?�� 계산?��?�� �? 결과�? 출력?��?�� ?��로그?��?�� ?��?��.
	?��를들?�� ?��?�� 5�? ?��?��받으�?, 1 + 2 + 3 + 4 + 5?�� ?��?��결과?�� 15�? 출력?��?�� ?��?��. */
	
	public static void main(String[] args) {
		int result = 0;
		
		System.out.print("?��?��?��?�� : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++){
			result += i;
		}		
		System.out.println("결과 : " + result);

	}

}
