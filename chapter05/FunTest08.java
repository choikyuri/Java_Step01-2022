package chapter05;

public class FunTest08 {
	
	//필드 OR 멤버변수
	
	//디폴트 생성자
	
	//메서드
	public static int Recur(int a) {
		
		int result;
		System.out.print(a + " ");
		
		if(a==1)
			return(1); //return 1=break : 정상종료는 아니지만 오류없이 중지하기 위한 코드
		else result=a*Recur(a-1);
		
		return result;
		//return 0; //정상종료후 넘어갈 값이 없음을 알림 
	}
	
	
	public static void main(String[] args) {
     
	/*	
	//static이 아닌경우 객체를 생성하여 메서드 사용	
	FunTest08 re=new FunTest08();	
    re.Recur(5); 
    */
	int res;
	int x=5;
	System.out.println("여기는 Main입니다");
	System.out.println("메서드 호출");
    res=Recur(x);
    System.out.println();
    System.out.println("메서드 호출후 결과값을 받은 후 ");
    System.out.println("1 ~ "+x+" 까지의 수를 곱한 값 : "+ res);

	}

}




