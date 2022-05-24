package ch14;

public class Product {
	private String name;
	private String press;
	private int year;
	private int price;
	private int amount;
	
	
	public Product(String name, String press, int year, int price, int amount, int pay) {
		this.name = name;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
	}


	//getter,setter
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
