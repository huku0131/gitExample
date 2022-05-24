package ch18;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		//콘솔창에 별도의 스트림값을 출력하기 위해 System클래스의 out이라는 static 멤버에
		//PrintStream 객체 참조값이 들어있는 점을 활용
		PrintStream ps = System.out;
		OutputStream os = ps;//PrintStream객체를 부모타입인 OutputStream으로 받아 처리한다.
		//OutputStream도 1byte 처리 스트림이다. 따라서 한글은 지원 안된다.
		try {
			os.write(97);//a
			os.write(98);//b
			os.write(99);//c
			os.flush();//flush()메소드를 써야 출력까지된다.
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
