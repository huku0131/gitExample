package ch16;

public class MyThreadUse2 {
	public static void main(String[] args) {
		
	MythreadEx2 me1 = new MythreadEx2("**");
	MythreadEx2 me2 = new MythreadEx2("++");
	MythreadEx2 me3 = new MythreadEx2("##");
	
	Thread t1 = new Thread(me1);
	Thread t2 = new Thread(me2);
	Thread t3 = new Thread(me3);
	
	t1.setName("스레드1");
	t2.setName("스레드2");
	t3.setName("스레드3");
	
	t1.setPriority(Thread.MAX_PRIORITY);
	t3.setPriority(Thread.MIN_PRIORITY);
	t1.start();
	t2.start();
	t3.start();
	
	}
}
