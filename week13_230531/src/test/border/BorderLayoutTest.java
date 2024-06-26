package test.border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame {
	
	public BorderLayoutTest() {
		setLayout(new BorderLayout(25, 15));
		Color[] colors = {Color.RED,Color.ORANGE,Color.BLUE,new Color(0,33,135), new Color(110,47,199)};
		String[] btnStrs = {"사과", "딸기","포도", "키위","참외"};
		String[] locStrs = {"North", "South","Center", "West","East"};
		JButton[] btnArr = new JButton[btnStrs.length];
		
		for (int i = 0; i < btnArr.length;i++) {
			btnArr[i] = new JButton(btnStrs[i]);
			btnArr[i].setBackground(colors[i]);
			btnArr[i].setForeground(Color.WHITE);
			add(btnArr[i],locStrs[i]);
		}
		
		setTitle("BorderLayout 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutTest();

	}

}
