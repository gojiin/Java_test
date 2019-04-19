package project11_0415;

import java.util.Random;

public class Random2 extends Random { //Random클래스 상속
	public Student randomStudent(Student target) { //Student 클래스에서 하나 받아서 쓰겟음, target에는 주소만들어옴(call by refarance)
		target.kor = this.nextInt(101); //Raondom을 상속받았기 때문에 부모에 있는 메소드는 다 사용가능하므로 this. 사용가능
		target.eng = this.nextInt(101);
		target.math = this.nextInt(101);
		return target; //주소값으로 들어갈 때는 return값이 없어도 됨. call by value는 return값이 필요함
		
	}

}
