package project9_0412;

public class Test_Object {
	public static void main(String[] args) {
		Object a = new Test_Object2(); //Object 형태로 변수를 만듬(int형, double형처럼) => 실질적으로 사용하는 것은 Test_Object2에 있는 값
		Object b = new Test_Object2();
		
		System.out.println(".equals 결과 : " + a.equals(b));  //a와 b는 다름으로 false값
		System.out.println("a.toString 결과 : " + a.toString());
		System.out.println("a 결과 : " + a);
		System.out.println("b.toString 결과 : " + b.toString());
		System.out.println("b 결과 : " + b);
	}
}
