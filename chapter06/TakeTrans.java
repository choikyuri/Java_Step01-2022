package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		
		//학생2명의 객체 생성
		StdInfo studentDabin=new StdInfo("장다빈", 10000);
		StdInfo studentDanbin=new StdInfo("정단비", 12000);
		StdInfo studentKim=new StdInfo("김예중", 15000);
		StdInfo studentLee=new StdInfo("이세창", 13000);
		
		
		//버스타기
		Bus bus100=new Bus(100);
		Bus bus200=new Bus(200);
		Bus bus300=new Bus(300);
		studentDabin.takeBus(bus300);
		studentLee.takeBus(bus300);
		studentKim.takeBus(bus200);
		
		//지하철타기
		Subway subwayGreen=new Subway("2호선");
		Subway subwayOrange=new Subway("3호선");
		studentDanbin.takeSubway(subwayOrange);
		studentKim.takeSubway(subwayOrange);
		studentDabin.takeSubway(subwayGreen);
		
		//학생정보
		studentDabin.showInfo();
		System.out.println("------------------------------------------------");
		studentDanbin.showInfo();
		System.out.println("------------------------------------------------");
		studentKim.showInfo();
		System.out.println("------------------------------------------------");
		studentLee.showInfo();
		System.out.println("------------------------------------------------");
		//버스정보
		bus200.showInfo();
		bus300.showInfo();
		System.out.println("------------------------------------------------");
		//지하철정보
		subwayGreen.showInfo();
		subwayOrange.showInfo();
	}

}
