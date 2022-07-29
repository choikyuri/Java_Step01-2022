package chapter03.IF;

public class ifExample06 {

	public static void main(String[] args) {
		
		int num=(int)(Math.random()*6)+1;
		//double num1=Math.random()*6;
		
		//1Á¡ ~ 6Á¡±îÁö ¹ŞÀ»¼ö ÀÖÀ½ °¢ Á¡¼ö´ç ÀÌº¥Æ®¸¦ Ãâ·Â
		if(num==1)
		{
			System.out.println("1Á¡ ¼ø´ë");
		}
		else if(num==2)
		{
			System.out.println("2Á¡ Æ¢±è");
		}
		else if(num==3)
		{
			System.out.println("3Á¡ ¶±ººÀÌ");
		}
		else if(num==4)
		{
			System.out.println("4Á¡ ·ÎÁ¦¶±ººÀÌ");
		}
		else if(num==5)
		{
			System.out.println("5Á¡ ºĞ¸ğÀÚ¶±ººÀÌ");
		}
		else
		{
			System.out.println("6Á¡ Ä¡ÁîÆøÅº¶±ººÀÌ + ÁÖ¸Ô¹ä");
		}	
	}

}


