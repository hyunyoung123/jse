package cmm01.var;
/*
 Date : 2015.05.11
 Author : ������
 Description : ĳ���� ���� ���� �н� �ڷ� 
 * */
class No02_CastingDemo {
	public static void main(String[] args) {
		/*
UP\p Casting
��ȯ (Conversion)
promotion
 ������( implicit )�ڵ���ȯ
  �ڵ��� ��ȯ�� ������ ������ ǥ�������� �۹��ʿ���
  ���� ������ ��ȯ�� �ɶ��� �����ϴ� 
  
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
		 = Casting (ĳ����)
		 =��������ȯ
		 ���α׷����� �����(explicit)���� �����ϴ� Ÿ�� ��ȯ
		 ��Һ�ȯ�� �Ǵ� ��쿡�� �ݵ�� ��������� ĳ�����Ͽ��� �Ѵ� 
		 �� , ������ �ս��� �߻��� �� �ִ�.
		 * */
		Double varDou = 123.456;
		int varint2 = 3;
		// int downByte = (int) varDou ; 
		byte  varB2 = (byte) varint2; 
		float varf= 123.456f;
		int varInt3 = (int) varf;
		
		System.out.println("varInt3 �� : " + varInt3);
	}
}