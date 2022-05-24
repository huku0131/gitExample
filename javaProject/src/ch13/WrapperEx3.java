package ch13;

public class WrapperEx3 {
	public static void main(String[] args) {
		String str = new String("Hello 1234");
		char[] chr = new char[str.length()];
		
		for(int i=0; i<str.length();i++) {
			chr[i] = str.charAt(i);
		}
		
		for(int i=0; i<chr.length; i++) {
			if(Character.isUpperCase(chr[i])) {
				System.out.println(chr[i]+"는 대문자입니다.");
			} else if(Character.isLowerCase(chr[i])) {
				System.out.println(chr[i]+"는 소문자입니다.");
			} else if(Character.isDigit(chr[i])) {
				System.out.println(chr[i]+"는 숫자입니다.");
			}
		}
		
		String print = str.substring(6);
		System.out.println("문자 " + print + "입니다.");
		System.out.println("숫자 " + Integer.parseInt(print) + "입니다.");
		System.out.println("숫자 "+ Integer.parseInt(print) +" + 2 = " + (Integer.parseInt(print)+2) + "입니다.");

	}
}