package ch06;

//재귀호출 : 팩토리얼 계산시 활용,, 실제 잘 사용 안함(메모리증가)
public class RecursiveEx {
public static void main(String[] args) {
	System.out.println(fact1(25));// 5!=5x4x3x2x1
}

 static long fact1(int n) {
	
	return n==1 ? 1: n*fact1(n-1);
}
}
