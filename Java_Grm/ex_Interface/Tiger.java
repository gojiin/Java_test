package ex_Interface;

public class Tiger extends Animal implements Predator { //Animal을 상속하고 있고 Preddactor 인터페이스를 갖고있는 Tiger클래스임

	@Override
	public String getFood() {
		
		return "apple";
    }
}