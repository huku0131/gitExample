package ch06;

public class CallStackTest {
	public static void main(String[] args) {
		firstMethod();
	}

	public static void firstMethod() {
		secondmethod();
	
	}

	public static void secondmethod() {
		System.out.println("secondMethod()");
	
	}
}
