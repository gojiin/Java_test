
public abstract class Figure { //부모 클래스
	String name = "도형 넓이 구하기";
	public abstract void inputValue();	//기능이 없는 메소드 이기때문에 다른곳에서 사용할 수 없음. 
																//	abstract = 추상화메소드!!! 따라서 자식클래스에서 기능을 만들어줘야해서 abstract로 지정한것임.
	public void printResult() {
		System.out.println(this.name);
	}
}
