package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlConnectionExam {
	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("http://google.com");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			if(conn != null) {//접속되었으면
				conn.setConnectTimeout(3000);//타임아웃 시간 설정
				StringBuilder sb = new StringBuilder();
				//정상적으로 처리 된 경우
				//HTTP STATUS CODE(상태코드)
				
				if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
					//스트림을 사용해서 html source code를 읽어 온다
					BufferedReader br= new BufferedReader(
							new InputStreamReader(conn.getInputStream(), "utf-8"));
					while(true) {
						String line =br.readLine();//한 라인을 읽음
						if(line == null)break;//더 이상 내용이 없으면 탈출
						sb.append(line+"\r\n");//줄바꿈 문자 추가
					}
					br.close();//버퍼닫기
				}
				conn.disconnect();//http연결종료
				System.out.println(sb);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
