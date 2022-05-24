package ch07;

public class TelevisionTest4 {
	public static void main(String[] args) {
		Television my = new Television();
		my.channel=24;
		my.volume=30;
		my.onOff=true;
		
		int ch = my.getChannel();
		int vo = my.getVolum();
		boolean on = my.onOff;
		
		String buten;
		if(on==true) {
		buten = "Tv On";
		}else {buten="Tv off";}
		
		System.out.println("현재 채널은 " + ch + "이고 볼륨은" + vo + " 이며 TV 상태는" + buten);
	
		
	}
}
