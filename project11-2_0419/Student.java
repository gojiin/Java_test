package project11_0415;

public class Student implements Comparable<Student>{ 
// student 객체 생성 및 인터페이스추가(implements), 비교를 위한 외부규칙추가(Comparable) 
// Comparable 뒤에 붙어있는 <Student>를 제네릭이라고 함, 제네릭은 그냥 클래스 이름이랑 똑같이 만들면 됨.
// 제네릭이 사용되어야 하는 이유 : 제네릭을 사용하지 않으면 Object로만 타입을 받을 수 있음 => Student Class를 캐스팅 한 후 사용해야함
//	총 5개의 프로피티 생성(student객체는 총 5개의 프로피티 갖고있음)
	String nam e;
	int kor;
	int eng;
	int math;
	int total;  
	
	public String print() {
		String tmp = this.name + "총점 : " + String.format("%03d", this.total) + "(국어" + this.kor +", 영어" + this.eng + ", 수학" + this.math+"))";
		return tmp;
		
		
//		@Override
//		public String toString() {
//			String tmp = String.format("%03d", this.total); //이런 형태로 문자열로 바꿔줌 %뒤에 붙은 0은 자릿수를 채워주는 역할 
//		=> 문자열 비교는 첫글자부터 하기 때문에 0으로 자릿수를 안채워줄경우 ex) "2" > "100" 이렇게 됨
//			return tmp;
//			
//		} => 자바에서 제공하는 sort방식 사용할 경우 이 문자열 비교는 사용하지 않아도 됨.
	
}

	@Override
	public int compareTo(Student o) {
		if (this.total > o.total) { //내가 값이 크면 음수, 작으면 양수, 같으면 0을 리턴해서 숫자를 비교 => 내림차순(부등호를 반대로 설정하면 오름차순)
			return -1;
		} else if (this.total < o.total) {
			return 1;
		}
		return 0;
	}
}