package ch05;

public class ArrayScore2D {
public static void main(String[] args) {
	
	int score[][]= {{1,100,100,100},{2,50,70,89},{3,87,54,23}};
	
	System.out.println("번호\t국어\t수학\t총점\t평균\t등급");
	int tot = 0;
	double avg ;
	for(int i=0; i<score.length; i++) {
		for(int j=0; j<score.length;j++) {
			System.out.print(score[i][j]+"\t");
		}
		tot=score[i][1]+score[i][2]+score[i][3];
		avg = tot/3;
		System.out.print(tot+"\t");
		System.out.printf("%.1f\t",avg);
		if(avg>=90) System.out.println("A");
		else if(avg>=80) System.out.println("B");
		else if(avg>=70) System.out.println("C");
		else if(avg>=60) System.out.println("D");
		else System.out.println("F");
	}
}
}
