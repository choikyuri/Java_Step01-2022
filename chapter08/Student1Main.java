package chapter08;

public class Student1Main {

	public static void main(String[] args) {
		
		Student1 studentLee=new Student1();
		studentLee.setStudentName("ÀÌ¿ìÃ¶");
		System.out.println(studentLee.getStudentName());
		//System.out.println(studentLee.studentName);
		System.out.println(studentLee.serialNum);
		Student1.serialNum++; //static
		studentLee.ThisDp();
		System.out.println("-------------------------");
		
		Student1 studentchoi=new Student1();
		studentchoi.setStudentName("ÃÖ±Ô¸®");
		System.out.println(studentchoi.getStudentName());
		//System.out.println(studentchoi.studentName);
		System.out.println(studentchoi.serialNum);
		Student1.serialNum++;
		studentchoi.ThisDp();
		System.out.println("-------------------------");
		
		Student1 studentkim=new Student1();
		studentkim.setStudentName("±èÇöÀç");
		System.out.println(studentkim.getStudentName());
		//System.out.println(studentkim.studentName);
		System.out.println(studentkim.serialNum);
		Student1.serialNum++;
		studentkim.ThisDp();
		
		

	}

}
