package ch10;

class Pa3{
	int num = 10;
	public void print() {
		System.out.println("사번 : "+num);
	}
}

class Ch3 extends Pa3{
	String name = "홍길동";
	@Override
	public void print() {
		System.out.println("이름 : "+name);
		super.print();
	}
}

public class Poly3 {
	public static void main(String[] args) {
		String email = "hong@gmil.com";
		String tel="010-1234-5678";
		String ad="서울 강남구 역삼동";
		Pa3 c = new Ch3();
		c.print();
		System.out.println("이메일 : "+email);
		System.out.println("전화번호 : "+tel);
		System.out.println("주소 : "+ad);
		
	}
}
