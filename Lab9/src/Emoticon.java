import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

public class Emoticon extends JComponent {

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(1800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Emoticon");
		Emoticon e1 = new Emoticon();
		frame.add(e1);
		
	}
	
	//Creates shapes
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		//Creates yellow circles
		g2.setColor(Color.YELLOW);
		g2.fillOval(150, 100, 300, 300);
		g2.fillOval(500, 100, 300, 300);
		g2.fillOval(850, 100, 300, 300);
		g2.fillOval(1200, 100, 300, 300);
		
		//Creates blue circles and line
		g2.setColor(Color.BLUE);
		g2.fillOval(200, 150, 50, 50);
		g2.fillOval(350, 150, 50, 50);
		g2.fillOval(550, 150, 50, 50);
		g2.fillOval(700, 150, 50, 50);
		g2.fillOval(900, 150, 50, 50);
		g2.fillOval(1050, 150, 50, 50);
		g2.fillOval(1250, 150, 50, 50);
		g2.drawLine(1400, 175, 1450, 175);
		
		//Creates red mouths
		g2.setColor(Color.RED);
		g2.drawArc(225, 225, 150, 100, 180, 180);
		g2.drawArc(575, 250, 150, 100, 0, 180);
		g2.drawOval(975, 250, 50, 50);
		g2.drawArc(1275, 225, 150, 100, 180, 180);
	}
}