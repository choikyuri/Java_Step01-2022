package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		
		StaticFunction st=new StaticFunction();
		//��������� �����Ͽ� Static ȸ������ ���
		
		System.out.println(st.str1);
		System.out.println(st.str2);
		System.out.println(StaticFunction.str2);
		
		//�޼��带 �̿��Ͽ� Static ȸ������ ���
		System.out.println(st.getStatic());
		System.out.println(StaticFunction.getStatic());

	}

}
