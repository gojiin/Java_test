
public class RunClass {
	public static void main(String[] args) {
		Strudent[] sArr = new Strudent[5];
		
		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = new Strudent();
			sArr[i].inputScore();
		}
		
		for (int i = 0; i < sArr.length; i++) {
			Strudent.korTotal = Strudent.korTotal + sArr[i].korScore;
			Strudent.engTotal = Strudent.engTotal + sArr[i].engScore;
			Strudent.mathTotal = Strudent.mathTotal + sArr[i].mathScore;
		}
		
		System.out.println("국어 총점은 : " + Strudent.korTotal);
		System.out.println("영어 총점은 : " + Strudent.engTotal);
		System.out.println("수학 총점은 : " + Strudent.mathTotal);

		System.out.println("국어 평균은 : " + ((double)Strudent.korTotal / sArr.length));
		System.out.println("영어 평균은 : " + ((double)Strudent.engTotal / sArr.length));
		System.out.println("수학 평균은 : " + ((double)Strudent.mathTotal / sArr.length));
	}
}
