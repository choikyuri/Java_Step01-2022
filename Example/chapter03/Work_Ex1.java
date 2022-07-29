package Example.chapter03;

import java.util.Scanner;

public class Work_Ex1 {
	/*Scannerë¥? ?†µ?•´ ? •?ˆ˜ n?„ ?…? ¥ë°›ëŠ”?‹¤.
	ê·¸ë¦¬ê³? 1ë¶??„° ?…? ¥ë°›ì? ? •?ˆ˜ nê¹Œì??˜ ?•©?„ ê³„ì‚°?•˜?—¬ ê·? ê²°ê³¼ë¥? ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±.
	?˜ˆë¥¼ë“¤?–´ ? •?ˆ˜ 5ë¥? ?…? ¥ë°›ìœ¼ë©?, 1 + 2 + 3 + 4 + 5?˜ ?—°?‚°ê²°ê³¼?¸ 15ë¥? ì¶œë ¥?•´?•¼ ?•œ?‹¤. */
	
	public static void main(String[] args) {
		int result = 0;
		
		System.out.print("?ˆ«??…? ¥ : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++){
			result += i;
		}		
		System.out.println("ê²°ê³¼ : " + result);

	}

}
