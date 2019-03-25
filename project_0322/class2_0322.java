package project2_0322;

import java.util.Arrays;
import java.util.Scanner;

//import java.util.Scanner;

//#실습 : 10명의 국어점수 입력 받아서 입력된 값 출력 및 총점, 평균 구하기

public class class2_0322 {
public static void main(String[] args) {
	
//	int[] arr = {1, 2, 3, 4, 5, 6,  7, 8, 9, 10};
//	
//	
//	for(int i = 0; i < arr.length; i++) {
//		System.out.println("국어 점수를 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		scan.nextLine();
//	}
//	
//	int[] arr2 = arr
	
	// #교수님 풀이
	int[] korScore = new int[10];  // 배열 10칸을 만들겠다는 뜻, new가 들어가면 새로운게 만들어 진다고 생각하면 됨!!
	
	Scanner scan = new Scanner(System.in);
	
	for (int i = 0; i < korScore.length; i++) {
		System.out.print("국어 점수 :  ");
		korScore[i] = scan.nextInt();
	}
	System.out.println(Arrays.toString(korScore));
	
	int total = 0;
	double avr = 0;
	
	for (int i = 0; i < korScore.length; i++) {
		total = total + korScore[i];
	}
	avr = (double)total / korScore.length; //나누기 할 때는 꼭 double로 캐스팅해주기!
	
	System.out.println("총점은 : " + total);
	System.out.println("평균은" + avr);
}
}

	//추가미션 : 이름, 국어점수, 수학점수, 영어점수를 입력 받아서 각각의 점수 출력, 각각의 총점/평균 출력과 전체 총점/평균 출력을 해보세요.
	//추가미션2 : 입력된 값들이 지워지지 않고 수정도 가능하도록 만들어보기
