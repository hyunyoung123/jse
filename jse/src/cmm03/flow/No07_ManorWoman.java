package cmm03.flow;

import java.util.Scanner;

public class No07_ManorWoman {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("주민등록번호를 입력하시오");
		
		String ssn=scanner.nextLine();

		char ch = ssn.charAt(7); // 몇번째 자리수 1개   7은 7번째 자리수!
		
		if(ch=='1'){
			System.out.println("남자");
		}else if(ch =='2') {
			System.out.println("여자");
		}else if(ch =='3') {
			System.out.println("남자");
		}else if(ch =='4') {
			System.out.println("여자");
		}else{
			System.out.println("잘못입력 하셨습니다. 다시입력해주세요.");
			// else if 계속 안치고  ||(or)  추가해서 1,3  2,4, 묶어도댐 
		}
	}

}
