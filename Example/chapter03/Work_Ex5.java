package Example.chapter03;

import java.util.Scanner;

public class Work_Ex5 {

	public static void main(String[] args) {
		int n = 0;
		//?��보드?��?�� ?��?���? ?��?��받으�? �? ?��?���? ?��?��?���? ?��?���?�? ?��별해주는 코드 ?��?��.
		System.out.println("?��?���? ?��?��?��?��?�� : ");
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		int i = 0;
		for(i = 2; i <= n; i++){
			
			if(n % i == 0){
				break;
			}
		}
		
		if(i == n)
			System.out.println(n + "??(?��) ?��?��?��?��?��.");
		else{
			System.out.println(n + "??(?��) ?��?���? ?��?��?��?��.");
		}
	}

}
