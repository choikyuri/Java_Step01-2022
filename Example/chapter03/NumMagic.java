package Example.chapter03;

import java.util.Scanner;

public class NumMagic {

	public static void main(String[] args) {
		String select; //yes ?˜¹?? noë¥? ?„ ?ƒ?•˜ê¸? ?œ„?•œ ë³??ˆ˜
		int result = 0; //?‚¬?š©?ê°? ?ƒê°í•œ ?ˆ«?ë¥? ì¶œë ¥?•˜ê¸? ?œ„?•œ ë³??ˆ˜
		System.out.println("1 ~ 30 ?‚¬?´?˜ ?ˆ«?ë¥? ë¨¸ë¦¬?†?œ¼ë¡? ?ƒê°í•˜?„¸?š”");
		System.out.println("04 05 06 07 12");
		System.out.println("13 14 15 20 21");
		System.out.println("22 23 28 29 30");
		
		System.out.print("?—¬ê¸°ì— ?‹¹?‹ ?´ ?ƒê°í•œ ?ˆ«?ê°? ?ˆ?Šµ?‹ˆê¹?? - y | n : ");
		Scanner scan = new Scanner(System.in);
		select = scan.next();

		if(select.equals("y"))
			result += 4;
		
		System.out.println("--------------------------------");
		System.out.println("16 17 18 19 20");
		System.out.println("21 22 23 24 25");
		System.out.println("26 27 28 29 30");
		
		System.out.print("?—¬ê¸°ì— ?‹¹?‹ ?´ ?ƒê°í•œ ?ˆ«?ê°? ?ˆ?Šµ?‹ˆê¹?? - y | n : ");
		select = scan.next();
		
		if(select.equals("y"))
			result += 16;
		
		
		System.out.println("--------------------------------");
		System.out.println("01 03 05 07 09");
		System.out.println("11 13 15 17 19");
		System.out.println("21 23 25 27 29");
		
		System.out.print("?—¬ê¸°ì— ?‹¹?‹ ?´ ?ƒê°í•œ ?ˆ«?ê°? ?ˆ?Šµ?‹ˆê¹?? - y | n : ");
		select = scan.next();
		
		if(select.equals("y"))
			result += 1;
		
		
		System.out.println("--------------------------------");
		System.out.println("08 09 10 11 12");
		System.out.println("13 14 15 24 25");
		System.out.println("26 27 28 29 30");
		
		System.out.print("?—¬ê¸°ì— ?‹¹?‹ ?´ ?ƒê°í•œ ?ˆ«?ê°? ?ˆ?Šµ?‹ˆê¹?? - y | n : ");
		select = scan.next();
		
		if(select.equals("y"))
			result += 8;
		
		System.out.println("--------------------------------");
		System.out.println("02 03 06 07 30");
		System.out.println("10 11 14 15 18");
		System.out.println("19 22 23 26 27");
		
		System.out.print("?—¬ê¸°ì— ?‹¹?‹ ?´ ?ƒê°í•œ ?ˆ«?ê°? ?ˆ?Šµ?‹ˆê¹?? - y | n : ");
		select = scan.next();
		
		if(select.equals("y"))
			result += 2;
				
		System.out.println("-------------------------------");
		System.out.println("?‹¹?‹ ?´ ?ƒê°í•œ ?ˆ«??Š” " + result + "?…?‹ˆ?‹¤.");
	}
}	