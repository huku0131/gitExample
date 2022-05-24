package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1="java";
		str1 +=" programming"; // str1=str1+"Programming", 문자열 연결
		
		System.out.println(str1);
		System.out.println(str1.length());
		String str2=str1.concat(" Programing");//concat()으로 문자열을 연결
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2)); //charAt(n)번째 문자 리턴
		System.out.println(str2.indexOf("program")); //"program"의 시작문자열의 인덱스값을 리턴
		System.out.println(str2.indexOf("z"));//내용이 없으면 -1을 리턴한다.
		
		System.out.println(str2.substring(0,4));
		System.out.println(str2.substring(5));
		
		System.out.println(str2.replace("java", "jsp"));
		
		String str3 = "123565898";
		System.out.println(str3.substring(5,9));
		System.out.println(str3.replace(str3.substring(5,9),"****"));
	}
}
