
public class CoinBank {
//	����1. �Ա��ϴ� ����� ���� �ִ� ���, ���� �޽����� �ִ� ����� 2�����̴�. 
//	����2. ���� �־��� ��� �����׶����̶�� �޽����� �Ա� �׼� ��� 
//	����3. �޽����� ���� ������ �޽����� �Ա� �׼� ��� 
//	����4. ��crash���� �Է��ϸ� �� �׼� ��°� �Բ� ���α׷� ����
	
	private int totalCoin; //���������� ���� //private�� �̿��Ͽ� ���� ���� => �ܺο��� �Ժη� �������� ���ϵ���
	
	public void deposit(int coin, String message) { //coin�� message�� �Ķ����(�Ű�����)�� ���� �޼ҵ� ����

			this.totalCoin += coin; //totalCoin�� �Ű������� ������ coin�� ��� ���������� 
			//�Ķ���ͷ� ������ ������ ���� ���������� �����൵ �ǳ�...??? => ���ص� �Ǵ°� ����!
			
			if(message.equals(" ")) { //���࿡ ���ο��� message �Է��� ������
				System.out.println("���׶�~" + coin + "���� �ԱݵǾ����ϴ�.");
			} else { //���ο��� message �Է��� �־�����
				System.out.println("�޼��� : " + message + ",   " + totalCoin + "���� �ԱݵǾ����ϴ�.");
			}
		}
	
	public void withdraw() { //������ִ� �޼ҵ� 
		System.out.println("�� �ݾ�" + totalCoin + "�� ��ݵǾ����ϴ�.");
		System.out.println("�ܾ��� 0�� �Դϴ�.");
	}
		
	}

