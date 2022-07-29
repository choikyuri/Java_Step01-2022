package chapter04;

public class TowDimension01 {

	public static void main(String[] args) {
		
		int[][] arr=new int[2][3];
		int n=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) { //각줄의 끝까지 반복하기
				n++; 
				System.out.print((arr[i][j]=n) +" " );
			}
			System.out.println();
		}
		System.out.println("----------------------");
		System.out.println(arr.length); //행
		System.out.println(arr[0].length); //열
		
		System.out.println("============================");
		
		int[][] arr1= { {1,2,3},{4,5,6} };
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) { //각줄의 끝까지 반복하기
				System.out.print((arr[i][j]) +" " );
			}
			System.out.println();
		}
		
	
	}

}





