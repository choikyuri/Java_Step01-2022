package chapter07;

public class Person {
	
	String name;
	float height;
	float weight;
	
	//�⺻ ������
	public Person() {}
	
	//�̸��� �ʱ�ȭ�Ǵ� ������
	public Person(String name) {
		this.name=name;
	}
	
	//������� ��� �ʱ�ȭ�Ǵ� ������
	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

}
