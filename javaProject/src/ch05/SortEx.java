package ch05;

import java.util.Arrays;
import java.util.Collections;

public class SortEx {
public static void main(String[] args) {
	int num[] = {29,1,81,70,13,92,36};
	Arrays.sort(num);
	for(int i: num) {
		System.out.print(i + " ");
	}
	//내립차순
	System.out.println();
	//내림차순은 특별히 Integer라는 Wrapper Class 타입으로 데이터 처리가 되어야 하고
	//Collentions.reverseOrder()라는 메소드를 써서 처리해야 한다.
	Integer rev[] = {29,1,81,70,13,92,36};
	Arrays.sort(rev, Collections.reverseOrder());
	for(int i : rev) {
		System.out.println(i+" ");
	}
}
}

