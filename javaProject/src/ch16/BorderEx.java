package ch16;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderEx extends Frame{
	//GUI 프로그램 코딩에서는 main메소드에서 GUI 코딩보다 Frame을 extends받아서 기본생성자 안에서 GUI코드처리 하는 것을 더 권장한다.
	public BorderEx() {
		setTitle("BorderLayout 예제");
		setSize(300, 200);
		setVisible(true);
		
		Button b1 = new Button("east");
		Button b2 = new Button("west");
		Button b3 = new Button("south");
		Button b4 = new Button("north");
		Button b5 = new Button("center");
		
//		frame의 기본레이아웃은 BorderLayout이기 때문에 setLayout을 생략해도 된다.
//		setLayout(new BorderLayout());
		add(b1, "East");
		add(b2, "West");
		add(b3, "South");
		add(b4, "North");
		add(b5, "Center"); //또는 add(b5)
		
		//윈도우창 닫기
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});
	}//end BorderEx()
	public static void main(String[] args) {
		new BorderEx();
		
	}
}
