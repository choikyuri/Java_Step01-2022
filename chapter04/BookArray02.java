package chapter04;

import java.util.Scanner;

public class BookArray02 {

	public static void main(String[] args) {
		
		
		
		Book[] library=new Book[5]; //heap
		
		
		library[0]=new Book("���̾�","�츣�� �켼");
		library[1]=new Book("�����Ӹ���","����޸�");
		library[2]=new Book("�鼳����","�׸�����");
		library[3]=new Book("ī������ �ſ�","�������� ��������");
		library[4]=new Book("� ����","������ �丮");
		
		/*
		library[0].showBookInfo();
		library[1].showBookInfo();
		library[2].showBookInfo();
		library[3].showBookInfo();
		library[4].showBookInfo();
		*/
		
		for(int i=0;i<library.length;i++) {
			library[i].showBookInfo();
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
