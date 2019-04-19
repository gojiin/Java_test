import java.util.Arrays;
import java.util.Random;

public class RandomArray {
	public static void main(String[] args) {
		// 0~100까지 임의의 수 30개 발생시킨 후 배열에 넣어 정렬
		//조건1) 정렬 전/후의 값을 화면에 출력
		//조건2)소트 알고리즘 사용
		
		int randomArray[] = new int[30];
		Random random = new Random();
		
		for(int i=0; i<randomArray.length; i++) {
			randomArray[i] = random.nextInt(101);
		}
		Arrays.sort(randomArray);
		System.out.println(Arrays.toString(randomArray));
		
	}
	

}
