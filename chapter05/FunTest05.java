package chapter05;

public class FunTest05 {

	public String channel;
	public int chanelInt;
	public int volume;
	
	//생략가능
	public FunTest05() {
	}
	
	public void channelUp(int volume) {
		System.out.println("소리를 "+ volume +"만큼 올립니다.");
	}
	public void channelDown(int volume) {
		System.out.println("소리를 "+ volume +"만큼 내립니다.");
	}
	
	//오버로딩
	public void channelChange(String channel) {
		System.out.println("TV 채널을 "+channel+ " 로 바꿉니다.");
	}
	//오버로딩
	public void channelChange(int chanelInt) {
		System.out.println("채널을 " + chanelInt + "번으로 바꿉니다");
	}
	
	// -------------------------------------------------------
	public static void main(String[] args) {
		
		FunTest05 tv=new FunTest05();
		
		tv.channelUp(3);
		tv.channelDown(5);
		
		tv.channelChange("TVN");
		tv.channelChange(5);
		
	}

}
