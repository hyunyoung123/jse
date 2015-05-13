package cmm03.flow;

import java.nio.channels.AcceptPendingException;
import java.util.Scanner;  // scanner 치고 ctrl space누르면 나옴  , 객채지향 (남이짜논코드 갖고와서 쓰는거 )

public class No02_IfelseDemo {
	public static void main(String[] args) {
		Scanner scanner =new  Scanner(System.in); 
		// 대문자를   클래스, 소문자를 객체변수, 자바에서 첫글자가 대문자는 클래스밖에없음
		System.out.println("값을 입력하세요 ..");
		/*int i;
		i=0;*/
		int i=0;
		i = scanner.nextInt();
		System.out.println("입력값은 " +  i +"입니다.");
	}

}
