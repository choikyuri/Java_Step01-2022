package chapter06;

public class Student {
	
	//필드
	int studentID;
    String studentName;
	int grade;
	String address;
	
	//기본생성자
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	//오버로딩 생성자
	public Student(String studentName, String address) {
		this.studentName=studentName;
		this.address=address;
	}
	

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void showStudent() {
		System.out.println("성명 : "+studentName+", "+"주소 : "+address);
	}
	
	
	
	

}
