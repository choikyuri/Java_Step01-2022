package chapter04;

public class ArrayCopy03 {

	public static void main(String[] args) {

		Book[] bookArray1=new Book[3]; 
		Book bookArray2[]=new Book[3]; //����
		
		
		bookArray1[0]=new Book("���̾�","�츣�� �켼");
		bookArray1[1]=new Book("�����Ӹ���","����޸�");
		bookArray1[2]=new Book("�鼳����","�׸�����");
		
		//bookArray2 ��ü ����
		bookArray2[0]=new Book();
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		
		System.out.println("----------����(bookArray1)---------");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
		}
		//���� ����
		for(int i=0;i<bookArray1.length;i++) {
			bookArray2[i].setBookName((bookArray1[i].getBookName()));
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		System.out.println();
		System.out.println("----------���纻(bookArray2)---------");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		System.out.println();
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		System.out.println("----------��������(bookArray1)---------");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println();
		System.out.println("----------���纻������� ����(bookArray2)---------");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}

	}

}
