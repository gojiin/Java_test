import java.util.Scanner;

public class Squre extends Figure { //자식클래스 2
	double width = 0;
	double height = 0;
	public Squre() {
		this.name = "사각형 넓이 구하기";
	}
	@Override
//Override라는 항목이 있으면 기존에 있는 inputValue라는 메소드를 사용한다는걸 확실히하기위해.(이 문구를 삭제한다고해서 기능이 삭제되는것은 아님)
	public void inputValue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("넓이를 입력하세요");
		this.width = scanner.nextDouble();
		System.out.println("높이를 입력하세요");
		this.height = scanner.nextDouble();
	}
	public void printResult() {
		super.printResult();
		System.out.println("넓이는 " + (this.width * this.height) + "입니다.");
	}

}
