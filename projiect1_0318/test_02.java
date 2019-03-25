package project1_0318;

//#Q1.순환문을 사용하여 1~100까지 합 구하기

public class test_02 {
	public static void main(String[] args) {
		int value = 0;  //합을 저장할 변수 설정
		for(int i = 0;  i<100; i++) { //100번 반복한다는 뜻
			int number = i + 1;
			value = value + number;
		}
		System.out.println("1~100까지의 합은" + value + "입니다.");
				
	}
}
