package ch04;

import java.util.Scanner;

public class Holiday {
/**휴가일수 계산
 * 근속연수 1~3년=>3일, 4~9년 ==> 5일
 * 10년 이상 10일, 20년 이상 ==> 20일
*/
	public static void main(String[] args) {
		int year;
		int days;
		Scanner scan = new Scanner(System.in);
		System.out.println("근속연수를 입력하세요 : ");
		year = scan.nextInt();
		scan.close();
		
		if(year <= 3) {
			days = 3;
		}else if (year < 10) {
			days=5;
		}else if(year < 20) {
			days = 10;
		}else {
			days=20;
		}
		System.out.println("당신의 근속연수는 " +year+ "년이고");
		System.out.println("휴가일수는 "+days+"일입니다.");

	}

}
