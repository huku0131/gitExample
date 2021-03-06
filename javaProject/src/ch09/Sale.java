package ch09;

public class Sale extends Product{//상속관계 맺음
	private int price;//가격
	private int amount;//수량
	private int money;//금액
	
	public void input(int code, String name, String company, String date, int price, int amount) {
		setCode(code);
		setName(name);
		setCompany(company);
		setDate(date);
		this.price=price;
		this.amount=amount;
	}
	
	public void calc() {
		money = price * amount;
	}
	public void print() {
		System.out.println("코드\t품명\t제조사\t제조일자\t단가\t수량\t금액(단위:만원)");
		System.out.println(getCode()+"\t"+getName()+"\t"+getCompany()+"\t"+getDate()+"\t"+price+"\t"+amount+"\t"+money);
	}
}
