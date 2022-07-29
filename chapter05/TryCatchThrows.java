package chapter05;

public class TryCatchThrows {
	
	public static void fun() throws Exception{
		try {
			
			System.out.println("fun()硫붿꽌�뱶");
			throw new Exception();
			
		} catch (RuntimeException e) { //�떎�뻾以묒뿉 諛쒖깮�릺�뒗 �뿉�윭
			System.out.println("�삁�쇅諛쒖깮");
			
		}finally { //�뿉�윭瑜� �옟吏� 紐삵븯�뜑�씪�룄
			System.out.println("finally 臾몄옣");
		}
	}

	public static void main(String[] args) {
		
	//fun();
		try {
			fun();
		} catch (Exception e) {
			System.err.println("main()�쓽 catch臾� 臾몄옣");
		}

	}//main

}//class
