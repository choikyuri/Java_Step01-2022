package chapter04;

public class ArgsTest01 {

	public static void main(String[] args) {
		
		//배열선언 방법1
		int a[]=new int[5]; //Fixed-length
		
		//배열선언 방법2
	    int[] b;
	    b=new int[5];
	    
	    int aVal;
	    int bVal;
	    int Tot;
	    
	   //배열선언 방법3
	   args=new String[2];
	   args[0]="1";
	   args[1]="2";
	   
	   //length : 배열의 메모리 수
	   if(args.length == 2 ) {
		   aVal=Integer.parseInt(args[0]);  
		   bVal=Integer.parseInt(args[1]);  
	   }else {
		   aVal=0;
		   bVal=0;
	   }
	 
	   	Tot=aVal+bVal;
	   	System.out.println(Tot);
				
				
	}

}
