package ch07;

public class TelevisionText2 {
	public static void main(String[] args) {
		Television myTv = new Television();
		System.out.println(myTv);//메모리 주소값 출력(해쉬코드)\
		myTv.channel = 9;
		myTv.volume = 20;
		myTv.onOff=true;
		System.out.println("나의 TV 채널은"+myTv.channel+"이고 볼륨은 "+myTv.volume);
		
		Television yourTv = new Television();
		System.out.println(yourTv);
		yourTv.channel=11;
		yourTv.volume=15;
		yourTv.onOff=false;
		System.out.println("너의 TV 채널은"+yourTv.channel+"이고 볼륨은 "+yourTv.volume);
	}
}
