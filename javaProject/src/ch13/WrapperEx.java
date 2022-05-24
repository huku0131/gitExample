package ch13;
//Wrapper class : 기본자료형을 포장하는 클래스
//기본 자료형에 대한 다양한 method를 지원
public class WrapperEx {
	public static void main(String[] args) {
		Integer i1 = 10;
		Integer i2 = new Integer(20);//auto boxing
		int num1=i1.intValue();
		int num2=i2;
		int sum=num1+num2;
		System.out.println(sum);
		//2진수
		System.out.println(Integer.toBinaryString(sum));
		//8진수
		System.out.println(Integer.toOctalString(sum));
		//16진수
		System.out.println(Integer.toHexString(sum));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.parseInt("100"));
		//정수를 문자열
		System.out.println(Integer.toString(100));
		System.out.println(100+"");
	}
}
