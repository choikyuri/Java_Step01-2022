package chapter05;

public class FunTest_Overload_Main {

	public static void main(String[] args) {
		
		//FunTest_Overloading�� ��ü�� �����Ѵ�
		FunTest_Overloading obj=new FunTest_Overloading();
		obj.getResult('A');
		obj.getResult(20);
        obj.getResult("���� �ָ�~~~~");
        obj.getResult(6, ", ���� 6��");
	}

}
