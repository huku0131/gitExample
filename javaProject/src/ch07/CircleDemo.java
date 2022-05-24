package ch07;

public class CircleDemo {
	public static void main(String[] args) {
		Circle my =new Circle();
		my.radius=10.0;
		my.show(my.radius, my.findArea());
	}
}
class Circle{
	double radius;
	
	double findArea() {
		return 3.14*radius*radius;
	}
	void show(double x, double y ) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n",x, y);
	}
}
