package chapter02;

 /* Soldesk ������
��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ���� 5��, 7��, 5���̴�

���������� �Ϸ翡 ����Ǵ� �� ������ ������ ����ϰ�, �ð���(24) ��ü ������ ��� ���갹���� ����Ͻÿ�
(��, ��հ��� ��� ������ Ÿ���� float���� �����Ѵ�)
*/
public class Example_01 {

	public static void main(String[] args) {

		//������ ����(pear, apple, orange)
		int pear=5;
		int apple=7;
		int orange=5;
		
		//�Ѱ���(fruitTotal)
		int fruitTotal=pear+apple+orange;
		System.out.println("�Ϸ翡 ����Ǵ� ������ �Ѱ��� : " + fruitTotal);
		
		//�ð��� ���(fruitAvg)
		//float h=24f;
		float fruitAvg=fruitTotal/24f; 
		System.out.println("�ð��� ����Ǵ� ������ ��� : " + fruitAvg);

	}

}
