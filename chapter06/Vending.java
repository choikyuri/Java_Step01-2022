package chapter06;

public class Vending {
	
	//�������
	private Can can[]=new Can[5]; //����
	private int money;
	
	//����Ʈ ������
	
	//��ü�� �ʱ�ȭ �����ִ� �޼���
	public void init() {
		can[0]=new Can("ȯŸ", 1000);
		can[1]=new Can("���̴�" , 1200); 
		can[2]=new Can("�����ݶ�" , 1500); 
		can[3]=new Can("�������꽺" , 1100); 
		can[4]=new Can("�ٳ�������" , 1400); 
	}
	
	//��� ������ ���Ḹ ����ϱ� �޼���
	public void showCans(int m) {
		 
		money=m; //1300
		
		for(int i=0;i<can.length;i++) {
			
			if(can[i].getPrice()<=money) {
				System.out.println("�̸�: "+can[i].getCanName()+" "+"����: "+can[i].getPrice());
			}//if			
		}//for
	}//method
	
	//������ ����� ������ �ܾ� Output
	public void outCan(String name) {
		
		for(int i=0;i<can.length;i++) {
			if(can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName()+"�� �����ϼ̽��ϴ�. ���ְ� �弼��");
				System.out.println("�ܾ� : "+(money-can[i].getPrice())+ "��");
			}//if
		}//for
	}//method
}//class














