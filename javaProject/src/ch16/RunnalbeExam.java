package ch16;

public class RunnalbeExam implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+i);
		}

	}
	public static void main(String[] args) {
		RunnalbeExam e1 = new RunnalbeExam();
		
		//Runnalbe을 쓸 때는 Thread를 별도로 생성해서 써야 한다.
		//new Thread(스레드구현객체, "스레드이름"
		Thread t1 = new Thread(e1, "thread1");
		Thread t2 = new Thread(e1, "thread2");
		
		t1.start();
		t2.start();
	}

}