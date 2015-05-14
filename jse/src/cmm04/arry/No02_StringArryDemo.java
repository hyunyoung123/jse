package cmm04.arry;

public class No02_StringArryDemo {
	public static void main(String[] args) {
		String[] juso = {"서울", "종로", "광화문"};// string뒤에 []붙이나 juso뒤에 붙이나 상관x
		
		/*String[] juso = new String[3];
		juso[0]="서울";
		juso[1]="종로";
		juso[2]="광화문";
		이거 줄이면 위처럼 나옴*/
				
		for(int i=0; i<juso.length;  i++){ // i<3인 이유는  0부터 시작해서 012 세개니까 !
			// i<3 은 갯수를 세야되는데 많으면 셀수없으니까 juso(배열이름).length사용하면 됨 
			System.out.println("지역 "+juso[i]);
		}
		
	}

}
