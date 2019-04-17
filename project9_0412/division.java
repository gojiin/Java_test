package project9_0412;

import java.util.Scanner;

public class division {
	int number1 = 0;
	int number2 = 0;
	
	public void divisionInt()  {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("나눗셈 할 숫자를 입력해주세요 : ");
	this.number1 = scanner.nextInt();		//문자열 받는걸로 바꾸기 위해서는 scanner.nextLine();으로 변경
	try {		//try-catch 동작 : 
				//이 안에 있는걸 시도해서 에러가 발생하면 catch 부분으로 감
	} catch (Exception e) {
		// TODO: handle exception 에러가 발생했을 때  나올 값 입력(디폴트 값 등..)
	}
	
	System.out.println("나눗셈 할 숫자를 한개 더 입력해주세요 : ");
	this.number2 = scanner.nextInt();
	}
	
	public void divisionInt2() {
		double number = 0;
		number = (double)this.number1 / this.number2;
		number = Math.round( number * 100) / 100;		//반올림 만들기 
		System.out.println(this.number1 + "  나누기  " + this.number2 + " = " + number + "입니다.");
	}
	

	}

