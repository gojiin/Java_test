package project1_0318;

//###for문을 이용하여 3명의 랜덤한 국어점수 총점과 평균 받기
import java.util.Random;
public class test_01 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int totalScore = 0;
		
		for (int i = 0; i < 3; i++) {
			int randNumber = rand.nextInt(101);
			System.out.println("입력된 점수 : " + randNumber);
			totalScore = totalScore + randNumber;
		}
	}
	
//### while문 사용하여 위 for문 적용하기
		
//		System.out.println("총점은 " + totalScore + "입니다.");

	//	double averageScore = 0;
///		averageScore = (double)totalScore / 3; #나누기 할 때는 반드시 double 사용!(소수점 표현)
		//*System.out.println("평균은 " + averageScore + "입니다.");
//	}
}


