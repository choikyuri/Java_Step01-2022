package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		//��ü����1
		Student student1=new Student();
		//��������� �����ʱ�ȭ
		student1.studentName="�̻���";
		student1.address="����� ���α�";
		
		//���
		System.out.println("���� : "+student1.studentName);
		System.out.println("�ּ� : "+student1.address);
		student1.showStudent();
		System.out.println("--------------------------------");
		//��ü����2
		Student student2=new Student();
		//�޼��� Ȱ��
		student2.setStudentName("�̺���");
		student2.setAddress("��⵵ ����");
		
		//���
		String stdName=student2.getStudentName();
		System.out.println("���� : "+stdName);
		
		System.out.println("�ּ� : "+student2.getAddress());
		student2.showStudent();
		System.out.println();
		System.out.println("-------------------------------- ");
		
		//��ü����3(�����ε��� �����ڸ� �̿��Ͽ� ��ü����)
		Student student3=new Student("��ġ��", "����� ����");
		student3.showStudent();
		
		
		
		
		

	}

}
