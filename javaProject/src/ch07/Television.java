package ch07;

public class Television {
	int channel;//채널번호
	int volume;//음 크기
	boolean onOff;//전원상태
	void print() {
		System.out.println("채널은 "+channel+"이고 볼륨은 " +volume + "입니다.");
	}
	int getChannel() {
		return channel;
	}
	int getVolum() {
		return volume;
	}
	boolean getonOff() {
		return onOff;
	}
	void setChannel(int ch) {
		channel = ch; // 멤버변수 = 로컬변수
	}
}
