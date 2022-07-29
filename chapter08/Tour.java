package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    
    System.out.print("������ �� : ");
    int n=scan.nextInt();
    
    //�ʱ�ȭ�Ǹ鼭(�������� ���ο�) �޸� Ȯ�� �� ������
    Guide guide=new Guide(n);
    
    System.out.println("������ ���");
    for(int i =0;i<n;i++) {
    	System.out.print((i+1)+". �̸� : ");
    	String name=scan.next();
    	guide.guest[i].setName(name);
    	
    	System.out.print((i+1)+". ���� : ");
    	guide.guest[i].setGender(scan.next());
    }
    
   outer: while(true) {
		System.out.println("1. ������ ����");
		System.out.println("2. ������ ����");
		System.out.println("3. ����");
		
		System.out.print("����>> ");
		int select=scan.nextInt();
		
		switch(select) {
		case 1:
			for(int i=0;i<n;i++) {
				System.out.println((i+1)+". �̸� : "+guide.guest[i].getName());
				System.out.println((i+1)+". ���� : "+guide.guest[i].getGender());
				System.out.println((i+1)+". ������ : "+guide.guest[i].getPoint());
			}
			break;
			
		case 2:
			System.out.print("���� �����Ͻðڽ��ϱ�?");
			Guide.point=scan.next();
			System.out.println(Guide.point+"�� ����Ǿ����ϴ�");
			System.out.println("----------------------");
			break;
		
		case 3:
			System.out.println("����");
			break outer;
			
			}//switch
		}//while
	}//main
}//class
