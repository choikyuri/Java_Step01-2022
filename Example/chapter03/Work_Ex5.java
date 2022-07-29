package Example.chapter03;

import java.util.Scanner;

public class Work_Ex5 {

	public static void main(String[] args) {
		int n = 0;
		//?‚¤ë³´ë“œ?—?„œ ?ˆ«?ë¥? ?…? ¥ë°›ìœ¼ë©? ê·? ?ˆ«?ê°? ?†Œ?ˆ˜?¸ì§? ?•„?‹Œì§?ë¥? ?Œë³„í•´ì£¼ëŠ” ì½”ë“œ ?‘?„±.
		System.out.println("?ˆ«?ë¥? ?…? ¥?•˜?„¸?š” : ");
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		int i = 0;
		for(i = 2; i <= n; i++){
			
			if(n % i == 0){
				break;
			}
		}
		
		if(i == n)
			System.out.println(n + "??(?Š”) ?†Œ?ˆ˜?…?‹ˆ?‹¤.");
		else{
			System.out.println(n + "??(?Š”) ?†Œ?ˆ˜ê°? ?•„?‹™?‹ˆ?‹¤.");
		}
	}

}
