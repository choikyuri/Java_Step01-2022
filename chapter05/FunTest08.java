package chapter05;

public class FunTest08 {
	
	//�ʵ� OR �������
	
	//����Ʈ ������
	
	//�޼���
	public static int Recur(int a) {
		
		int result;
		System.out.print(a + " ");
		
		if(a==1)
			return(1); //return 1=break : ��������� �ƴ����� �������� �����ϱ� ���� �ڵ�
		else result=a*Recur(a-1);
		
		return result;
		//return 0; //���������� �Ѿ ���� ������ �˸� 
	}
	
	
	public static void main(String[] args) {
     
	/*	
	//static�� �ƴѰ�� ��ü�� �����Ͽ� �޼��� ���	
	FunTest08 re=new FunTest08();	
    re.Recur(5); 
    */
	int res;
	int x=5;
	System.out.println("����� Main�Դϴ�");
	System.out.println("�޼��� ȣ��");
    res=Recur(x);
    System.out.println();
    System.out.println("�޼��� ȣ���� ������� ���� �� ");
    System.out.println("1 ~ "+x+" ������ ���� ���� �� : "+ res);

	}

}




