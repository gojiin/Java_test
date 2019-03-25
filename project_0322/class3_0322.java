package project2_0322;

import java.util.Scanner;

// ##배열과 메서드

public class class3_0322 {
public static void main(String[] args) {  //자동입력 : main + ctrl + space
	String a = "hello";
	String b = "hello";
	Scanner scan = new Scanner(System.in); 
	String c = scan.nextLine(); //c는 위에서 내가 입력한 값(hello)
	
	System.out.println(c == b); //c와 b가 같다라는 뜻. 같지 않으면 false가 나올거임
	System.out.println(a.equals(b)); //문자열끼리 비교하게 됨:해쉬값 이런거 상관없이 말그대로 문자열 그대로 비교하는 거기때문에 true가 나올거임.
	
	System.out.println(a.hashCode()); //a의 해쉬코드 프린트
	System.out.println(b.hashCode()); //b의 해쉬코드 프린트
}
}


