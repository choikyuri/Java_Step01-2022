package chapter07;

public class ConsTest {
	
	private int aa;
	private int bb;
	
	public ConsTest() {}
	
	//생성자 오버로딩을 통해서 멤버변수 초기화
	public ConsTest (int aa, int bb) {
		this.aa=aa;
		this.bb=bb;
	}
	
	public static void main(String[] args) {
		
		ConsTest obj1=new ConsTest();
		obj1.aa=10; //멤버변수가 private이여도 같은 클래스에 메인이 존재하므로 사용가능
		obj1.bb=20;
		System.out.println(obj1.aa);
		System.out.println(obj1.bb);
		
		ConsTest obj2=new ConsTest(30,40);
		System.out.println(obj2.aa);
		System.out.println(obj2.bb);
		
		
		
		
	}

}
