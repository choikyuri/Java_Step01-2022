package chapter08;

public class Student2 {
	
	//public int serialNum=10000;
	public static int serialNum=999;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//기본 생성자
	public Student2() {
		serialNum++;
		this.studentID=serialNum;
	}
	
	
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void ThisDp() {
		System.out.println(this);
	}

}
