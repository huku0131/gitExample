package ch05;

//3차원 배열 : 배열명 new 자료형[면][행][열]
public class Array3Dim {
public static void main(String[] args) {//2면 3행 4열
	String[][][] subject= {
			{
				{"JS01","AL02","PY03","DS04"},
				{"JSP","알고리즘","파이썬","자료구조"},
				{"이길동","김길동","박길동","홍길동"}},
			{
				{"SC01","SC02","SC03","SC04"},
				{"생활영어","경제학","생활체육","스포츠"},
				{"구길동","성길동","최길동","황길동"}
				}
			};
	for(int i=0; i<subject.length; i++) {//면
		for(int j=0; j<subject[i].length; j++) {//행
			for(int k=0; k<subject[i][j].length; k++) {//열
				System.out.println("["+i+"]["+j+"]["+k+"] : "+subject[i][j][k]);
			}
		}
		System.out.println("==========================================");
	}
}
}
