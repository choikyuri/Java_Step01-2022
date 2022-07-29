package chapter05;

public class MethodMain {

	public static void main(String[] args) {
		
		//按眉 积己
		Method bread=new Method();
	
		bread.makeBread();
		System.out.println("------------------------");
		bread.makeBread(5);
		System.out.println("-------------------------");
        bread.makeBread(5, "积农覆");
	}

}
