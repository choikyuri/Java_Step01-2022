package chapter03.IF;

public class ifExample06 {

	public static void main(String[] args) {
		
		int num=(int)(Math.random()*6)+1;
		//double num1=Math.random()*6;
		
		//1�� ~ 6������ ������ ���� �� ������ �̺�Ʈ�� ���
		if(num==1)
		{
			System.out.println("1�� ����");
		}
		else if(num==2)
		{
			System.out.println("2�� Ƣ��");
		}
		else if(num==3)
		{
			System.out.println("3�� ������");
		}
		else if(num==4)
		{
			System.out.println("4�� ����������");
		}
		else if(num==5)
		{
			System.out.println("5�� �и��ڶ�����");
		}
		else
		{
			System.out.println("6�� ġ����ź������ + �ָԹ�");
		}	
	}

}


