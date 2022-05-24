package ch11;

public class FlyUse {
	public static void main(String[] args) {
		Bird bird = new Bird();
		System.out.println(bird);
		bird.takeOff();
		bird.fly();
		bird.land();
		
		Airplane air = new Airplane();
		System.out.println(air);
		air.takeOff();
		air.fly();
		air.land();
		
		System.out.println("==========================");
		Flyer f=new Bird();
		System.out.println(f);
		f.takeOff();
		f.fly();
		f.land();
	}
}
