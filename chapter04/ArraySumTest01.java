package chapter04;

public class ArraySumTest01 {

	public static void main(String[] args) {
		
		int score[]= {98,90,87};
		/*
		System.out.println("score[0]: " + score[0]);
		System.out.println("score[1]: " + score[1]);
		System.out.println("score[2]: " + score[2]);
		*/
		int sum=0;
		for(int i=0;i<score.length;i++) {
			System.out.println("score[" + i + "]: " + score[i]);
			sum+=score[i];
		}

		System.out.println("���� : " + sum);
		double avg=(double)sum/score.length;
		System.out.println(String.format("��� : %.2f", avg));
		//�ݿø�
		System.out.println("���(�ݿø�) : "+ Math.round(avg));
		}

	}
