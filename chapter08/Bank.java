package chapter08;

public class Bank {
	
	private String point;
	private String tel;
	static float interest;
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	
	public Bank(String point, String tel) {
		this.point=point;
		this.tel=tel;
	}
	
	public void getBank() {
		System.out.println("���� : "+point+"\n"+"��ȭ��ȣ : "+tel+"\n"+"�������� : "+interest);
		
	}

}
