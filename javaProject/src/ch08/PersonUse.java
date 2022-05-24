package ch08;

public class PersonUse {
	public static void main(String[] args) {
		Person p1 = new Person();//객체생성과 동시에 기본생성자 호출
		p1.showInpo();
		
		Person p2 = new Person("김상범");
		p2.showInpo();
		
		Person p3 = new Person("박찬호", 185);
		p3.showInpo();
		
		Person p4 = new Person("박지성", 175, 72);
		p4.showInpo();
		
	}
}
