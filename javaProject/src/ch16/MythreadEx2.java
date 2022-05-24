package ch16;

public class MythreadEx2 implements Runnable{
	String str;
	public MythreadEx2(String str) {
		this.str=str;
	}
	
	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println(Thread.currentThread().getName()+str);
		}
	}
	
}
