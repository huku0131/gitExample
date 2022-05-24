package ch13;

public class Exam {
	public static void main(String[] args) {
		String a = "hello";//메모리상에는 String Pool영역에서 다루어짐
		System.out.println(System.identityHashCode(a));
		String b = "hello";
		System.out.println(System.identityHashCode(b));
		//String Pool영역안의 문자열을 다룰때는 같은 문자열이 있으면 참조변수가 다르더라도 같은 주소값을 가리킨다.
		System.out.println(a==b);
		String c = new String("hello");
		System.out.println(System.identityHashCode(c));
		String d = new String("hello");
		System.out.println(System.identityHashCode(d));
	}
}
