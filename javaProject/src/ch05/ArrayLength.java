package ch05;

import java.util.Scanner;

public class ArrayLength {
public static void main(String[] args) {
	int intArray[]=new int[5];
	int sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println(intArray.length + "개의 정수를 입력하세요.");
	for(int i=0; i<intArray.length; i++) {
		intArray[i]=sc.nextInt();
	}
	for(int i=0; i<intArray.length; i++) {
		sum+= intArray[i];//배열에 저장된 정수 값을 누적
	}
	System.out.print("평균은 " + (double)sum/intArray.length);
	sc.close();
	
}
}