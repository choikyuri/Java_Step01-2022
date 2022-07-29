package chapter04;

import javax.swing.JOptionPane;

public class ArrayTest02 {

	public static void main(String[] args) {


		String subject[] = new String[7];
		String phone[] = new String[7];
		//int jumsu[]=new int[7];
		
	
		for(int i = 0; i<subject.length; i++) { // 0,1,2,3,4
		
		subject[i] = JOptionPane.showInputDialog("이름");
		phone[i] = JOptionPane.showInputDialog("전화번호");
		//jumsu[i] = Integer.parseInt(JOptionPane.showInputDialog("점수"));
		
		System.out.println("이름: "+subject[i]+"  전화번호: "+phone[i]);
		//System.out.println("이름: "+subject[i]+"  점수: "+jumsu[i]);
		}

	}

}








