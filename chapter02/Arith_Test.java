package chapter02;

public class Arith_Test {

	public static void main(String[] args) {
		
		int mathScore=93;
		int engScore=87;
		
		//ÃÑÁ¡°ú Æò±ÕÀ» Ãâ·ÂÇÏ½Ã¿À + /
		
		//ÃÑÁ¡
		System.out.println("ÃÑÁ¡: " + (mathScore + engScore));
		// Æò±Õ
		System.out.println("Æò±Õ: " + (mathScore + engScore)/2);
		
		int total=mathScore+engScore;
		System.out.println("ÃÑÁ¡: " +total);
				
		float average=total/2;
		System.out.println("Æò±Õ: " +average);
	}

}
