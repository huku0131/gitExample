package ch07;

public class Radio {
boolean onoff;
double cheneel;
int volum;
String name;
void print() {
	System.out.println("[ "+name+" 라디오 ]");
	if(onoff==true) {
		System.out.println("라디오가 켜져있습니다.");
	}else {
		System.out.println("라디오가 꺼져있습니다.");
	}
	System.out.println("현재 채널은 " + cheneel + " 입니다.");
	System.out.println("볼륨은 "+ volum +" 입니다.");
}
}
