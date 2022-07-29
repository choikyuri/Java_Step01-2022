package Example.chapter04;

public class Example7 {
	
	public static void main(String[] args) {
		int max=0;
		
		int[] array= {1,5,8,2,5};
		
		//ìµœë?ê°? ?•Œê³ ë¦¬ì¦?
		for(int i=0;i<array.length;i++) {
			if(array[i] > max) {
				max=array[i];
			}
		}
		System.out.println("ìµœë?ê°? : "+max);
	}

}
