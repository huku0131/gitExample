package ch16;

public class MyThreadUse1 {
	public static void main(String[] args) {
		MyThreadEx1 mt1 = new MyThreadEx1("**") ;
		MyThreadEx1 mt2 = new MyThreadEx1("++") ;
		MyThreadEx1 mt3 = new MyThreadEx1("##") ;
		mt1.setName("스레드1");
		mt2.setName("스레드2");
		mt3.setName("스레드3");
		
		mt1.setPriority(Thread.MAX_PRIORITY);
		mt3.setPriority(Thread.MIN_PRIORITY);
		mt1.start();
		mt2.start();
		mt3.start();
		
	}
}
