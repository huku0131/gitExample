package ch16;

//멀티스레드 : 작업단위가 2개이상
//구현방법 1 : Thread 상속
//구현방법 2 : Runnable을 구현

public class ThreadExam extends Thread {
	public ThreadExam(String name) {
		super(name);
		
	}
	@Override
	public void run() {
		for(int i=1; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//1초 멈춤
		}
	}
	public static void main(String[] args) {
		ThreadExam e1 = new ThreadExam("thread1");
		ThreadExam e2 = new ThreadExam("thread2");
		ThreadExam e3 = new ThreadExam("thread3");
		
		//e1.run(); 을 직접 사용하면 안된다. start()메소드를 반드시 써야 한다.
		e1.start(); //스레드객체.start() ==> run()이 자동호출됨
		e2.start(); //위와 동시에 호출
		e3.start();
		
	}	
}
