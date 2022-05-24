package ch19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DonloadImage {
	public static void main(String[] args) throws MalformedURLException {
		String website = "https://media.istockphoto.com/photos/sky-cloud-pink-love-sweet-love-color-tone-for-wedding-card-background-picture-id1180184210?b=1&k=20&m=1180184210&s=170667a&w=0&h=VbjitLKrB72EUtTfxE2ZoSi9IUINHijByKRYZsPw_hc=";
		
		System.out.println("다운로드를 시작합니다.");
		URL url = new URL(website);//url 생성
		byte[] buffer = new byte[2048];//버퍼용 바이트 배열 [2mb]
		//파일로 저장 <== 프로그램 <== 서버의 이미지 파일
		
		//try ~ with문 (Java1.7부터 도입
		//try(리소스 선언부){}catch(Exception e){}
		//finally가 없어도 리소스를 자동으로 종료 시킨다.
		try(InputStream in =url.openStream(); OutputStream out=new FileOutputStream("c:\\test\\test.jpg")) {
			int length=0;//읽은 바이트 수 리턴
			//읽은 바이트수 = 스트림.read(버퍼)
			//더이사 읽을 내용이 없으면 -1
			while((length=in.read(buffer))!=-1) {
				System.out.println((length + "바이트 읽음."));
				out.write(buffer,0,length);;
			}
			System.out.println("다운로드가 완료되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
