package ch13;

import java.util.Random;
import java.util.Scanner;

public class Mygame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[]game = {"가위","바위","보"};
		Random c =new Random();
		boolean tf = true;

		while(tf) {
			String com = game[c.nextInt(3)];
			System.out.println("가위,바위,보 중 하나를 입력하세요 (exit를 입력하면 게임이 종료됩니다.)");
			String you=sc.next();
			if(you!="exit") {
				switch (you) {
				case "가위":
					if(com.equals("가위"))System.out.println("비겼습니다. 컴퓨터는 가위였습니다.");
					else if(com.equals("바위"))System.out.println("당신이 졌습니다.컴퓨터는 바위입니다.");
					else if(com.equals("보"))System.out.println("당신이 이겼습니다. 컴퓨터는 보입니다.");
					break;
				case "바위":
					if(com.equals("가위"))System.out.println("당신이 이겼습니다. 컴퓨터는 가위였습니다.");
					else if(com.equals("바위"))System.out.println("비겼습니다. 컴퓨터는 바위입니다.");
					else if(com.equals("보"))System.out.println("당신이 이습니다. 컴퓨터는 보입니다.");
					break;
				case "보":
					if(com.equals("가위"))System.out.println("당신이 졌습니다. 컴퓨터는 가위였습니다.");
					else if(com.equals("바위"))System.out.println("당신이 이겼습니다.컴퓨터는 바위입니다.");
					else if(com.equals("보"))System.out.println("비겼습니다. 컴퓨터는 보입니다.");
					break;
				}
				System.out.println();

			}else if(you == "exit") {
				System.out.println("게임을 종료합니다.");
				tf=false;
			}
		}
		sc.close();
	}
}
