import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.*;

public class Layout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new BorderLayout());
		JButton button1 = new JButton("North");
		JButton button2 = new JButton("South");
		JButton button3 = new JButton("East");
		JButton button4 = new JButton("West");
		JButton button5 = new JButton("Center");
		JButton button6 = new JButton("Center2");
		panel.add(button1, BorderLayout.NORTH);
		panel.add(button2, BorderLayout.SOUTH);
		panel.add(button3, BorderLayout.EAST);
		panel.add(button4, BorderLayout.WEST);
		panel.add(button5, BorderLayout.CENTER);
		panel.add(button6, BorderLayout.CENTER);
		
		frame.add(panel);
		frame.setVisible(true);
	}

}
