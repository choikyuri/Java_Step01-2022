package chapter03.IF;

import javax.swing.JOptionPane;

public class ifExample10 {

	public static void main(String[] args) {

		String ID="soldesk"; //�ν��Ͻ� ������
		int PW=20220614; //������ ������
		
		//String name=JOptionPane.showInputDialog("���̸� �Է��ϼ���");
		
		if(ID.equals("soldesk") ) {
			if(PW==20220614) {
				System.out.println(ID+"�� ȯ���մϴ�");
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
			}
		}else {
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�");
		}

	}

}
