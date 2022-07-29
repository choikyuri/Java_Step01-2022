package chapter06;

public class TeamMain {

	public static void main(String[] args) {

       Team team1=new Team();
       TeamMember t=new TeamMember();
       t.setTeamName("화목한팀");  
       System.out.println("팀명 : "+ t.getTeamName());
       System.out.println("----------------------------");
       team1.init();
       team1.Disp();
       
       
       // ----------------------
       TeamMember tm=new TeamMember();
       tm.setName("박미진");
       tm.setGender("여");
       tm.setmName("이세창");
       tm.setTeamName("자료구조");
       tm.setMphone("010-789-4561");
     
       


	}

}
