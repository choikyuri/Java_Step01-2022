package Example;

import java.util.Scanner;

public class Actor {
      /*
       �Ʒ��� ���� ����̸��� ��ǰ�� 2���� �迭�� ������ ��.

		String[][] actor = { {"[�۰�ȣ]", "����", "����", "����"}, 
			            { "[�����]", "���ϵ�", "������ �׳�", "�����ϰ� �����ϰ�"}, 
			            { "[�̺���]", "��������", "����", "����"} };
		
		�Ʒ��� ����� �ݿ��ϴ� ���α׷��� �ۼ��غ���.
		Ŭ������ : Actor
		-----------------------------------------------
		
		�˻��� ��� : �����
		[�����]
		���ϵ�
		������ �׳�
		�����ϰ� �����ϰ�  ---> �˻��� ����� �̷�� �� ���.
		
		�˻��� ��� : ��
		�ش��찡 �������� �ʽ��ϴ� ---> �˻��� ����� �̷������ ���� ���.

       */
	public static void main(String[] args) {
         //3�� 4�� �ʱ�ȭ
		String[][] actor = { {"[�۰�ȣ]", "����", "����", "����"}, 
							 { "[�����]", "���ϵ�", "������ �׳�", "�����ϰ� �����ϰ�"}, 
							 { "[�̺���]", "��������", "����", "����"} 
							};
		int cnt=0;
		
		System.out.print("�˻��� ��� : ");
		Scanner scan = new Scanner(System.in);
		String actName = scan.next();
		
		for(int i = 0; i < actor.length; i++){	
			if(actor[i][0].equals("[" + actName + "]")){	
				for(int j = 0; j < actor[i].length; j++){	
					System.out.println(actor[i][j]);
				}//inner for	
			}else{
				cnt++;
				if(cnt >= actor.length){
					System.out.println("�ش��찡 �������� �ʽ��ϴ�.");
				}
			}		
	}//outer for
  }//main end
}//class