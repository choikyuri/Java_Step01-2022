package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		
		StudentInfo stukim=new StudentInfo();
		
		//��������� ���� �ʱ�ȭ
		stukim.studentID=1004;
		System.out.println("�й� : "+stukim.studentID);
		
		stukim.grade=1;
		System.out.println("�г� : "+stukim.grade);
		
		//private ������� ���ٹ�->�޼��带 ���ؼ� �ʱ�ȭ
		stukim.setStudentName("�迹��");
		//���1
		//String name=stukim.getStudentName();
		//System.out.println("�̸� : "+name);
		//���2
		System.out.println("�̸� : "+stukim.getStudentName());
		
		stukim.address="���α� 1000";
		System.out.println("�ּ� : "+stukim.address);
		

	}

}
