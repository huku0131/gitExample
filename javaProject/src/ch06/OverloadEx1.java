package ch06;

public class OverloadEx1 {
public static void main(String[] args) {
	print(10.5); // 실수형 3)
	print("hello"); //문자열 1)
	print(100); // 정수형 4)
	print("hi","java"); //문자열 2)
	
	
}
//1
static void print(String b) {
	System.out.println(b);
}
//2
static void print(String a, String b) {
	System.out.println(a);
	System.out.println(b);
}
//3
static void print (double a) {
	System.out.println(a);
}
//4
static void print (int c) {
	System.out.println(c);
}

}
