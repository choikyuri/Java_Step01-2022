package chapter06;

public class TeamMember {
    
	//�������
	public String teamName; //����
	public String mName; //�����̸�
	public String mphone; //��������
	private String name; //�����̸�
	private String gender; //��������
	
	//�⺻ ������
	public TeamMember() {}

	//���� �ε�(������ �ʱ�ȭ)
	public TeamMember(String name, String gender) {
	    this.name=name;
		this.gender=gender;
	
	}
	
	//�޼��� �ʱ�ȭ
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	
	
	
	
	
	
}
