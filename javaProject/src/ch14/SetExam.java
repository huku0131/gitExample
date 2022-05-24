package ch14;

import java.util.HashSet;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		//Set은 중복값을 허용하지 않음
		hs.add("korea");
		hs.add("japan");
		hs.add("america");
		hs.add("britain");
		hs.add("korea");
		System.out.println(hs);
		for(String str : hs) {
			System.out.println(str);
		}
		
	}
}
