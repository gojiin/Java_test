package project9_0412;
import java.util.Random;

public class Random3 extends Random{
	int[ ] resultArr = new int[10]; //결과값을 넣어줄 변수 하나 더 생성
	public void nextInt2(int range) {
		for(int i = 0; i < resultArr.length; i++) {
			resultArr[i] = super.nextInt(range);
		}
	} 
}
