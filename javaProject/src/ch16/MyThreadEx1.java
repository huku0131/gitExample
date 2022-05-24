package ch16;

public class MyThreadEx1 extends Thread {
	String str;
	public MyThreadEx1(String str) {
		this.str=str;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+str);
		}
	}
}
