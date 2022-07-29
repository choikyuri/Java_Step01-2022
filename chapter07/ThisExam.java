package chapter07;

public class ThisExam {
	
	int day;
	int month;
	int year;
	
	public ThisExam() {
		// TODO Auto-generated constructor stub
	}
	
	public ThisExam(int year,int month,int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		
		ThisExam birth1=new ThisExam(2022,06,14);
		birth1.printThis();
		System.out.println("积斥岿老 : "+birth1.year+"."+birth1.month+"."+birth1.day);
		
		System.out.println("-----------------------------------------------------------");
		ThisExam birth2=new ThisExam();
		birth2.setYear(2022);
		birth2.setMonth(12);
		birth2.setDay(5);
		birth2.printThis();
		System.out.println("积斥岿老 : "+birth2.getYear()+"."+birth2.getMonth()+"."+birth2.getDay());

	}

}
