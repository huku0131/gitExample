package ch19;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Scanner;

public class MyNetProgram {
	String name;
	Scanner sc = new Scanner(System.in);
	public void lan() {
		System.out.println("1) 나의 랜카드 정보 : ");
		try {
			Enumeration<NetworkInterface> enu = NetworkInterface.getNetworkInterfaces();
			while(enu.hasMoreElements()) {
				NetworkInterface net = enu.nextElement();
				System.out.println(net);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	public void ser() {
		System.out.println("2) " + name + "의 서버들");
		try {
			InetAddress[] address = InetAddress.getAllByName(name);
			for(int i=0; i<address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	public void sename() {
		System.out.println("3) "+name+"의 호스트이름");
		try {
			InetAddress address = InetAddress.getByName(name);
			System.out.println(address);
			System.out.println(address.getHostName());
			System.out.println(address.getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	public void socket() {
		System.out.println("4)나의 사용 port번호들 : ");
		ServerSocket socket = null;
		for(int i=0; i<65535; i++) {
			try {
				socket = new ServerSocket(i);
				socket.close();
			} catch (Exception e) {
				System.out.println(i+"번 포트는 사용중입니다.");
			}
		}
	}
	

	public static void main(String[] args) {
		MyNetProgram my = new MyNetProgram();
		System.out.println("알고 싶은 홈페이지를 입력하세요");
		my.name = my.sc.next();
		my.lan();
		my.ser();
		my.sename();
		my.socket();
		

	}
}
