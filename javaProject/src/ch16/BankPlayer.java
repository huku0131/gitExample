package ch16;

public class BankPlayer extends Thread{
	int type;
	MyBank mybank;
	

	public BankPlayer(int type, MyBank mybank) {
		this.type=type;
		this.mybank=mybank;
	}
	
	public void run() {
		switch(type) {
		case 1 : mybank.bankA(); break;
		case 2 : mybank.bankB(); break;
		case 3 : mybank.bankC(); break;
		}

	}
}
