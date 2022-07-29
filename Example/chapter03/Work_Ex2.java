package Example.chapter03;

import java.util.Scanner;

public class Work_Ex2 {
	/* Scannerë¥? ?†µ?•´ ? •?ˆ˜ n1, n2ë¥? ?ž…? ¥ë°›ëŠ”?‹¤.
	ê·¸ë¦¬ê³? n1ë¶??„° n2ê¹Œì??˜ ?•©?„ ê³„ì‚°?•˜?—¬ ê·? ê²°ê³¼ë¥? ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?ž¨?„ ?ž‘?„±.
	?˜ˆë¥¼ë“¤?–´ 2?? 5ë¥? ?ž…? ¥ë°›ìœ¼ë©?, 2 + 3 + 4 + 5?˜ ?—°?‚°ê²°ê³¼?¸ 14ë¥? ì¶œë ¥?•´?•¼ ?•œ?‹¤ */
	public static void main(String[] args) {
		
		int n1 = 0, n2 = 0;
		int result = 0;
		
		System.out.print("ì²«ë²ˆì§? ?ˆ«?ž?ž…? ¥ : ");
		Scanner scan = new Scanner(System.in);
		n1 = scan.nextInt();
		
		System.out.print("?‘ë²ˆì§¸ ?ˆ«?ž?ž…? ¥ : ");
		n2 = scan.nextInt();
		
		//?˜¹?‹œ ?Š¤?™‘?„ ?‚¬?š©?•˜ê³? ?‹¶?‹¤ë©?...
		if(n1 > n2){
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}

		for(int i = n1; i <= n2; i++){
			result += i;
		}
		
		System.out.println("ê²°ê³¼ : " + result);

	}

}
