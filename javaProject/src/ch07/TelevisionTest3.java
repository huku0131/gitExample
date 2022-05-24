package ch07;

public class TelevisionTest3 {
	public static void main(String[] args) {
		Television tv = new Television();
		tv.channel=8;
		tv.volume=9;
		tv.onOff=true;
		tv.print();
		
		Television you = new Television();
		you.channel=5;
		you.volume=12;
		you.onOff=true;
		you.print();
	}

}
