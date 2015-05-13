package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchDemo {
	public static void main(String[] args) {
		System.out.println("평균점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int avg = scanner.nextInt();
		String msg ="";
		char grade = 0; 
		//변수는 변수끼리 선언하는 게 좋음 ! 밑에하다가 입력한거 까무그면 올라와서 입력하라
		if(avg >= 70){
			msg = "합격입니다.";
		}else {
			msg = "불합격입니다.";
		}
		
		switch (avg/10) {
		case 10: grade = 'A';   break;
		case 9: grade ='A';   break;
		case 8: grade ='B';   break;
		case 7: grade ='C';   break;
		case 6: grade ='D';   break;
		case 5: grade ='E';   break;
		default : grade= 'F';   break;  // 다입력하기 힘드니까 같은 나머지는  default
// break 를 복사할라구 위로 땅김 
		}
		System.out.println("귀하는 "
				+ msg+ " 이며 학점은 "
						+ grade+" 입니다");
	}

}
