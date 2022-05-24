package ch17;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MyGridLayout extends JFrame{
	public MyGridLayout() {
		super("명찰");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(20));
		c.add(new JLabel("id"));
		c.add(new JTextField(20));
		c.add(new JLabel("비밀번호"));
		c.add(new JPasswordField(20));
		c.add(new JLabel("이메일"));
		c.add(new JTextField(20));
		c.add(new JLabel("HP"));
		c.add(new JTextField(20));
		setSize(290,200);
		setVisible(true);		
	}
	public static void main(String[] args) {
		new MyGridLayout();
	}
}
