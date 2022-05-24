package ch17;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;

import javax.swing.JApplet;

public class FontExam extends JApplet{
	private Font font;
	private FontMetrics fm;//글꼴관련 정보를 제공하는 클래스
	private int x,y;
	private String message;
	private Dimension dim;//특정 영역의 사각형과 폭과 높이값을 관리할 수 있도록 도와주는 클래스
	
	@Override
	public void init() {
		message="그래픽 테스트";
		//Font("폰트",옵션,사이즈);
		font=new Font("굴림",Font.ITALIC,30);
		fm=getFontMetrics(font);//폰트의 가로,세로 사이즈를 가져옴
		setSize(250,250);
		dim=getSize();//화면 크기 계산해서 Dimesion에 저장
		System.out.println(dim.width);
		System.out.println(dim.height);
		
		x=(dim.width/2)-(fm.stringWidth(message)/2);
	}
	
}
