package ch04;


import java.util.Scanner;

public class TotalScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor;
		int eng;
		int mat;
		int tot;
		double avg;
		String grade="";
		String a ="";
		for (int i=1; i<=3; i++) {
		System.out.println("국어: ");
		kor=sc.nextInt();
		System.out.println("수학: ");
		mat=sc.nextInt();
		System.out.println("영어: ");
		eng=sc.nextInt();
		tot=kor+eng+mat;
		avg=tot/3;
		switch ((int)avg/10) {
		case 10:
		case 9:
			grade="수";
			break;
		case 8:
			grade="우";
			break;
		case 7:
			grade="미";
			break;
		case 6:
			grade="양";
			break;
		default:
			grade="가";
			break;
		}
		a += kor+"\t"+mat+"\t"+eng+"\t"+tot+"\t"+avg+"\t"+grade+"\n";
		}
		
		
sc.close();
		
		System.out.println("================================================");
		System.out.println("국어\t수학\t영어\t총합\t평균\t등급");
		System.out.println("------------------------------------------------");
		System.out.print(a);
		System.out.println("================================================");
		
	}
}
