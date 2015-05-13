package cmm03.flow;

public class No01_BlockDemo {
	public static void main(String[] args) {
		boolean condition = true; // 참이나 거짓이냐를 따지는 변수가 나오면 다음엔 무조건 if가나와야함 !!
		if(condition){    // if나 else안에 있는 {}는  바디가 아니라 블록임 
			System.out.println("참");
		} else{        // 위에값과 상반된 값이면 이걸 출력하라 !
			System.out.println("거짓");
		}
		
	}

}
