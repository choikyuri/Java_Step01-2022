package Example.chapter03;

import java.util.Scanner;

public class Work_Ex3 {
	/* ?��보드?��?�� ?��?���? ?�� �? ?��?�� 받아, ?��?��받�? ?�� ?��?�� 최소공배?�� 구하�?.
		?��를들?�� 2?? 5�? ?��?��받았?���? 10?��, 
         3�? 3?�� ?��?��받았?���? 3?�� 출력?��?��?�� ?��?��. */
	public static void main(String[] args) {
		
		int n1 = 0, n2 = 0;
		
		System.out.print("첫번�? ?��?��?��?�� : ");
		Scanner scan = new Scanner(System.in);
		n1 = scan.nextInt();
		
		System.out.print("?��번째 ?��?��?��?�� : ");
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
		System.out.println("최소공배?��?�� " + i);

	}

}
