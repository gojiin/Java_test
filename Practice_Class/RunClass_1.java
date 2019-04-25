import java.util.Scanner;

public class RunClass {
	public static void main(String[] args) {
		CoinBank coinBank = new CoinBank(); //사용할 메소드들이 있는 클래스를 불러옴
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<=9999999; i++) {
			System.out.println("메뉴 : 1.입금 2.입금+메세지 입력 3.출금");
			int select = scan.nextInt();
			if(select == 1) {
				System.out.println("입금할 금액을 입력해주세요.");
				int coin = scan.nextInt();
				coinBank.deposit(coin, " ");
			} else if(select == 2) {
				System.out.println("입금할 금액을 입력해주세요.");
				int coin = scan.nextInt();
				System.out.println("메세지를 입력해주세요.");
				String message =scan.next(); //.nextLine으로 처리 시, 메세지 입력문구가 출력되기 전에 scan.nextLine()을 한번 더 해줘야함
				coinBank.deposit(coin, message);
			} else if(select == 3) {
				coinBank.withdraw();
				break;
			} else {
				System.out.println("잘못된 메뉴입니다. 시스템을 종료합니다.");
				break;	
		}
		}
		
	}

}
