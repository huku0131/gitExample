package ch08;

public class BookStoreUse {
	public static void main(String[] args) {
		BookStore b1=new BookStore();
		b1.setBook("Java");
		b1.setName("김선생");
		b1.setPress("영진");
		b1.setYear(2022);
		b1.setPay(30000);
		b1.setCount(10);
		
		b1.print();
	}
}
