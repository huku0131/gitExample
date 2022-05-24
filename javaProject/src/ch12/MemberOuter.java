package ch12;

public class MemberOuter {
	int num = 1;
	String name = "홍길동";
	String email = "hong@gmail.com";
	class TestInner{
		void print() {
			System.out.println("고객번호 : "+ num);
			System.out.println("이름 : "+name);
			System.out.println("이메일 : "+email);
		}
	}

	public static void main(String[] args) {
		MemberOuter mo = new MemberOuter();
		MemberOuter.TestInner ti = mo.new TestInner();
		ti.print();
	}
}
