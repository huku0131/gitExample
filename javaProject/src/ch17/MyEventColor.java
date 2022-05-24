package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEventColor extends JFrame {
	private JButton b1,b2,b3,b4;

	public MyEventColor() {
		setLayout(new BorderLayout());
		b1=new JButton("red");
		b2=new JButton("green");
		b3=new JButton("blue");
		b4=new JButton("yellow");
		
		add(b1,"North");
		add(b2, "East");
		add(b3, "South");
		add(b4, "West");
		
		b1.addActionListener(new color(this, Color.red));
		b2.addActionListener(new color(this, Color.green));
		b3.addActionListener(new color(this, Color.blue));
		b4.addActionListener(new color(this, Color.yellow));
		
		
		setSize(450,300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyEventColor();
	}
		
	}

