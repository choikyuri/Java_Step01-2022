package chapter05;

public class MethodMain {

	public static void main(String[] args) {
		
		//��ü ����
		Method bread=new Method();
	
		bread.makeBread();
		System.out.println("------------------------");
		bread.makeBread(5);
		System.out.println("-------------------------");
        bread.makeBread(5, "��ũ��");
	}

}
