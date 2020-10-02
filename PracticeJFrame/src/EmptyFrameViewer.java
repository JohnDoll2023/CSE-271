import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EmptyFrameViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		
		final int FRAME_WIDTH = 300;
		final int FRAME_HEIGHT = 400;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("An empty frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(new JButton("Click me"));
		frame.setVisible(true);
		
		
		JPanel panel = new JPanel();
		panel.add(new JButton("Click me"));
		panel.add(new JLabel("Hello world"));
		
		
	}

}
