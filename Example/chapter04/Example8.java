package Example.chapter04;

public class Example8 {

	public static void main(String[] args) {
		
		int[][] array= {{95,86},{83,92,96},{78,83,93,87,88}};
		
		int sum=0;
		double avg=0.0;
		int total=0;
		int tcount=0;
		
		//outter for
		int count=0;
		for(int i=0; i<array.length ; i++) { //? 3λ²? λ°λ³΅ 0, 1, 2
			//inner for
			for(int j=0; j<array[i].length; j++) { //?΄ 2λ°λ³΅,3λ°λ³΅,5λ°λ³΅
				  sum+=array[i][j];
				  count++;
			}
			avg=(double)sum/count;
			System.out.println("sum : "+sum);
			System.out.println("avg : "+avg);
			total +=sum; //μ΄κΈ°? ? ? ?? 
			tcount+=count; //μ΄κΈ°? ? ? ??  / 2, 3, 5 =10
			sum=0; //?°? κΈ°κ° λΉμ°κΈ?
			avg=0.0; //?°? κΈ°κ° λΉμ°κΈ?
			count=0; //?°? κΈ°κ° λΉμ°κΈ?
			System.out.println("---------------------");
		}
         System.out.println("==μ΅μ’ μ΄ν©κ³? ?κ·?==");
         double avgf=(double)total/tcount;
         
         System.out.println("sum : "+total);
         System.out.println("avg : "+avgf);
	}
}
