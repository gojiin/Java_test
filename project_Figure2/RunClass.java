import java.util.Scanner;

public class RunClass { //메인클래스 : 실행시키는 클래스
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. 삼각형 넓이 구하기, 2. 사각형 넓이 구하기, 3. 원 넓이 구하기");
		int selectMenu = scanner.nextInt();
		
		Figure figure = null;		//상속을 받는 첫번째 이유 : 이렇게 figure라는 변수 하나만 받기 위하여! 
		//null로 입력한 이유 : Figure클래스에서 이 메소드에 관한 기능을 지정안했기 때문 
		if (selectMenu == 1) {
			figure = new Triangle();	//figure 변수에 삼각형 클래스를 인스턴스로 만들어서 넣언 것
		} else if (selectMenu == 2) {
			figure = new Squre();
		} else if (selectMenu == 3) {
			figure = new Circle();
		}
		
		figure.inputValue();
		figure.printResult();
	}
}
