package cmm03.flow;

import java.util.Scanner;

public class No07_ManOrWoman2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("주민등록번호를 입력하시오");
		String ssn= scanner.nextLine();
		
		char ch=ssn.charAt(7);
		
		switch (ch) {
		case '1': System.out.println("남자");  break;  // char타입은 ''  이거 붙여줘야댐 !!!!!
		case '2':System.out.println("여자"); break;
		case '3':System.out.println("남자"); break;
		case '4':System.out.println("여자"); break;
		case '5':System.out.println("외국인"); break;
		case '6':System.out.println("외국인"); break;
		/* case '7':case'8':System.out.println("연습"); break;
		위 처럼 중복된 것은 걍 붙여서 깔끔하게 1이랑 3이랑 한줄로 */
		default: System.out.println("잘못입력 하셨습니다."); 	break;
		}
	}

}
