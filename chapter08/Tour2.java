package chapter08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tour2 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int people_num = Integer.parseInt(JOptionPane.showInputDialog("������ �� �Է�"));
		Guide guide = new Guide(people_num);

		

		System.out.println("������ ���");
		for (int i=0; i<people_num; i++) {
			System.out.print((i+1) + ".�̸�: ");
			guide.guest[i].setName(scan.next());
			
			System.out.print((i+1) + ".����: ");
			guide.guest[i].setGender(scan.next());
			
			System.out.println("------------------");
		}
		
		outer:while(true) {
			System.out.println("1. ������ ����\n2. ������ ����\n3. ����");
			System.out.print("����>> ");
			int num = scan.nextInt();
			switch(num) {
			case 1:
				for (int i=0; i<guide.guest.length; i++)
					//guide.guest[i].disp((i+1));
				System.out.println("====================");
				break;
				
			case 2:
				System.out.print("���� �����Ͻðڽ��ϱ�: ");
				Guide.point = scan.next();
				System.out.println("\'"+Guide.point+"\'�� ������ ����");
				break;
				
			case 3:
				System.out.println("����");
				break outer;
			} // switch
		}
		
	}

}