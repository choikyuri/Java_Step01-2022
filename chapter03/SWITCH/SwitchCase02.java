package chapter03.SWITCH;

import javax.swing.JOptionPane;

public class SwitchCase02 {

	public static void main(String[] args) {
		
		int num;
		num=Integer.parseInt(JOptionPane.showInputDialog("��ȣ�� �Է��ϼ���(1~4)"));
		
		//1:������ȸ 2: ��� 3:�Ա� 4:�۱�
		switch (num) {
		case 1: 
			System.out.println("������ȸ�� �����ϼ̽��ϴ�");
			break;
		
		case 2: 
			System.out.println("����� �����ϼ̽��ϴ�");
			break;
		
		case 3: 
			System.out.println("�Ա��� �����ϼ̽��ϴ�");
			break;
		
		case 4: 
			System.out.println("�۱��� �����ϼ̽��ϴ�");
			break;
		
		default:
			System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
		}

	}

}
