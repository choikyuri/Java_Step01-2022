package chapter04;

public class Example02 {

	public static void main(String[] args) {

		int[][] array= { {95,86}, {83,92,96}, {78,83,93,87,88} };
		
		int sum=0;
		double avg=0.0;
		int total=0;
		
		int count=0;
		
		//for���� �̿��Ͽ� ������ �հ�(sum)�� ���Ͻÿ�
		/*
		for (int[] num : array) {
			for (int score : num) {
				sum += score;
			}
			count++;
			System.out.println(count+"��° �л��� �հ�:"+sum);
		}
		*/
		/*
		 * 
		int sum[]=new int[3]; 
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum[i]+=array[i][j];
			}
			System.out.println("�� ������ �� : "+sum[i]);
		}
	*/
	
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];//0,0 0,1 / 1,0 1,1 1,2 / 2,0 2,1 2,2 2,3 2,4
				count++;
			}
			avg=(double)sum/array[i].length;
			
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + Math.round(avg));
			
			total +=sum; //��ü ����
			sum=0; //�ʱ�ȭ
			avg=0.0; //�ʱ�ȭ
			
			System.out.println("---------------------");
		}
		//��ü ���
		double totalavg=(double)total/count;
		
		System.out.println("��ü ���� : "+total);
		System.out.println(String.format("��ü ��� : %.2f", totalavg));
	
	}

}














