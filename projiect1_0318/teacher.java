package project1_0318;

public class teacher {
	public static void main(String[] args) {

		//		##교수님 풀이(1~100까지 합, 홀,짝 합)
		
		int total = 0; //변수 초기화 시키는 단계
		int evenTotal = 0;
		int oddTotal = 0;

		for(int i =0; i < 100; i++) {
			int number = i + 1;
			total = total + number;
			
			if(number % 2 == 0) {
				evenTotal = evenTotal + number;
			} else {
				oddTotal = oddTotal + number;
			}
	}
		System.out.println("총합은" + total);
		System.out.println("홀수 총합은" + oddTotal);
		System.out.println("짝수 총합은" + evenTotal);
		
	}
}
