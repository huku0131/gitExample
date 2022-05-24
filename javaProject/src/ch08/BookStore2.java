package ch08;

public class BookStore2 {
	private String book;
	private String name;
	private String press;
	private int year;
	private int pay;
	private int count;
	private int money;
	
	public void sell(String book, String name, String press, int year, int pay, int count) {
		this.book = book;
		this.name = name;
		this.press = press;
		this.year = year;
		this.pay = pay;
		this.count = count;
		money = pay * count;
		
	}
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println("book"+"\t"+name+"\t"+press+"\t"+year+"\t"+pay+"\t"+count+"\t"+money);
	}
	
}
