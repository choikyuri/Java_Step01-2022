package chapter05;

import javax.swing.JOptionPane;

public class TryCatch {
	
	public static void main(String[] args) {
		
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("媛�1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("媛�2"));
		/*
		int res=num1/num2;
		System.out.println(res);*/
		
		try {
			   System.out.println(num1/num2);  //�빐�떦 �옉�뾽�쓣 援ы쁽
		} catch (ArithmeticException e) { //�뿉�윭媛� �굹硫�
			     System.out.println("�닽�옄 0瑜� �엯�젰�븯�떆硫� �븞�맗�땲�떎.");// �뿉�윭�떆 �닔�뻾�맆 �뻾�쐞
		}
		
		System.out.println("Error �썑 而댄뙆�씪 => �봽濡쒓렇�옩 �닔�뻾 �걹");
	}

}
