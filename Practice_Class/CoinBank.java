
public class CoinBank {
//	조건1. 입금하는 방식은 돈만 넣는 방법, 돈과 메시지를 넣는 방법의 2가지이다. 
//	조건2. 돈만 넣었을 경우 ‘딸그랑’이라는 메시지와 입금 액수 출력 
//	조건3. 메시지와 같이 넣으면 메시지와 입금 액수 출력 
//	조건4. ‘crash’를 입력하면 총 액수 출력과 함께 프로그램 종료
	
	private int totalCoin; //전역변수로 설정 //private를 이용하여 변수 은닉 => 외부에서 함부로 수정하지 못하도록
	
	public void deposit(int coin, String message) { //coin과 message를 파라메터(매개변수)로 갖는 메소드 생성

			this.totalCoin += coin; //totalCoin에 매개변수로 설정한 coin을 계속 누적시켜줌 
			//파라메터로 설정한 변수는 따로 변수선언을 안해줘도 되나...??? => 안해도 되는것 같음!
			
			if(message.equals(" ")) { //만약에 메인에서 message 입력이 없을때
				System.out.println("딸그랑~" + coin + "원이 입금되었습니다.");
			} else { //메인에서 message 입력이 있었을때
				System.out.println("메세지 : " + message + ",   " + totalCoin + "원이 입금되었습니다.");
			}
		}
	
	public void withdraw() { //출금해주는 메소드 
		System.out.println("총 금액" + totalCoin + "이 출금되었습니다.");
		System.out.println("잔액은 0원 입니다.");
	}
		
	}

