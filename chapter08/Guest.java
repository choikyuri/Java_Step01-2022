package chapter08;
//�̸��� ���� ����, ������
public class Guest {
	
	private String name;
	private String gender;
	
	
	public String getPoint() {
		return Guide.point;
	}
	
	
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
	/*Guide2 / Tour2
	public void disp(int num) {
		System.out.println(num+". �̸�: "+getName());
		System.out.println(num+". ����: "+getGender());
		System.out.println(num+". ������:"+Guide.point+"\n");
	}*/

}
