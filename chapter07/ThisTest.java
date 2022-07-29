package chapter07;

public class ThisTest {
	
	private int Speed;
	private int Age;
	private String RobotName;
	private String RobotNum;
	
	public ThisTest() {
		// TODO Auto-generated constructor stub
	}
	
	public ThisTest(int Speed,int Age,String RobotName,String RobotNum) {
		this.Speed=Speed;
		this.Age=Age;
		this.RobotName=RobotName;
		this.RobotNum=RobotNum;
	}
	
	public void Move() {
		Speed+=20;
		System.out.println("RobotSpeed : "+ Speed);
	}
	
	public void Stop() {
		Speed=0;
		System.out.println("RobotSpeed : "+ Speed);
	}
	
	public void RAge() {
		Age +=1;
		System.out.println("RobotAge : "+Age);
	}
	
	public void RName() {
		
		System.out.println("RobotName : "+RobotName);
	}

	public int getSpeed() {
		return Speed;
	}

	public int getAge() {
		return Age;
	}

	public String getRobotName() {
		return RobotName;
	}

	public String getRobotNum() {
		return RobotNum;
	}
	
	
	
	
}
