package chapter06;

public class Team {
	
	//멤버변수
	private TeamMember[] member=new TeamMember[6]; //팀원메모리 선언
	//기본생성자
	
	//초기화 메서드
	public void init() {
		member[0]=new TeamMember("장인우","남");
		member[1]=new TeamMember("이우철","남");
		member[2]=new TeamMember("최진혁","남");
		member[3]=new TeamMember("한희원","여");
		member[4]=new TeamMember("임현재","남");
		member[5]=new TeamMember("최윤이","여");		
	}
	
	//출력 메서드
	public void Disp() {
		for(int i=0;i<member.length;i++) {
			System.out.println("성명: "+member[i].getName());
			System.out.println("성별: "+member[i].getGender());
			System.out.println("---------------------");
		}
	}
	
	

	
	
	
}
