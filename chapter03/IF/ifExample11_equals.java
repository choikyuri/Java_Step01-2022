package chapter03.IF;

public class ifExample11_equals {

	public static void main(String[] args) {
		
		String str1="soldesk"; //�ν��Ͻ� ����(stack)
		String str2=new String("soldesk"); //��ü (heap)
		//== : �޸� 
		if(str1==str2) {
			System.out.println("�ΰ��� ���� �����ϴ�");
			
		}else {
			System.out.println("�ΰ��� ���� �����ʴ�");
		}
		
		System.out.println("-----------------------------");
		
		if(str1.equals(str2)) {
			System.out.println("�ΰ��� ���� �����ϴ�");
			
		}else {
			System.out.println("�ΰ��� ���� �����ʴ�");
		}

	}

}
