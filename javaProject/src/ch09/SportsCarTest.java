package ch09;

public class SportsCarTest {
	public static void main(String[] args) {
		SportsCar obj = new SportsCar();
		obj.speed = 10;//Car의 멤버메소드
		obj.setSpeed(60);//Car의 멤버메소드
		obj.setTurbo(true);//SportsCar의 멤버 메소드
	}
}
