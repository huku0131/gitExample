package ch09;

public class Manager2 extends Employee2{
	
	private int bonus;
	
	public Manager2(int num, String name, String address, String email, int pay, String rrn, int bonus) {
		super(num, name, address, email, pay, rrn);
		this.bonus=bonus;
	}
	
	public void print() {
		System.out.println("사원번호 :"+ num);
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		System.out.println("이메일 : "+email);
		System.out.println("연봉 : "+pay);
		System.out.println("주민번호 : "+getRrn());
		System.out.println("보너스 : "+bonus);
	}
	

	
}
