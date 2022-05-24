package ch09;

public class Employee2 {
	
	public int num;
	public String name;
	protected String address;
	protected String email;
	int pay;
	private String rrn;
	
	public String getRrn() {
		return rrn;
	}
	public void Employee2() {
		
	}
	
	public Employee2(int num, String name, String address, String email, int pay, String rrn) {
		this.num = num;
		this.name = name;
		this.address = address;
		this.email = email;
		this.pay = pay;
		this.rrn=rrn;
	}
	
	
}
