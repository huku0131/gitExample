package ch04;

import java.util.Scanner;

public class My_First_Project {
	public static void main(String[] args) {
		int menu = 0;
		int sec = 0;
		Scanner sc = new Scanner(System.in);
		outer:
		while(true) {
			System.out.println("-- [ 메  뉴 ] --");
			System.out.println("(1) 한식");
			System.out.println("(2) 양식");
			System.out.println("(3) 중식");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)");
			String tmp = sc.next();
			menu = Integer.parseInt(tmp);
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(menu<1||menu>3) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료:0)");
				continue;
			}
			
			switch(menu) {
				case 1:
					System.out.println("[한식메뉴]");
					System.out.println("(1) 김치찌개");
					System.out.println("(2) 된장찌개");
					System.out.println("(3) 삼겹살");
					System.out.println("한식메뉴를 선택하세요.(한식메뉴선택종료:0, 전체종료:99)>");
					String tnp = sc.next();
					sec = Integer.parseInt(tnp);
					if(sec==1) {
						System.out.println(">>고객님은 김치찌개를 선택하셨습니다");
					}else if(sec==2) {
						System.out.println(">>고객님은 된장찌개를 선택하셨습니다");
					}else if(sec==3) {
						System.out.println(">>고객님은 삽겹살을 선택하셨습니다");
					}
					break;
				case 2:
					System.out.println("[양식메뉴]");
					System.out.println("(1) 돈까스");
					System.out.println("(2) 비프스테이크");
					System.out.println("(3) 카레라이스");
					System.out.println("한식메뉴를 선택하세요.(양식메뉴선택종료:0, 전체종료:99)>");
					tnp = sc.next();
					sec = Integer.parseInt(tnp);
					if(sec==1) {
						System.out.println(">>고객님은 김치찌개를 선택하셨습니다");
					}else if(sec==2) {
						System.out.println(">>고객님은 비프스테이크를 선택하셨습니다");
					}else if(sec==3) {
						System.out.println(">>고객님은 카레라이스를 선택하셨습니다");
					}

					break;
				case 3:
					System.out.println("[중식메뉴]");
					System.out.println("(1) 짜장면");
					System.out.println("(2) 짬뽕");
					System.out.println("(3) 탕수육");
					System.out.println("한식메뉴를 선택하세요.(중식메뉴선택종료:0, 전체종료:99)>");
					tnp = sc.next();
					sec = Integer.parseInt(tnp);
					if(sec==1) {
						System.out.println(">>고객님은 짜장면을 선택하셨습니다");
					}else if(sec==2) {
						System.out.println(">>고객님은 짬뽕을 선택하셨습니다");
					}else if(sec==3) {
						System.out.println(">>고객님은 탕수육을 선택하셨습니다");
					}
					break;
			
		}
			if(sec == 0) {
				System.out.println("메뉴선택으로 돌아갑니다.");
				continue;
			}else if(sec == 99) {
				System.out.println("프로그램을 모두 종료합니다.");
				break outer;
			}else if(sec<1||sec>3) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료:0)");
				continue;
			}

	}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
}
}