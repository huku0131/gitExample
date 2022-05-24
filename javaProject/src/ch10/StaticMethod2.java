package ch10;

public class StaticMethod2 {
	static int num = 10;
	static String name = "홍길동";
	String email = "hong@mail.com";
	String hp = "010-1234-5678";
	String addr="서울 강남구 역삼동";
	public static void printA() {
		StaticMethod2 M=new StaticMethod2();
		System.out.println("==printA()==");
		System.out.println("사번 :"+num);
		System.out.println("이름 : "+name);
		System.out.println("이메일 : "+M.email);
		System.out.println("전화 : "+M.hp);
		System.out.println("주소 : "+M.addr);

	}
	public static void main(String[] args) {
		StaticMethod2.printA();
		StaticMethod2 M1=new StaticMethod2();
		System.out.println("==printB()==");
		System.out.println("사번 :"+num);
		System.out.println("이름 : "+name);
		System.out.println("이메일 : "+M1.email);
		System.out.println("전화 : "+M1.hp);
		System.out.println("주소 : "+M1.addr);
		
	}
}
