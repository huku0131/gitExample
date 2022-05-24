package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamEx2 {
	public static void main(String[] args) {
		InputStream is = System.in;//1byte(8비트)처리 스트림
		InputStreamReader isr = new InputStreamReader(is);//2byte(16비트)처리 스트림 - 한글가능
		System.out.println("한글자를 입력하세요 : ");
		try {
			int code = isr.read();
			System.out.println("code : " + code);
			char ch = (char)code;//코드값에 대응되는 문자
			System.out.println("char : "+ ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
