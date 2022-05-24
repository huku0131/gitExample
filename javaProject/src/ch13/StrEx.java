package ch13;

public class StrEx {
	public static void main(String[] args) {
		String str="Java Programming";
		System.out.println(str);
		//대문자로 변환
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str);
		
		str=str.toLowerCase();
		System.out.println(str);
	}
}
