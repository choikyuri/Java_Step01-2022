package Example;

import java.awt.print.PrinterException;
import java.util.Random;

public class Runners {

	public static void main(String[] args) {
		
		int[] playerRandom=new int[4];
		String[] playerJump= {"","","",""};
		
		boolean finish=false;
		int finishPlayer=0;
		int count=0;
		
		while(true) {
			
			//����Ÿ�
			for(int i=0;i<playerRandom.length;i++) {
				playerRandom[i]=new Random().nextInt(3); //0~3=>4��
			}
			
			//Thread : 0.1�� �������� �޽�
			try {
				Thread.sleep(100); //0.1��
			} catch (Exception e) {
				System.out.println(e);
			}
			
			//�� �������� ����Ÿ� ����
			for(int i=0;i<playerJump.length;i++) {
				
				switch(playerRandom[i]) {
				case 0:
					playerJump[i]+="";
					break ;
				case 1:
					playerJump[i]+=" ";
					break;
				case 2:
					playerJump[i]+="  ";
					break;
				case 3:
					playerJump[i]+="   ";
					break;
				}//switch
			}//for
			//�޸���
			System.out.println("-------------------------------------------------------------------------");
			for (int i=0; i<playerJump.length; i++) {	
				if(playerRandom[i]!=0) {
					System.out.print(playerJump[i]);
					System.out.println((i+1)+"��");
				} else {
					System.out.println(playerJump[i] + (i+1)+">+o");
				}
				
				
				if(playerJump[i].length() >= 70) {
					finishPlayer = i+1; // �����
					finish = true; // �� Ʈ����
				} // if
			} // for
			//���
			if(finish) {
				System.out.println("winner - "+ finishPlayer);
				break;
			}
		}//while
	}//main
}//class
