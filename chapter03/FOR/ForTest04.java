package chapter03.FOR;

public class ForTest04 {

	public static void main(String[] args) {
	
		
		//0~100까지를 수중 홀수값만 합하기
		
		int total=0;
		int num;
		
		for(num=0;num<=100;num++) {
			
			if(num%2 == 0)
				continue; //그냥 가세요~~~~
			total+=num;
		}
		
		System.out.println("1~100수중 홀수의 합 : "+ total );
		
		System.out.println("=================================");
		System.out.println();
		System.out.println("1부터 20까지의 수중 홀수를 출력하세요");
		
		for(num=0; num<=20; num++) {
        	
        	if(num%2 == 1)
        		System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("=================================");
	
		for(num=0; num<=20; num++) {
			if(num%2 != 0)
			 System.out.print(num+" ");
		}
	}

}
