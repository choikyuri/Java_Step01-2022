package chapter08;

public class Student1Main2 {

	public static void main(String[] args) {
		
		Student2 studentLee=new Student2();
		studentLee.setStudentName("이우철");
		System.out.println("이름 : "+studentLee.getStudentName()+ "| 학번 : "+studentLee.studentID);
		
		System.out.println("-------------------------");
		
		Student2 studentchoi=new Student2();
		studentchoi.setStudentName("최규리");
		System.out.println("이름 : "+studentchoi.getStudentName()+ "| 학번 : "+studentchoi.studentID);
		System.out.println("-------------------------");
		
		Student2 studentkim=new Student2();
		studentkim.setStudentName("김현재");
		System.out.println("이름 : "+studentkim.getStudentName()+ "| 학번 : "+studentkim.studentID);
		
		

	}

}
