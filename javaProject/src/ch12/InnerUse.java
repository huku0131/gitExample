package ch12;

import ch11.Flyer;

public class InnerUse {
	public static void main(String[] args) {
		Flyer f = new Flyer() {
			public void takeOff() {
				System.out.println("take off");
			}
			public void fly() {
				System.out.println("fly");
			}
			public void land() {
				System.out.println("land");
			}
		};
	f.takeOff();
	f.fly();
	f.land();
	}
}
