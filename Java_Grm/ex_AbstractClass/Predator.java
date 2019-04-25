package ex_AbstractClass;

public abstract class Predator extends Animal { //추상 클래스 생성 : abstract + 클래스명  
    public abstract String getFood(); //필드 선언부 : abstract + return값의 형(type) + 메소드 이름
}
//추상 클래스로는 객체를 생성할 수 없음
//그러나 추상 클래스를 상속받은 서브 클래스는 객체를 생성할 수 있음
//=> 추상클래스에서 상속받은 추상 메소드의 몸체를 서브 클래스에서 오버라이딩해서 구현하기