package Example.chapter03;

import java.util.Scanner;

public class Work_Ex3 {
	/* ?€λ³΄λ?? ?«?λ₯? ? κ°? ?? ₯ λ°μ, ?? ₯λ°μ? ? ?? μ΅μκ³΅λ°°? κ΅¬νκΈ?.
		?λ₯Όλ€?΄ 2?? 5λ₯? ?? ₯λ°μ?€λ©? 10?, 
         3κ³? 3? ?? ₯λ°μ?€λ©? 3?΄ μΆλ ₯??΄?Ό ??€. */
	public static void main(String[] args) {
		
		int n1 = 0, n2 = 0;
		
		System.out.print("μ²«λ²μ§? ?«??? ₯ : ");
		Scanner scan = new Scanner(System.in);
		n1 = scan.nextInt();
		
		System.out.print("?λ²μ§Έ ?«??? ₯ : ");
		n2 = scan.nextInt();
		
		int i = 0;
		for(i = 1; i <= n1 * n2; i++){
			
			if(i % n1 == 0 && i % n2 == 0)
				break;						
		}
		//while(true){
			//i++;
			//if(i % n1 == 0 && i % n2 == 0)
				//break;
		//}

		//int i = 1;	
		//while(!(i % n1 == 0 && i % n2 == 0)){
			//i++;
		//}
		System.out.println("μ΅μκ³΅λ°°?? " + i);

	}

}
