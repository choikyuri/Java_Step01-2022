package chapter04;

public class ArrayCopy03 {

	public static void main(String[] args) {

		Book[] bookArray1=new Book[3]; 
		Book bookArray2[]=new Book[3]; //선언
		
		
		bookArray1[0]=new Book("데미안","헤르만 헤세");
		bookArray1[1]=new Book("빨간머리앤","몽고메리");
		bookArray1[2]=new Book("백설공주","그림형제");
		
		//bookArray2 객체 생성
		bookArray2[0]=new Book();
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		
		System.out.println("----------원본(bookArray1)---------");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
		}
		//깊은 복사
		for(int i=0;i<bookArray1.length;i++) {
			bookArray2[i].setBookName((bookArray1[i].getBookName()));
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		System.out.println();
		System.out.println("----------복사본(bookArray2)---------");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		System.out.println();
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		System.out.println("----------원본변경(bookArray1)---------");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println();
		System.out.println("----------복사본변경되지 않음(bookArray2)---------");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}

	}

}
