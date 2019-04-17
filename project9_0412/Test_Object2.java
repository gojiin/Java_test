package project9_0412;

public class Test_Object2 { //extends Object 동일
	String name = "Hello";
	@Override
	public String toString() {
		
		return this.name;
	}
	@Override
	public boolean equals(Object obj) { // 사용한 변수자체가 오브젝트 형태로 들어왔기 때문에 //이건 부모 클래스에 있는 값
		Test_Object2 obj2 = (Test_Object2)obj; // 캐스팅이 필요함: 변수의 형태를 인지하기 위하여 필요 //이건 자식클래스에서 재정의한 값
		if(this.name.contentEquals(obj2.name)) {
			return true;
		}
		return false;
		
		
	}

}
