package chapter06;

public class TeamMain {

	public static void main(String[] args) {

       Team team1=new Team();
       TeamMember t=new TeamMember();
       t.setTeamName("ȭ������");  
       System.out.println("���� : "+ t.getTeamName());
       System.out.println("----------------------------");
       team1.init();
       team1.Disp();
       
       
       // ----------------------
       TeamMember tm=new TeamMember();
       tm.setName("�ڹ���");
       tm.setGender("��");
       tm.setmName("�̼�â");
       tm.setTeamName("�ڷᱸ��");
       tm.setMphone("010-789-4561");
     
       


	}

}
