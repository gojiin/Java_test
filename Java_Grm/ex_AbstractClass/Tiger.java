package ex_AbstractClass;

public class Tiger extends Predator  { //추상 클래스인 Predator를 상속받고 있음

	@Override //추상 클래스를 상속받았기 때문에 반드시 오버라이딩 하여 추상클래스에 있는 메소드 사용
	public String getFood() {
		
		return "apple";
    }
}