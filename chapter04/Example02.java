package chapter04;

public class Example02 {

	public static void main(String[] args) {

		int[][] array= { {95,86}, {83,92,96}, {78,83,93,87,88} };
		
		int sum=0;
		double avg=0.0;
		int total=0;
		
		int count=0;
		
		//for문을 이용하여 각각의 합계(sum)를 구하시오
		/*
		for (int[] num : array) {
			for (int score : num) {
				sum += score;
			}
			count++;
			System.out.println(count+"번째 학생의 합계:"+sum);
		}
		*/
		/*
		 * 
		int sum[]=new int[3]; 
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum[i]+=array[i][j];
			}
			System.out.println("각 점수의 합 : "+sum[i]);
		}
	*/
	
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];//0,0 0,1 / 1,0 1,1 1,2 / 2,0 2,1 2,2 2,3 2,4
				count++;
			}
			avg=(double)sum/array[i].length;
			
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + Math.round(avg));
			
			total +=sum; //전체 총점
			sum=0; //초기화
			avg=0.0; //초기화
			
			System.out.println("---------------------");
		}
		//전체 평균
		double totalavg=(double)total/count;
		
		System.out.println("전체 총점 : "+total);
		System.out.println(String.format("전체 평균 : %.2f", totalavg));
	
	}

}














