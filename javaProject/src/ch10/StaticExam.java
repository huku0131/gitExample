package ch10;
//개별적인 값을 사용할 때 =>non-static을 사용 ex)학생들...
//공통적인 값(정해진)을 사용할 때 => static을 사용 ex)학점 4.0이상, 3.5이상..

public class StaticExam {
public static void main(String[] args) {
	int a=40, b=30, result;
	result =Math.max(a, b);
	System.out.println(result);
	System.out.println(Math.sqrt(100));
	double r=15.3;
	System.out.println("원의 둘레 : "+2*Math.PI*r);
	System.out.println("원의 넓이 : "+Math.PI*r*r);
}
}
