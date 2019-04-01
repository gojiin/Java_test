
public class RunClass {
	public static void main(String[] args) {
		Student5[] sArr = new Student5[5];
		
		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = new Student5((i + 1) + "번 학생");
			sArr[i].inputData();
		}
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
//			System.out.println(sArr[i].toString());
		}
	}
}
