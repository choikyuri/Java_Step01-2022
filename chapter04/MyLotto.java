package chapter04;

import java.util.Random;
import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {
		// �ζǹ�ȣ 6���� ���� �迭
		int number;
		int cnt=0;
		int[] lotto=new int[6];
		
		System.out.println("==== �̹��� �ζ� �����ȣ ====");
		number=Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ����Ƚ���� �Է��ϼ���"));
	   while(number > cnt ) {
		   System.out.print("["+(cnt+1)+"] : ");
	   
		outer : for(int i=0;i<lotto.length;) {
			lotto[i]=new Random().nextInt(45)+1;
			
			//�ߺ����� ���ϴ� �ݺ���
			for(int j=0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}//if
			}//inner for
             	
			System.out.print(lotto[i] + " ");
			i++;
		}//outter for
		cnt++;
		System.out.println();
	   }
	}//main

}//class
