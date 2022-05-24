package ch17;

import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;

// 설명 : 랜덤으로 나타나는 이미지를 클릭하면 소리가 나는 앱이지만.. 소리가 나지 않는다.

public class GuiApp2 extends JApplet implements  ActionListener{
	//오디오
	private AudioClip audio;
	private JButton play, stop, loop;
	
	//이미지
	private int width, height;
	private Image img;
	//랜덤
	
	@Override
	public void init() {
		setSize(350,50);
		setLayout(new FlowLayout());

		//파일 불러오기
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		audio = getAudioClip(getClass().getResource("dingdong.wav"));
		//버튼을 애플릿에 추가
		play = new JButton("play");
		stop = new JButton("stop");
		loop = new JButton("loop");
		
		add(play);
		add(stop);
		add(loop);
		
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		width = img.getWidth(null);
		height=img.getHeight(null);	
		g.drawImage(img, 10,0,this);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if(btn == play) {
			audio.play();
		}else if(btn == stop) {
			audio.stop();
		}else if(btn == loop) {
			audio.loop();
		}
	}
	
	
}
