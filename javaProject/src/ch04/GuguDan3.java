package ch04;

public class GuguDan3 {
	public static void main(String[] args) {
		for(int dan=1; dan<=9;dan++) {
			for(int i=1; i<=9; i++) {
				System.out.print("["+dan + " x " + i +" = " + dan*i +"]");
			}
			System.out.println();
		}
	}
}
