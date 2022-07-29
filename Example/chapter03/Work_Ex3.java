package Example.chapter03;

import java.util.Scanner;

public class Work_Ex3 {
	/* ?‚¤ë³´ë“œ?—?„œ ?ˆ«?ë¥? ?‘ ê°? ?…? ¥ ë°›ì•„, ?…? ¥ë°›ì? ?‘ ?ˆ˜?˜ ìµœì†Œê³µë°°?ˆ˜ êµ¬í•˜ê¸?.
		?˜ˆë¥¼ë“¤?–´ 2?? 5ë¥? ?…? ¥ë°›ì•˜?‹¤ë©? 10?„, 
         3ê³? 3?„ ?…? ¥ë°›ì•˜?‹¤ë©? 3?´ ì¶œë ¥?˜?–´?•¼ ?•œ?‹¤. */
	public static void main(String[] args) {
		
		int n1 = 0, n2 = 0;
		
		System.out.print("ì²«ë²ˆì§? ?ˆ«??…? ¥ : ");
		Scanner scan = new Scanner(System.in);
		n1 = scan.nextInt();
		
		System.out.print("?‘ë²ˆì§¸ ?ˆ«??…? ¥ : ");
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
		System.out.println("ìµœì†Œê³µë°°?ˆ˜?Š” " + i);

	}

}
