package project11_0415;

public class Student {
//	총 5개의 프로피티 생성
	String name;
	int kor;
	int eng;
	int math;
	int total;  
	
	public String print() {
		String tmp = this.name + "총점 : " + String.format("%03d", this.total) + "(국어" + this.kor +", 영어" + this.eng + ", 수학" + this.math+"))";
		return tmp;
		
		
//		@Override
//		public String toString() {
//			String tmp = String.format("%03d", this.total);
//			return tmp;
//			
//		}
	
}
}