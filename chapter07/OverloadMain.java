package chapter07;

public class OverloadMain {

	public static void main(String[] args) {
		
		Overload obj1=new Overload();
		obj1.Disp();
		System.out.println();
		Overload obj2=new Overload(22,165.6f);
		obj2.Disp();
		System.out.println();
		Overload obj3=new Overload(33,178, "ȫ�浿");
		obj3.Disp();
	}

}
