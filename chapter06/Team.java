package chapter06;

public class Team {
	
	//�������
	private TeamMember[] member=new TeamMember[6]; //�����޸� ����
	//�⺻������
	
	//�ʱ�ȭ �޼���
	public void init() {
		member[0]=new TeamMember("���ο�","��");
		member[1]=new TeamMember("�̿�ö","��");
		member[2]=new TeamMember("������","��");
		member[3]=new TeamMember("�����","��");
		member[4]=new TeamMember("������","��");
		member[5]=new TeamMember("������","��");		
	}
	
	//��� �޼���
	public void Disp() {
		for(int i=0;i<member.length;i++) {
			System.out.println("����: "+member[i].getName());
			System.out.println("����: "+member[i].getGender());
			System.out.println("---------------------");
		}
	}
	
	

	
	
	
}
