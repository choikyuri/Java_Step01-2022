package chapter04;

public class ArgsTest01 {

	public static void main(String[] args) {
		
		//�迭���� ���1
		int a[]=new int[5]; //Fixed-length
		
		//�迭���� ���2
	    int[] b;
	    b=new int[5];
	    
	    int aVal;
	    int bVal;
	    int Tot;
	    
	   //�迭���� ���3
	   args=new String[2];
	   args[0]="1";
	   args[1]="2";
	   
	   //length : �迭�� �޸� ��
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
