package chapter08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tour2 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int people_num = Integer.parseInt(JOptionPane.showInputDialog("관광객 수 입력"));
		Guide guide = new Guide(people_num);

		

		System.out.println("관광객 등록");
		for (int i=0; i<people_num; i++) {
			System.out.print((i+1) + ".이름: ");
			guide.guest[i].setName(scan.next());
			
			System.out.print((i+1) + ".성별: ");
			guide.guest[i].setGender(scan.next());
			
			System.out.println("------------------");
		}
		
		outer:while(true) {
			System.out.println("1. 관광객 정보\n2. 목적지 변경\n3. 종료");
			System.out.print("선택>> ");
			int num = scan.nextInt();
			switch(num) {
			case 1:
				for (int i=0; i<guide.guest.length; i++)
					//guide.guest[i].disp((i+1));
				System.out.println("====================");
				break;
				
			case 2:
				System.out.print("어디로 변경하시겠습니까: ");
				Guide.point = scan.next();
				System.out.println("\'"+Guide.point+"\'로 목적지 변경");
				break;
				
			case 3:
				System.out.println("종료");
				break outer;
			} // switch
		}
		
	}

}