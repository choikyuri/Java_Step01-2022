package chapter03.FOR;

public class ForTest04 {

	public static void main(String[] args) {
	
		
		//0~100������ ���� Ȧ������ ���ϱ�
		
		int total=0;
		int num;
		
		for(num=0;num<=100;num++) {
			
			if(num%2 == 0)
				continue; //�׳� ������~~~~
			total+=num;
		}
		
		System.out.println("1~100���� Ȧ���� �� : "+ total );
		
		System.out.println("=================================");
		System.out.println();
		System.out.println("1���� 20������ ���� Ȧ���� ����ϼ���");
		
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
