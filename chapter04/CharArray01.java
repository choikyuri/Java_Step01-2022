package chapter04;

import javax.swing.JOptionPane;

public class CharArray01 {

	public static void main(String[] args) {
		
		String str[]= {"�迹��","���ο�","�̻���","�̼�â"};
		String res="";
		
		int i;
		for(i=0;i<str.length;i++) {
			res +=str[i]+"\n"; 
		}
		//System.out.println(res);
		JOptionPane.showMessageDialog(null, "���� �̸� \n" +res);

	}

}
