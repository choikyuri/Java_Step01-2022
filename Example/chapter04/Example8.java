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
		for(int i=0; i<array.length ; i++) { //?–‰ 3ë²? ë°˜ë³µ 0, 1, 2
			//inner for
			for(int j=0; j<array[i].length; j++) { //?—´ 2ë°˜ë³µ,3ë°˜ë³µ,5ë°˜ë³µ
				  sum+=array[i][j];
				  count++;
			}
			avg=(double)sum/count;
			System.out.println("sum : "+sum);
			System.out.println("avg : "+avg);
			total +=sum; //ì´ˆê¸°?™” ? „?— ?ˆ„? 
			tcount+=count; //ì´ˆê¸°?™” ? „?— ?ˆ„?  / 2, 3, 5 =10
			sum=0; //?“°? ˆê¸°ê°’ ë¹„ìš°ê¸?
			avg=0.0; //?“°? ˆê¸°ê°’ ë¹„ìš°ê¸?
			count=0; //?“°? ˆê¸°ê°’ ë¹„ìš°ê¸?
			System.out.println("---------------------");
		}
         System.out.println("==ìµœì¢… ì´í•©ê³? ?‰ê·?==");
         double avgf=(double)total/tcount;
         
         System.out.println("sum : "+total);
         System.out.println("avg : "+avgf);
	}
}
