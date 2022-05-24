package ch11;

//추상클래스(abstract class) - 1개 이상의 추상 메소드를 가진 클래스
//추상 메소드 : 메소드 내용이 완성되지 않은 메소드
//추상클래스는 객체 생성을 할 수 없음
//(하위 클래스에서 상속받아 추상메소드를 오버라이딩해야 사용 가능)

public abstract class AbstractClass {//하나라도 abstract메소드가 있으면 클래스도 abstract해야 한다.
	abstract void method1();//추상메소드(미구현메소드)
	void method2() {//완성된메소드
		System.out.println("완성된 메소드");
	}
}
