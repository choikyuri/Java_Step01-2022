package chapter08;

public class Guide2 {
	
	static String point;
	Guest[] guest; //선언
	
	//오버로딩 생성자
	public Guide2(int n) {
		point="하와이";
		guest=new Guest[n]; //배열의 갯수
		
	//객체생성
	for(int i=0;i<guest.length;i++) {
		guest[i]=new Guest();
	}

	}
	
	

}
