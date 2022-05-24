package ch16;

public class BankUse {
	public static void main(String[] args) {
		MyBank bank = new MyBank();
		BankPlayer a = new BankPlayer(1,bank);
		BankPlayer b = new BankPlayer(2,bank);
		BankPlayer c = new BankPlayer(3,bank);
		
		a.start();
		b.start();
		c.start();
		
	}
}
