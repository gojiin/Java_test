package project11_0415;

import java.util.Random;

public class RunClass { 			//메인단계
	public static void main(String[] args) {
		Random rand = new Random();	
//  	배열을 이용하여학생 10명의 객체 만들기
		Student[] student = new Student[10];
//		step1. 각각의 객체 데이터를 생성해서 배열에 넣어두기
		for (int i = 0; i < student.length; i++) { 
			student[i] = new Student();
		}
//		step2. 각 객체 데이터에 접근하여 과목별 점수 채워두기(랜덤하게)
		for (int i = 0; i < student.length; i++) {
			student[i].name = (i + 1) + "번 학생";  //student 클래스에 있는 name을 불러온 것.
			student[i].kor = rand.nextInt(101); //student 클래스에 있는 kor을 불러온 것.
			student[i].eng = rand.nextInt(101); //student 클래스에 있는 eng을 불러온 것.
			student[i].math = rand. nextInt(101); //student 클래스에 있는 math을 불러온 것.
		}
//		step3. 각 객체 데이터에 접근하면서 시험 성적을 수집하여 평균
		for (int i =0; i < student.length; i++ ) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
		}
//		step4. 점수 내림차순 정렬
		for(int i =0; i < student.length; i++) { //student의 배열의 인덱스가 0부터 하나씩 늘어날때마다
			for(int j = i; j < student.length; j++) { //student 배열의 인덱스가 i가 가리키는 인덱스부터 하나씩 늘어날때마다
				if (student[i].total > student[j].total) { //
					Student tmp = student[i];
					student[i] = student[j];
					student[j] = tmp;
				}
			}
		}
		for(int i =0; i < student.length; i++) {
			System.out.println(student[i].print());
			
}
}
}