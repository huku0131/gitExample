package ch05;

import java.util.Scanner;

public class ArrayPoint2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] mat = new int[2];
		int[] eng = new int[2];
		int[] tot = new int[2];
		double[] avg = new double[2];
		double ar = 0;
		
		for(int i=0; i<2; i++) {
			System.out.print("이름을 입력하세요");
			name[i] = sc.next();
			System.out.print("국어점수를 입력하세요");
			kor[i]=sc.nextInt();
			System.out.print("수학점수를 입력하세요");
			mat[i]=sc.nextInt();
			System.out.print("영어점수를 입력하세요");
			eng[i]=sc.nextInt();
			tot[i] = kor[i]+eng[i]+mat[i];
			avg[i] = tot[i]/3;
			ar = avg[i]+ar;
		}
		

		for(int i=0; i<2; i++) {
			System.out.println("이름 : " + name[i]);
			System.out.println("국어 : " + kor[i]);
			System.out.println("수학 : " + mat[i]);
			System.out.println("영어 : " + eng[i]);
			System.out.println("총점 : " + tot[i]);
			System.out.println("평균 : " + avg[i]);
			System.out.println();
		}
		System.out.println("================================");
		System.out.println("학급평균 : " + ar/name.length);
		sc.close();
			}
}
