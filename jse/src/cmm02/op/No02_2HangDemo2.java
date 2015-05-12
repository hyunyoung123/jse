package cmm02.op;

public class No02_2HangDemo2 {
	public static void main(String[] args) {
		int result = 5 + 5 ;
		int value = result ;
		
		result = value +5;
		System.out.println(value +"+5 =" + result );
		
		result = value *5;
		result  =value ;
		System.out.println(value +"*5 =" + result );
		
		result = value ;
		result  =value / 5;
		System.out.println(value +"/5 =" + result );
		
		result = value =5 ;
		result  =value % 5;
		System.out.println(value +"%5 =" + result );
		
	}
}