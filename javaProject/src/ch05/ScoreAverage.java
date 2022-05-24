package ch05;

public class ScoreAverage {
public static void main(String[] args) {
	double score[][] = {{3.3,3.6},{3.5,3.2},{3.7,4.0},{4.1,4.2}};
	double sum = 0.0;
	for(int year=0; year<score.length; year++) {
		for(int term=0; term<score[year].length; term++){
			sum += score[year][term];
		}
	}
	int n=score.length;//배열의 행 갯수 4
	int m=score[0].length;//배열의 열 갯수2
	System.out.println("4년 전체 평점 평균은 "+sum/(n*m));
}
}
