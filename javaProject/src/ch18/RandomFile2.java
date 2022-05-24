package ch18;

import java.io.RandomAccessFile;

public class RandomFile2 {
	public static void main(String[] args) {
		String str = null;
				try {
					RandomAccessFile file = new RandomAccessFile("c:\\test\\rand2.txt","rw");
					file.seek(12);
					System.out.println(file.getFilePointer());
					System.out.println(file.length());
					file.write("park".getBytes());
					System.out.println("파일이 저장되었습니다.");
					file.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
	}
}
