package ch04;

public class EvenEx {

	public static void main(String[] args) {
		int even=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				even+=i;
			}
		}
		System.out.println("1~10사이의 짝수의 합은? " + even);
	}

}
