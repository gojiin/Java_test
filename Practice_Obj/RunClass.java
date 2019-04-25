
public class RunClass {
	public static void main(String[] args) {
		Random2 random2 = new Random2(); //랜덤 클래스를 상속받는 Random2 클래스를 가져옴
		int randomNumber2 = random2.RandomSum(); //Random2클래스에 있는 메소드인 RandomSum 메소드를 가져옴
		System.out.println(randomNumber2); //return값을 randomNumber2변수에 담아주어 출력 //리턴값을 출력하기 위해서는 변수에 담아줘야하는것 같음!
		
	}

}
