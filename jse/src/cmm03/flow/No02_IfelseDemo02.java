package cmm03.flow;

public class No02_IfelseDemo02 {
	public static void main(String[] args) {
		//지역변수 선언시 디폴트 값을 준다 !!!!!!!!
		int kor = 90, eng = 85,math =60,  sum =0;
		double avg = 0.0;
		String msg = "message"; // string으로 개채를 선언하면  char 로 하나하나 입력안해도 알아들음
		
		sum=kor+eng+math;
		avg = sum / 3;
		
		if(avg==100){
			msg ="보너스지급";
		
		}else if(avg > 70){  //  if 조건 더 입력할 때 사용 
			msg = "시헙 합격";
		}else {  // 조건 더이상없으면 나머지 처리할때    주석할곳 선택후 shift ctrl /  누르면  주석 자동으로댐
			msg = "재시험 보세요";
		}
		
		System.out.println("국어 ="+kor);
		System.out.println("영어 ="+eng);
		System.out.println("수학 ="+math);
		System.out.println("평균 =" +avg);
		System.out.println("귀하의 시험 결과 ="+msg+"입니다.");
	}

}
