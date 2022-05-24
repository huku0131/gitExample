package ch12;

public class LocalOuter2 {
	private int data=20;
	void display() {
	//	int value=50;//지역변수를 inner class 아래 위치하면 에러 (jdk1.7)
		class LocalInner2{
			int value=50;
			void msg() {
				System.out.println(value);
			}//end method
			
		}//end inner class
		LocalInner2 li = new LocalInner2();
		li.msg();
	}
	public static void main(String[] args) {
		LocalOuter2 lo = new LocalOuter2();
		lo.display();
	}
}
