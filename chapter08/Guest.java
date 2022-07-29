package chapter08;
//이름과 성별 정보, 여행지
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
		System.out.println(num+". 이름: "+getName());
		System.out.println(num+". 성별: "+getGender());
		System.out.println(num+". 목적지:"+Guide.point+"\n");
	}*/

}
