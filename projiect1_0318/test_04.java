package project1_0318;

import java.util.Random;
import java.util.Scanner;

//#Q3.컴퓨터와 대전하는 주사위 게임을 만들기

public class test_04 {
	public static void main(String[] args) {
		int comDice = 0;
		int userDice = 0;
		
		Random rand = new Random();
	    Scanner scan = new Scanner(System.in);
	    
	   for (int i = 0; i < 10000000; i++) {
		   System.out.println("컴퓨터의 주사위를 굴릴까요? (종료하시려면 q를 입력하세요)");
		   String inputString = scan.nextLine();
//		   여기부터 다시 입력!!!
			   
		   }
	   }
		System.out.println("컴퓨터의 주사위를 굴릴까요?");
		scan.nextLine();
		
		comDice = rand.nextInt(6) + 1;
		System.out.println("컴퓨터의 주사위는" + comDice + "입니다.");
		
		System.out.println("사용자의 주사위를 굴릴까요?");
		scan.nextLine();
		
		userDice = rand.nextInt(6) + 1;
		System.out.println("사용자의 주사위는" + userDice + "입니다.");
		
		if(comDice == userDice) {
			System.out.println("비겼습니다.");
		} else if (comDice > userDice) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else  {
			System.out.println("사용자가 이겼습니다.");
			
			
			
		}
		
	}

}
