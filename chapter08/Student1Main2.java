package chapter08;

public class Student1Main2 {

	public static void main(String[] args) {
		
		Student2 studentLee=new Student2();
		studentLee.setStudentName("�̿�ö");
		System.out.println("�̸� : "+studentLee.getStudentName()+ "| �й� : "+studentLee.studentID);
		
		System.out.println("-------------------------");
		
		Student2 studentchoi=new Student2();
		studentchoi.setStudentName("�ֱԸ�");
		System.out.println("�̸� : "+studentchoi.getStudentName()+ "| �й� : "+studentchoi.studentID);
		System.out.println("-------------------------");
		
		Student2 studentkim=new Student2();
		studentkim.setStudentName("������");
		System.out.println("�̸� : "+studentkim.getStudentName()+ "| �й� : "+studentkim.studentID);
		
		

	}

}
