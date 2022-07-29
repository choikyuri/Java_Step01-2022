package chapter04;

import javax.swing.JOptionPane;

public class CharArray01 {

	public static void main(String[] args) {
		
		String str[]= {"김예중","장인우","이상주","이세창"};
		String res="";
		
		int i;
		for(i=0;i<str.length;i++) {
			res +=str[i]+"\n"; 
		}
		//System.out.println(res);
		JOptionPane.showMessageDialog(null, "팀장 이름 \n" +res);

	}

}
