package chapter03.IF;

import javax.swing.JOptionPane;

public class ifExample10 {

	public static void main(String[] args) {

		String ID="soldesk"; //인스턴스 변수방
		int PW=20220614; //정수형 변수방
		
		//String name=JOptionPane.showInputDialog("나이를 입력하세요");
		
		if(ID.equals("soldesk") ) {
			if(PW==20220614) {
				System.out.println(ID+"님 환영합니다");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다");
			}
		}else {
			System.out.println("아이디가 일치하지 않습니다");
		}

	}

}
