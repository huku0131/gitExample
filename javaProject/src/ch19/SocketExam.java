package ch19;

import java.net.ServerSocket;

public class SocketExam {
	public static void main(String[] args) {
		//서버소켓 : 서버에서 서비스를 위한 목적으로 만드는 소켓
		ServerSocket socket=null;//Server용 소켓
		//Socket cSocket =null;//Clinet용 소켓
		//포트(port)번호  ;0~65535 내에 배정이 가능하고 중복되지 않아야 함.
		//1port당 1service원칙
		
		for (int i=0; i<=65535;i++) {
			try {
				socket = new ServerSocket(i);//서버 소켓 생성
				socket.close();//소켓 서비스 종료
			} catch (Exception e) {//이미 사용중인 포트가 있으면 Exception이 난다.
				System.out.println(i+"번 포트는 사용중입니다.");
			}
		}
		
	}
}
