package chapter03.WHILE;

public class WhileTest02 {

	public static void main(String[] args) {
		/*
		int i=1;
		
		while(i<=10) {	
			System.out.println(i);
			i++; //i=i+1;
		}
		System.out.println("���α׷� ����");
		*/
		
		int num=1;
		int sum=0;
		
		while(num<=10) {
			
			sum += num;
			num++;
		}
		System.out.println("������ num �� : "+num);
		System.out.println("1~10������ �� : "+sum);
		
	}

}