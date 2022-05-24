package ch12;

public class OuterEx {
	class InnerEx{
		private int num = 2;
		private String name = "사임당";
		private String email = "saim@gmail.com";
		private String add = "서울시 강남구 역삼동";
		void print() {
			System.out.println("-------------------------------");
			System.out.println("고객번호 : "+num);
			System.out.println("이름 : "+name);
			System.out.println("이메일 : "+email);
			System.out.println("주소 : "+add);
			System.out.println("-------------------------------");
		}
				
	}
	public static void main(String[] args) {
		OuterEx oe = new OuterEx();
		OuterEx.InnerEx ie = oe.new InnerEx();
		ie.print();
		
		

	}
}
