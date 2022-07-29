package chapter04;

public class EnhanceForLoop {

	public static void main(String[] args) {
		
		String[] strArray= {"Java","Oracle","JSP","Html5,CSS,JS,JQ","Spring","PythonCamp"};
		
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		System.out.println("==============");
		// È®Àå for
		for(String lang:strArray) {
			System.out.println(lang);
		}

	}

}
