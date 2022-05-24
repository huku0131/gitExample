package ch11;

public class ContrallabeDemo {
	public static void main(String[] args) {
		TV tv= new TV();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();
		Controllable.reset();//static 메소드인 reset()은 클래스이름.메소드로 접근 가능
		
		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
	}
}
