package ch10;

//static => 메모리의 특정한 static 영역을 사용(객체생성은 안하고 무조건 자동적으로 메모리 로딩)
//non-static =>객체 생성된 후(mew)에 로딩
//static method에서는 static 안의 로컬 변수(일반 변수)나 static으로 정의된 멤버 변수만 사용 가능

public class A {
	//non-static 멤버변수
	String name = "kim";
	
	//static 멤버변수
	static int n = 20;
	
	//non-static 멤버메소드
	public void print(){
		System.out.println(name);
		System.out.println(n);
	}
	public static void main(String[] args) {
		int a = 10;
		double b=20.5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);//static은 static멤버 끼리 통한다.
		A aa =new A();
		System.out.println(aa.name);//참조변수.non-static멤버변수
		//System.out.println(name);//non-static멤버변수는 static메소드에서는 바로 쓸 수 없다
		
		aa.print();
	}
	
}
