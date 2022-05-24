package ch04;

public class BreakEx4 {
	public static void main(String[] args) {
		int n=1;
		while(true) {
			System.out.println(n+"Hello world");
			
			if(n==8) {
				break;
			}
			n++;
		}
		System.out.println("break로 빠져나옴");
		
	}
}
