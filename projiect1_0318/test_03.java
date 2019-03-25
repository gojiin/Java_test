package project1_0318;


//#Q2.순환문을 사용하여 홀수, 짝수의 1~100까지 합 구하기

public class test_03 {
	public static void main(String[] args) {
		int odd = 0;
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 1) {
			odd = odd + i;
		}
		}
		System.out.println("1부터 100까지 홀수의 합은" + odd);
	
		int even = 0;
		for (int i = 0; i < 101; i++) {
			if ( i % 2 == 0) {
			even = even + i; 
			}
		}
		System.out.println("1부터 100까지 짝수의 합은" + even);
		
	}
}
