package ch14;

import java.util.Scanner;

public class Product2 {
	private	int num;
	private String name;
	private String company;
	private int day;
	private int pay;
	private int amount;
	private int money;
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("제품번호 : ");
		num=sc.nextInt();
		System.out.println("제품명 : ");
		name=sc.next();
		System.out.println("제조사 : ");
		company=sc.next();
		System.out.println("제조일자 : ");
		day=sc.nextInt();
		System.out.println("단가 : ");
		pay=sc.nextInt();
		System.out.println("수량 : ");
		amount=sc.nextInt();
		
		money = amount*pay;
	}
	
	//getter,setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
