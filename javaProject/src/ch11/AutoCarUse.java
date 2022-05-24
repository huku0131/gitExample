package ch11;

public class AutoCarUse {
	public static void main(String[] args) {
		OperateCar obj = new AutoCar();
		obj.start();
		obj.setSpeed(90);
		obj.turn(15);
		obj.stop();
	}
}
