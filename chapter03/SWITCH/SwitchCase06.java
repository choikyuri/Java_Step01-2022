package chapter03.SWITCH;

public class SwitchCase06 {

	public static void main(String[] args) {
		
		//ramdom 9 ~ 18
		int time = (int)(Math.random()*10)+9;
		
		System.out.println("[����ð� : " +  time +"��]"); 
		System.out.print("�� �� : ");
		switch (time) {
		case 9:
			System.out.println("�����ϱ�");
			break;
		case 10: 			
			System.out.println("�޽��ϱ�");
			break;
		case 11: 			
			System.out.println("�����ϱ�");
			break;
		case 12: 			
			System.out.println("���ɸԱ�");
			break;
		case 13: 			
			System.out.println("ȸ���ϱ�");
			break;
		case 14:
			System.out.println("��ϱ�");
			break;
		case 15:
			System.out.println("TV����");
			break;
		case 16:
			System.out.println("�����ϱ�");
			break;
		case 17:
			System.out.println("��������");
			break;
		case 18:
			System.out.println("��������");
			break;
		default:
			System.out.println("�����ñ�");
		}
		
		
	}

}
