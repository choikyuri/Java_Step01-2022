package chapter02;

public class Example_03 {

	public static void main(String[] args) {
		
		int score1=60;
		//���׿����ڸ� �̿��Ͽ� score1�� 60�� ���� ũ�ų� ������ �հ� �׷��� ������ ���հ����� ��ȯ �Ͻÿ�
		String pass=(score1 >= 60) ? "�հ�":"���հ�";
		System.out.println("�հݿ��� : " + pass);
		
		int score2=82;
		//���׿����ڸ� �̿��Ͽ� score2�� 90���� ũ�� 'A'�̰� score�� 80���� ũ�� 'B' �� ���ϴ� ��� 'C'�� �����Ѵ� 
		
		char grade;
		grade=(score2 > 90) ? 'A':((score2 > 80) ? 'B':'C');
		System.out.println("���� : " + grade);
		
		
		

	}

}
