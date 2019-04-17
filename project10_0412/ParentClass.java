package project10_0412;

public abstract class ParentClass {	//추상화 : 이렇게 만들어져있으면 자식 클래스에서 이 메소드를 꼭 사용해야함
	public void print1() {
		System.out.println("hello");
	}
	public abstract void print2();	//추상화 : 이렇게 만들어져있으면 자식 클래스에서 이 메소드를 꼭 사용해야함
}
