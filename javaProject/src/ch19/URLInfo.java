package ch19;

import java.net.URL;

public class URLInfo {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://comic.naver.com/webtoon/detail?titleId=790245&no=15");
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("포트 : " + url.getPort());
			System.out.println("호스트 : " + url.getFile());
			System.out.println("기타 : "+url.toExternalForm());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
