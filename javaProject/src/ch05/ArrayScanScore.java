package ch05;

import java.util.Scanner;

public class ArrayScanScore {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int score[]=new int[3];
	int sum=0;
		System.out.println("성적 처리 할 학생 수를 입력하세요");
		int p=sc.nextInt();
		
		for(int j=0; j<p; j++) {
			System.out.println("성적을 입력하시오.");	
			score[j] = sc.nextInt();
			sum+=score[j];
		}
		double avg=sum/p;
		System.out.println("총점은 "+sum+"입니다.");
		System.out.println("평균 성적은 "+String.format("%.1f",avg)+"입니다.");
	sc.close();

}
}
