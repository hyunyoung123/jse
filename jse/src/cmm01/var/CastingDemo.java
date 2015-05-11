package cmm01.var;
/*
 Date : 2015.05.11
 Author : 조현영
 Description : 캐스팅 문법에 대한 학습 자료 
 * */
class CastingDemo {
	public static void main(String[] args) {
		/*
UP\p Casting
변환 (Conversion)
promotion
 묵시적( implicit )자동변환
  자동적 변환은 데이터 다입을 표현범위가 작문쪽에서
  많은 쪽으로 변환이 될때만 가능하다 
  
  byte > short > int > long > float > double
  char > int
		 * */
		byte varByte = 1;
		int varInt = 123;
		double varDouble = 123.456;
		
		int upByte  = varByte;
		double upByte2 =varByte;
		double upInt = varInt;
		
		System.out.println("Hellojava");
	
		/*
		 Down Casting
		 = Casting (캐스팅)
		 =강제성변환
		 프로그램에서 명시적(explicit)으로 지정하는 타입 변환
		 축소변환이 되는 경우에는 반드시 명시적으로 캐스팅하여야 한다 
		 단 , 데이터 손실이 발생할 수 있다.
		 * */
		Double varDou = 123.456;
		int varint2 = 3;
		// int downByte = (int) varDou ; 
		byte  varB2 = (byte) varint2; 
		float varf= 123.456f;
		int varInt3 = (int) varf;
		
		System.out.println("varInt3 값 : " + varInt3);
	}
}