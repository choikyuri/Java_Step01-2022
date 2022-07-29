package chapter02;

public class BitTest_01 {

	public static void main(String[] args) {
		// Bit ¿¬»ê
		int num1=2;   // 0101
		int num2=10; //  1010
		
		// Bit OR(|) + =>ÀÎ´õ±âºì 
		int result=num1 | num2;       
		System.out.println(result);    
		 // 0101
		 //+1010
	    //--------
		//  1111 => 15
		
		// Bit AND(&) * =>¿¥ÆÛ¼¾µå
		result=num1 & num2;
		System.out.println(result);
		 // 0101
		 //*1010
	    //--------
		//  0000 => 0
		
		
		// Bit XOR(^) =>Ä³·µ
		result=num1 ^ num2;
		System.out.println(result);
		// 0010
		// 1010
		//--------
		// 1000 => 8
		
		
		
		

	}

}
