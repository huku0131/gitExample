package ch13;

public class StrBuilder {
	public static void main(String[] args) {
		StringBuilder str1=new StringBuilder();
		str1.append("java");
		System.out.println(str1.toString());
		str1.append(" programming");
		System.out.println(str1);
		
		str1.replace(0, 4, "jsp");
		System.out.println(str1);
		String str2=str1.substring(3);
		System.out.println(str1);
		System.out.println(str2);
		
		//StringBuilder를 String으로 바꿀 때는 toString()을 사용
		String str3 = str1.toString();
		System.out.println("StringBuilder(str1)->String(str3)에 저장 : "+str3);
		
		str1 = new StringBuilder(str3);
		System.out.println("StringBuilder(str3)->String(str1)에 저장 : "+str1);
	}
}
