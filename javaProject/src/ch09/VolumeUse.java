package ch09;

public class VolumeUse {
	public static void main(String[] args) {
		Volume vol = new Volume();//기본생성자호출
		System.out.println("부피 : "+ vol.getVolume());
		
		Volume vo2 = new Volume(10,20,30);//매개변수가 있는 생성자 호출
		System.out.println("부피 : " + vo2.getVolume());
	}
}
