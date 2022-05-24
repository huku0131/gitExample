package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class color implements ActionListener{
	JFrame f;
	Color c;
	Container con;	
	public color(JFrame f, Color c) {
		this.f=f;
		this.c=c;
		con=f.getContentPane();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);
	}
}
