package ch10;

//final 변수
//1)값을 변경할 수 없음
//2)초기값이 반드시 필요함.
//3)대문자로 작성, 2단어 이상일 경우 _로 연결
public class FinalVar {
	final static int MAX_NUM = 500;
	
	public static void main(String[] args) {
		int max = 100;
		System.out.println(max);
		
		System.out.println(MAX_NUM);
		
	}
}
