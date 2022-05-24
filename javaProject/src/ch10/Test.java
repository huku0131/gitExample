package ch10;

public class Test {
	static int a;//static member 변수
	int b; //non-static member 변수
	void print() {//non-static member 메소드
		System.out.println(a);//non-static 멤버 안에서는 static 멤버를 얼마든 사용가능하다.
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println(a);
		
		Test t=new Test();
		System.out.println(t.b);
		System.out.println(t);
		t=null;
		System.out.println(t); 
	}
}
