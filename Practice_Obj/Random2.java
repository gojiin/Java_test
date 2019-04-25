import java.util.Random;

public class Random2 extends Random { //Random 클래스를 상속한 Random2 클래스 생성
//	임의의 숫자를 발생시키는 Random()매소드를 상속하여 랜덤하게 만들어진 값 + 100을 돌려주는 매소드를 만드시오.
	public int RandomSum() { //int형의 return값을 갖는 RandomSum 메소드 생성
		int randomNumber = this.nextInt(500); //Random클래스를 상속했으므로 그 클래스에 있는 기능을 다 쓸 수 있음 //500까지의 임의의 수 발생시켜서 randomNumber 변수에 담아주기
		int randomNumberSum = randomNumber + 100; //발생시킨 랜덤숫자에 100을 더한값을 변수에 담아주기
		System.out.println(randomNumber); //생성된 랜덤 숫자 확인
		return randomNumberSum; //메인 메소드에 돌려줄 리턴값
	}
	
//	부모클래스의 생성자는 자식 클래스에게 상속되지 않는다.
//	그대신, 부모 클래스의 인수 없는 생성자가 자동적으로 호출된다.
//	이렇게 부모 클래스로부터 상속받은 멤버가 성공적으로 초기화되는 메커니즘을 갖고있다.
	
//	생성자란? 메소드와 매우 비슷하지만 생성자의 이름은 반드시 클래스의 이름과 같아야 하며 리턴값이 없음
//	생성자는 그 클래스의 객체가 생성될 때 생성자 안의 코드가 자동으로 실행됨
//	따라서 객체의 멤버에 자동으로 초기화 값을 설정하는 용도로 사용됨.
	


}
