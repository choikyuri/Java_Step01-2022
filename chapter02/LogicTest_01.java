package chapter02;

public class LogicTest_01 {

	public static void main(String[] args) {
		
      char a, b;
      boolean c; //true false
      a='A';
      b='B';
      
      c=(true || true) && false; //c=true && false
      System.out.println(c);
      
  
      
      c=a<b && (a==b);
      System.out.println(c);
      System.out.println("--------------");
      
      c=a<b || (a==b);
      System.out.println(c);	
	}

}
