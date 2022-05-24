package ch16;

public class MyBank {
	public void print(String a, int b) {	
		System.out.println(a +"님의 통장잔고는" + b + "만원 입니다.");
	}
	public void sl() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void bankA() {
		synchronized (this) {
			for(int i=1; i<=5; i++) {
				print("홍길동",i*10);
			}
			sl();
		}

	}
	public void bankB() {
		synchronized (this) {
			for(int i=2; i<=6; i++) {
				print("사임당",i*10);
			}
			sl();
		}
	}
	public void bankC() {
		synchronized (this) {
			for(int i=3; i<=7; i++) {
				print("이몽룡",i*10);
			}
			sl();
		}
	}
}
