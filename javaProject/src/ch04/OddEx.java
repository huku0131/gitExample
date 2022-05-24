package ch04;

public class OddEx {
	public static void main(String[] args) {
		int odd=0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				odd+=i;
			}
		}
		System.out.println("1~10까지의 홀수의 합은? "+ odd);
	}
}
