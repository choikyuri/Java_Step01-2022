package Example.chapter03;

import java.util.Scanner;

public class Work_Ex1 {
	/*Scannerλ₯? ?΅?΄ ? ? n? ?? ₯λ°λ?€.
	κ·Έλ¦¬κ³? 1λΆ??° ?? ₯λ°μ? ? ? nκΉμ?? ?©? κ³μ°??¬ κ·? κ²°κ³Όλ₯? μΆλ ₯?? ?λ‘κ·Έ?¨? ??±.
	?λ₯Όλ€?΄ ? ? 5λ₯? ?? ₯λ°μΌλ©?, 1 + 2 + 3 + 4 + 5? ?°?°κ²°κ³Ό?Έ 15λ₯? μΆλ ₯?΄?Ό ??€. */
	
	public static void main(String[] args) {
		int result = 0;
		
		System.out.print("?«??? ₯ : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++){
			result += i;
		}		
		System.out.println("κ²°κ³Ό : " + result);

	}

}
