package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		
		//�л�2���� ��ü ����
		StdInfo studentDabin=new StdInfo("��ٺ�", 10000);
		StdInfo studentDanbin=new StdInfo("���ܺ�", 12000);
		StdInfo studentKim=new StdInfo("�迹��", 15000);
		StdInfo studentLee=new StdInfo("�̼�â", 13000);
		
		
		//����Ÿ��
		Bus bus100=new Bus(100);
		Bus bus200=new Bus(200);
		Bus bus300=new Bus(300);
		studentDabin.takeBus(bus300);
		studentLee.takeBus(bus300);
		studentKim.takeBus(bus200);
		
		//����öŸ��
		Subway subwayGreen=new Subway("2ȣ��");
		Subway subwayOrange=new Subway("3ȣ��");
		studentDanbin.takeSubway(subwayOrange);
		studentKim.takeSubway(subwayOrange);
		studentDabin.takeSubway(subwayGreen);
		
		//�л�����
		studentDabin.showInfo();
		System.out.println("------------------------------------------------");
		studentDanbin.showInfo();
		System.out.println("------------------------------------------------");
		studentKim.showInfo();
		System.out.println("------------------------------------------------");
		studentLee.showInfo();
		System.out.println("------------------------------------------------");
		//��������
		bus200.showInfo();
		bus300.showInfo();
		System.out.println("------------------------------------------------");
		//����ö����
		subwayGreen.showInfo();
		subwayOrange.showInfo();
	}

}
