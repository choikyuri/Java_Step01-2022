package chapter06;

public class Can {
	
	//�ʵ�=�������
	private String canName;
	private int price;
	
	//����Ʈ ������
	public Can() {
		// TODO Auto-generated constructor stub
	}

	//�����ε� ������
	public Can(String canName, int price) {
		this.canName=canName;
		this.price=price;
	}
	
	//----------------�޼���--------------

	public void setCanName(String canName) {
		this.canName = canName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCanName() {
		return canName;
	}

	public int getPrice() {
		return price;
	}
	
	
	
	

	
	
	

}
