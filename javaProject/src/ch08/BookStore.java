package ch08;

public class BookStore {
	private String book;
	private String name;
	private String press;
	private int year;
	private int pay;
	private int count;
	private int money;
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getMoney() {
		money = count*pay;
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println("book"+"\t"+name+"\t"+press+"\t"+year+"\t"+pay+"\t"+count+"\t"+getMoney());
	}
	
	
}
