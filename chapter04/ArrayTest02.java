package chapter04;

import javax.swing.JOptionPane;

public class ArrayTest02 {

	public static void main(String[] args) {


		String subject[] = new String[7];
		String phone[] = new String[7];
		//int jumsu[]=new int[7];
		
	
		for(int i = 0; i<subject.length; i++) { // 0,1,2,3,4
		
		subject[i] = JOptionPane.showInputDialog("�̸�");
		phone[i] = JOptionPane.showInputDialog("��ȭ��ȣ");
		//jumsu[i] = Integer.parseInt(JOptionPane.showInputDialog("����"));
		
		System.out.println("�̸�: "+subject[i]+"  ��ȭ��ȣ: "+phone[i]);
		//System.out.println("�̸�: "+subject[i]+"  ����: "+jumsu[i]);
		}

	}

}








