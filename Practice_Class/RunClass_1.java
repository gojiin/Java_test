import java.util.Scanner;

public class RunClass {
	public static void main(String[] args) {
		CoinBank coinBank = new CoinBank(); //����� �޼ҵ���� �ִ� Ŭ������ �ҷ���
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<=9999999; i++) {
			System.out.println("�޴� : 1.�Ա� 2.�Ա�+�޼��� �Է� 3.���");
			int select = scan.nextInt();
			if(select == 1) {
				System.out.println("�Ա��� �ݾ��� �Է����ּ���.");
				int coin = scan.nextInt();
				coinBank.deposit(coin, " ");
			} else if(select == 2) {
				System.out.println("�Ա��� �ݾ��� �Է����ּ���.");
				int coin = scan.nextInt();
				System.out.println("�޼����� �Է����ּ���.");
				String message =scan.next(); //.nextLine���� ó�� ��, �޼��� �Է¹����� ��µǱ� ���� scan.nextLine()�� �ѹ� �� �������
				coinBank.deposit(coin, message);
			} else if(select == 3) {
				coinBank.withdraw();
				break;
			} else {
				System.out.println("�߸��� �޴��Դϴ�. �ý����� �����մϴ�.");
				break;	
		}
		}
		
	}

}
