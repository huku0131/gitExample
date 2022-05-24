package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyFirstApp extends JFrame{
	
	public MyFirstApp() {
		super("음식 메뉴");
		setSize(500,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		
		panel.setBackground(Color.green);
		
		JLabel label = new JLabel("음식을 선택하세요");
		JLabel label1 = new JLabel("추가 주문을 입력하세요");
		panel1.add(label);
		panel3.add(label1);
		
		
		JButton button1 = new JButton("한식");
		JButton button2 = new JButton("중식");
		JButton button3 = new JButton("양식");
		JButton button4 = new JButton("분식");
		
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		
		
		panel.add(panel1);
		panel.add(panel2);
		
		JTextArea ta = new JTextArea(6,20);
		panel3.add(ta);
		
		add(panel,"North");
		add(panel3,"South");
		setVisible(true);
		
		ActionListener handler = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("한식")) {
					JOptionPane.showMessageDialog(null, "한식을 선택했습니다.","한식",JOptionPane.DEFAULT_OPTION);
				}else if(e.getActionCommand().equals("중식")) {
					JOptionPane.showMessageDialog(null, "중식을 선택했습니다.","중식",JOptionPane.DEFAULT_OPTION);
				}else if(e.getActionCommand().equals("양식")) {
					JOptionPane.showMessageDialog(null, "양식을 선택했습니다.","양식",JOptionPane.DEFAULT_OPTION);
				}else if(e.getActionCommand().equals("분식")) {
					JOptionPane.showMessageDialog(null, "분식을 선택했습니다.","분식",JOptionPane.DEFAULT_OPTION);
				}
				
				
			}
		};
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);
		
	}
	public static void main(String[] args) {
		new MyFirstApp();
	}
}
