package cmm02.op;

public class No01_DanHangDemo {
	public static void main(String[] args) {
	
		int i;  // 변수의 선언
		i = 5 ; //초기화, 할당(=대입)
		//정의 - 바디내부에 알고리즘짜는 것 
	         i =i + 5 ; 
		System.out.println("i=i+5의 값 : " + i);
		
		int j = 5;
		j++;
		System.out.println("j++ 의 값 : "+ j);
		
	  int k = 5;
	  ++k;
	  System.out.println("++k 의 값 : " + k);
}

}

//class Abc{}   // 클래스 선언 
/* 선언하는 형식은   키워드  식별자  바디 ( 바디대신 세미콜론가능)
 파란색이 키워드 ( class색), 분홍색이 식별자(ABC같은거) */
