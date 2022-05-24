package ch06;

import java.util.Scanner;

public class GuguEx {
public static void gugu(int i) {
	System.out.println("===== "+ i+"단 =====");
	for(int a = 1; a<=9; a++) {
		System.out.println(i + " x " + a + " = " + (i*a));
	}
}
static void guguall() {
	System.out.println("== 9x9단을 외우자! ==");
	for(int b=1; b<=9; b++) {
		System.out.println("==== "+ b +"단 ====");
		for(int c=1; c<=9; c++) {
			System.out.println(b+" x "+c+" = "+(b*c));
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("계산하고 싶은 구구단을 입력하시오\n(만약 구구단 전체를 보고 싶다면 숫자 \"0\"을 입력하시오)");
	while(true) {
		int num = sc.nextInt();
		if(num!=0) gugu(num);
		else if(num == 0) guguall();
	}
	
}
}
