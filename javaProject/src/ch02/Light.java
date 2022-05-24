package ch02;

public class Light {
	public static void main(String[] args) {
		long lightspeed;
		long distance;
		
		lightspeed = 30000;//L은 생략가능
		distance = lightspeed * 365 * 24 * 60 * 60;
		System.out.println("빛이 1년 동안 가는 거리 : " + distance + "km"); 
	}

}
