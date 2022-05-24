package ch06;


public class StudentPoint {
	static int[] number = {1001,1002,1003};
	static String[] student = {"홍길동","이몽룡","이순신"};
	static int[] kor = {80,90,100};
	static int[] eng = {90,70,80};
	static int[] mat = {83,66,87};
	static int[] tot = new int[3];
	static double[] avg = new double[3];
	
	static void input() {
		for(int i=0;i<student.length;i++) {
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=tot[i]/3;
		}
	}
	static void output() {
		System.out.println("전체 학생 수 : " + student.length);
		System.out.println("-----------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		for(int i=0; i<student.length; i++) {
			System.out.println(number[i]+"\t"+student[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+String.format("%.1f",avg[i]));	
		}
		System.out.println("-----------------------------------------------------");
	}
	public static void main(String[] args) {
		input();
		output();
	}
	 
}
