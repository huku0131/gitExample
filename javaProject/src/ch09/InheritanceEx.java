package ch09;

public class InheritanceEx {
	public static void main(String[] args) {
		Circle c1=new Circle();
		Ball c2=new Ball("빨강색");//객체 생성과 동시에 매개변수가 있는 생성자 호출
		
		System.out.println("원 : ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("공 : ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();

	}
}
