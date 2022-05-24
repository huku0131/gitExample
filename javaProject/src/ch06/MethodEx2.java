package ch06;

//메소드를 사용하면 얻을 수 있는 장점
//중복 코드를 줄이고 재사용할 수 있다.
//모듈화해 가독성을 높이기 때문에 프로그램의 품질이 상향된다.
public class MethodEx2 {//메소드를 사용
	//메소드의 위치는 main아래나 위나 상관없음
public static void main(String[] args) {
	System.out.println("합(1~10) : " + sum(1,10));
	System.out.println("합(10~100) : " + sum(10,100));
	System.out.println("합(100~1000) : " + sum(100,1000));
}

private static int sum(int a, int b) {//메소드를 저장
	int sum = 0;
	for(int i=a; i<=b; i++) {
		sum += i;
	}
	return sum;
}
}
