package ch07;

public class Car {
	//멤버 변수
	String color;
	int speed;
	int gear;
	
	void changeGear(int g) {
		gear = g;
	}
	void speedUp() {
		speed=speed + 10;
	}
	void speedDown() {
		speed = speed - 10;
	}
	void print() {
		System.out.println("차량 생상 : " + color);
		System.out.println("차량 속도 : " + speed +" km/h");
		System.out.println("차량 기어단수 : " + gear + "단");
	}
}
