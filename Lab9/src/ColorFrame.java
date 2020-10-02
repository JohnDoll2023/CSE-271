import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ColorFrame extends JFrame implements ActionListener {

	JPanel panel;
	
	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorFrame cf = new ColorFrame();
	}

	//Creates ColorFrame object
	public ColorFrame() {
		
		//Creates and sets JFrame
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Color Frame");
		frame.setVisible(true);
		frame.setSize(200, 200);
		panel = new JPanel();
		
		//Creates JMenu
		JMenuBar menu = new JMenuBar();
		JMenu colors = new JMenu("Colors");
		JMenuItem red = new JMenuItem("red");
		red.addActionListener(this);
		JMenuItem green = new JMenuItem("green");
		green.addActionListener(this);
		JMenuItem blue = new JMenuItem("blue");
		blue.addActionListener(this);
		colors.add(red);
		colors.add(green);
		colors.add(blue);
		menu.add(colors);
		
		//Adds panel and menu
		frame.add(panel);
		frame.setJMenuBar(menu);
	}

	//Manages actions of menu
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("red")) {
			panel.setBackground(Color.RED);
		}
		if(e.getActionCommand().equals("blue")) {
			panel.setBackground(Color.BLUE);
		}
		if(e.getActionCommand().equals("green")) {
			panel.setBackground(Color.GREEN);
		}
	}
}