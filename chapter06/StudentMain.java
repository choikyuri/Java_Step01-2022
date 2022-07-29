package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		//객체생성1
		Student student1=new Student();
		//멤버변수에 직접초기화
		student1.studentName="이상주";
		student1.address="서울시 종로구";
		
		//출력
		System.out.println("성명 : "+student1.studentName);
		System.out.println("주소 : "+student1.address);
		student1.showStudent();
		System.out.println("--------------------------------");
		//객체생성2
		Student student2=new Student();
		//메서드 활용
		student2.setStudentName("이병훈");
		student2.setAddress("경기도 고양시");
		
		//출력
		String stdName=student2.getStudentName();
		System.out.println("성명 : "+stdName);
		
		System.out.println("주소 : "+student2.getAddress());
		student2.showStudent();
		System.out.println();
		System.out.println("-------------------------------- ");
		
		//객체생성3(오버로딩된 생성자를 이용하여 객체생성)
		Student student3=new Student("김치즈", "서울시 은평구");
		student3.showStudent();
		
		
		
		
		

	}

}
