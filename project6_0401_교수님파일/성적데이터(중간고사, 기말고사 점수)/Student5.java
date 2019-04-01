import java.util.Scanner;

public class Student5 {
	String name;
	int middleScore;
	int finalScore;

	Student5() {
		
	}
	
	Student5(String name) {
		this.name = name;
	}
	
	public void inputData() {
		Scanner scan = new Scanner(System.in);
		String tmp;
		System.out.println(name + " 점수 입력");
		System.out.println("중간고사");
		tmp = scan.nextLine();
		this.middleScore = Integer.parseInt(tmp);
		System.out.println("기말고사");
		tmp = scan.nextLine();
		this.finalScore = Integer.parseInt(tmp);
	}
	
	@Override
	public String toString() {
		return this.name + " (중간고사 " + this.middleScore + ", 기말고사 " + this.finalScore + ")";
	}
}
