package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		
		StudentInfo stukim=new StudentInfo();
		
		//멤버변수로 직접 초기화
		stukim.studentID=1004;
		System.out.println("학번 : "+stukim.studentID);
		
		stukim.grade=1;
		System.out.println("학년 : "+stukim.grade);
		
		//private 멤버변수 접근법->메서드를 통해서 초기화
		stukim.setStudentName("김예중");
		//방법1
		//String name=stukim.getStudentName();
		//System.out.println("이름 : "+name);
		//방법2
		System.out.println("이름 : "+stukim.getStudentName());
		
		stukim.address="종로구 1000";
		System.out.println("주소 : "+stukim.address);
		

	}

}
