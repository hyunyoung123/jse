package cmm02.op;

public class No03_3HangDemo {
	public static void main(String[] args) {
		int left = 1;
		int right = 0;
		int result =0;
		boolean boo = true ;
		//논리    boo 는 참이다 !!!
		result = boo ?  left : right ;
		// boo 값이 참이면 왼쪽을 거짓이면 오른쪽을    참 : 거짓 
		System.out.println("참이냐 거짓이냐 1이면 참 0이면 거짓  :" + result);
	}

}
