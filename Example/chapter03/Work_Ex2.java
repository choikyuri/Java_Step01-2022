package Example.chapter03;

import java.util.Scanner;

public class Work_Ex2 {
	/* Scannerλ₯? ?΅?΄ ? ? n1, n2λ₯? ?? ₯λ°λ?€.
	κ·Έλ¦¬κ³? n1λΆ??° n2κΉμ?? ?©? κ³μ°??¬ κ·? κ²°κ³Όλ₯? μΆλ ₯?? ?λ‘κ·Έ?¨? ??±.
	?λ₯Όλ€?΄ 2?? 5λ₯? ?? ₯λ°μΌλ©?, 2 + 3 + 4 + 5? ?°?°κ²°κ³Ό?Έ 14λ₯? μΆλ ₯?΄?Ό ??€ */
	public static void main(String[] args) {
		
		int n1 = 0, n2 = 0;
		int result = 0;
		
		System.out.print("μ²«λ²μ§? ?«??? ₯ : ");
		Scanner scan = new Scanner(System.in);
		n1 = scan.nextInt();
		
		System.out.print("?λ²μ§Έ ?«??? ₯ : ");
		n2 = scan.nextInt();
		
		//?Ή? ?€?? ?¬?©?κ³? ?Ά?€λ©?...
		if(n1 > n2){
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}

		for(int i = n1; i <= n2; i++){
			result += i;
		}
		
		System.out.println("κ²°κ³Ό : " + result);

	}

}
