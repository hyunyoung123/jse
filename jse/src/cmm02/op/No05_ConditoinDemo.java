package cmm02.op;

public class No05_ConditoinDemo {
	public static void main(String[] args) {
		int val01 = 1;
		int val02 =2;
		
		if((val01==1)&&(val02==2)){ // &&는 and ||는 or의 역할 !
			System.out.println("val01 의 값은 1이고, val02의 값은 2이다.");
		}
		if((val01==1)||(val02==1)){
			System.out.println("val01이 1 이거나, val02가 1이다.");
		}
	}

}
