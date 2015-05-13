package cmm03.flow;

import java.util.Scanner;

public class No02_IfelseDustmqanswp {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int kor =0, eng =0, math =0, sum=0;
		double avg =0.0;
		
		String msg ="massge";
			
		System.out.println("국어점수를 입력하시오");
		
		
		 kor = scanner.nextInt();
		
		 System.out.println("영어점수를 입력하시오");
			
			 eng = scanner.nextInt();
			 
		System.out.println("수학점수를 입력하시오");
		
		 math = scanner.nextInt();
		 
		 sum =kor + eng + math;
		avg = sum/3;  
		// avg = Math.floor(sum/3)  소수점 빼고 싶을때 이거입력 !!안되면 출력할때 (int) 넣어주면댐 !
		if(avg ==100){
			msg = "만점축하";
		} else if(avg >60 ){
			msg = "잘햇어요";
			
		}else {
			msg = "힘내요";
		}
		System.out.println("평균점수는는"+avg+"입니다");
		System.out.println("시험결과는"+msg+"입니다");

		
	}

}
