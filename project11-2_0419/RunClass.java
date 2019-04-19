package project11_0415;

import java.util.Arrays;
import java.util.Random;

public class RunClass { 			//메인단계
	public static void main(String[] args) {
//		Random rand = new Random();	
//  	배열을 이용하여학생 10명의 객체 만들기
		Student[] student = new Student[10];
		String[] names = {"김동준", "고지인", "이형섭", "박성민", "김경현", "송진우", "정형석", "김예근", "공현", "최성욱"};
//		step1. 각각의 객체 데이터를 생성해서 배열에 넣어두기
		for (int i = 0; i < student.length; i++) { 
			student[i] = new Student();
		}
		Random2 rand  = new Random2(); //Random2를 상속받고 있음
//		step2. 각 객체 데이터에 접근하여 과목별 점수 채워두기(랜덤하게)
		for (int i = 0; i < student.length; i++) {
			student[i].name = names[i];  //Student 클래스에 있는 name을 불러온 것.
			student[i] = rand.randomStudent(student[i]);
//			student[i].kor = rand.nextInt(101); //student 클래스에 있는 kor을 불러온 것.
//			student[i].eng = rand.nextInt(101); //student 클래스에 있는 eng을 불러온 것.
//			student[i].math = rand. nextInt(101); //student 클래스에 있는 math을 불러온 것.
		}
		//step2까지 확실하게 알아두기! => 중간고사 hint
		
//		step3. 각 객체 데이터에 접근하면서 시험 성적을 수집하여 평균
		for (int i =0; i < student.length; i++ ) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
		}
//		step4. 점수 내림차순 정렬
//		for(int i =0; i < student.length; i++) { //student의 배열의 인덱스가 0부터 하나씩 늘어날때마다
//			for(int j = i; j < student.length; j++) { //student 배열의 인덱스가 i가 가리키는 인덱스부터 하나씩 늘어날때마다
//				if (student[i].total > student[j].total) { //
//					Student tmp = student[i];
//					student[i] = student[j];
//					student[j] = tmp;
//				}
//			}
//		}
		Arrays.sort(student); //자바방식으로 sort => 외부에서 만든 규칙 이용(student Class에서 규칙 추가했음)
//		Student a = new Student(); //메모리에 새로운 객체가 생성되고 그것에 대한 주소값이 a에 들어옴(객체에 대한 주소값만!)
//		Student b = a; 	//메모리에 b라는 객체가 생성되긴했지만 Student a와 주소가 같음 
		
		
		for(int i =0; i < student.length; i++) {
			System.out.println(student[i].print());
			
}
}
}