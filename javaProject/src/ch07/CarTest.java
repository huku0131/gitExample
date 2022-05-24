package ch07;

public class CarTest {
	public static void main(String[] args) {
		Car my = new Car();//객체생성, 참조변수인 my는 car라는 객체가 있는 주소값을 기억한다.
		my.changeGear(5);
		my.color = "흰색";
		my.speed = 100;
		my.print();
		
	}
}
