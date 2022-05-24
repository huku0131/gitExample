package ch14;

public class EC {
	private int num;
	private String day;
	private String product;
	private String cardname;
	private String cardnum;
	private int pay;
	//getter,setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public EC(int num, String day, String product, String cardname, String cardnum, int pay) {
		this.num = num;
		this.day = day;
		this.product = product;
		this.cardname = cardname;
		this.cardnum = cardnum;
		this.pay = pay;
	}
	
}
