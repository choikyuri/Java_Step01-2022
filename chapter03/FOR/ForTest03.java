package chapter03.FOR;

public class ForTest03 {

	public static void main(String[] args) {
		//1부터 100까지의 합을 구하되 합이 100이하이면서 가장 큰수
		/*방법1
		System.out.println("1부터 100까지의 합을 구하되 합이 100미만이면서 가장 큰수");
		
		int i;
		int sum=0;
		for(i=1;i<=100;i++) {
			sum+=i;
			//if문
			if(sum<100)
			System.out.println("숫자 "+i +"까지의 합 : " + sum +"입니다");	
		}
		*/
		//방법2
		
		System.out.println("1부터 100까지의 합을 구하되 합이 100미만이면서 가장 큰수");
		int i;
		int sum=0;
		for(i=1;i<=100;i++) {
			sum+=i;
			//if문
			if(sum>=100)
			  break;
		}
		System.out.println("해당 숫자 : "+ (i-1) +"입니다");
		System.out.println("숫자 "+(i-1) +"까지의 합 : " + (sum-i) +"입니다");	
		
		/*방법3 
		System.out.println("1부터 100까지의 합을 구하되 합이 100을 초과하는 첫번째 수와 합");
		int i;
		int sum=1;
		for(i=1;sum<100;i++) {
			sum+=i;
		}
		
		System.out.println("숫자 "+ (i-1) +"까지의 합 : " + (sum-i) +"입니다");	
	
		*/
		
		
		
		
		
		
	}

}
