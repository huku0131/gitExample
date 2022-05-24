package ch04;

import java.util.Scanner;

public class Cost {

	public static void main(String[] args) {
		String name=""; // 이름
		int price=0; //구매이름
		int point=0;
		int point_use=0;
		int fee=0;
		int pay;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("구매금액 : ");
		price = scan.nextInt();
		System.out.println("보유 포인트 : ");
		point = scan.nextInt();
		
		if(price<20000) {
			fee=2000;
		}
		if(point>=10000) {
			point_use=point;
			pay = price + fee - point;
		}else {
			pay = price + fee;
		}
		scan.close();
		
		System.out.println("이름\t구앰금액\t배송료\t포인트사용\t결제금액");
		System.out.println(name+"\t"+price+"\t"+fee+"\t"+point_use+"\t"+pay);
		

	}

}
