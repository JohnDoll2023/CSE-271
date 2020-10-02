import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CheckerGame extends JFrame implements ActionListener, MouseListener{
	
	private char [] [] boardStatus = new char [] [] {
		{'e', 'b', 'e', 'b', 'e', 'b', 'e', 'b'},
		{'b', 'e', 'b', 'e', 'b', 'e', 'b', 'e'},
		{'e', 'b', 'e', 'b', 'e', 'b', 'e', 'b'},
		{'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e'},
		{'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e'},
		{'r', 'e', 'r', 'e', 'r', 'e', 'r', 'e'},
		{'e', 'r', 'e', 'r', 'e', 'r', 'e', 'r'},
		{'r', 'e', 'r', 'e', 'r', 'e', 'r', 'e'}};
	private static final int LENGTH = 480;
	private static final int WIDTH = 556;
	private CheckerBoard cb = null;
	private static boolean newValue = false;
	private static boolean bottomPanel = false;
	private JPanel bottom = null;
	
	//main method
	public static void main(String[] args) {
		CheckerGame c = new CheckerGame();
		c.setSize(LENGTH, WIDTH);
		c.setVisible(true);
	}

	/**
	 * Creates the game
	 */
	public CheckerGame() {
		
		//Setting basics
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Checkers Game");
		
		//Creating interactive menu
		JMenuBar menu = new JMenuBar();
		JMenu game = new JMenu("Game");
		JMenuItem newgame = new JMenuItem("New");
		newgame.addActionListener(this);
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(this);
		game.add(newgame);
		game.add(exit);
		menu.add(game);
		JMenu help = new JMenu("Help");
		JMenuItem rules = new JMenuItem("Checker Game Rules");
		rules.addActionListener(this);
		JMenuItem about = new JMenuItem("About Checker Game App");
		about.addActionListener(this);
		help.add(rules);
		help.add(about);
		menu.add(help);
		setJMenuBar(menu);
		addMouseListener(this);
		
		//Creating checker board
		newGame(newValue);
		newValue = true;
		countP();
		bottomPanel = true;
	}
	
	/**
	 * Creates the bottom status panel
	 */
	public void countP() {
		
		//Replaces existing panel
		if(bottomPanel) 
			remove(bottom);
		int countB = cb.getCountB();
		int countR = cb.getCountR();
		
		//Creates the correct status bar
		JLabel pieces;
		if(countR == 0) {
			pieces = new JLabel("The black checkers team wins!");
		}
		else if(countB == 0) {
			pieces = new JLabel("The red checkers team wins!");
		}
		else if(countB == 1 && countR == 1){
			pieces = new JLabel("There is 1 red piece and 1 black piece remaining.");
		}
		else if(countB == 1){
			pieces = new JLabel("There are " + countR + " red pieces and 1 black piece remaining.");
		}
		else if(countR == 1){
			pieces = new JLabel("There is 1 red piece and " + countB + " black pieces remaining.");
		}
		else
			pieces = new JLabel("There are " + countR + " red pieces and " + countB + " black pieces remaining.");
		
		//Creates and adds panels to JFrame
		JLabel me = new JLabel("This game was developed by John Doll.");
		bottom = new JPanel();
		bottom.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		bottom.add(pieces);
		c.gridy = 1;
		bottom.add(me, c);
		add(bottom, BorderLayout.SOUTH);
		revalidate();
	}
	
	/*
	 * Creates a new game when the application is first run or if selected from the menu bar
	 */
	public void newGame(boolean newValue) {
		if(newValue)
			this.remove(cb);
		boardStatus = new char [] [] {
			{'e', 'b', 'e', 'b', 'e', 'b', 'e', 'b'},
			{'b', 'e', 'b', 'e', 'b', 'e', 'b', 'e'},
			{'e', 'b', 'e', 'b', 'e', 'b', 'e', 'b'},
			{'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e'},
			{'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e'},
			{'r', 'e', 'r', 'e', 'r', 'e', 'r', 'e'},
			{'e', 'r', 'e', 'r', 'e', 'r', 'e', 'r'},
			{'r', 'e', 'r', 'e', 'r', 'e', 'r', 'e'}};
		cb = new CheckerBoard(boardStatus);
		add(cb, BorderLayout.CENTER);
		revalidate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Operates menu bar
		if(e.getActionCommand().equals("New"))
			newGame(newValue);
		
		else if(e.getActionCommand().equals("Exit")) 
			System.exit(0);
		
		else if(e.getActionCommand().equals("Checker Game Rules")) 
			JOptionPane.showMessageDialog(null, "https://www.wikihow.com/Play-Checkers", "Checker Rules", JOptionPane.INFORMATION_MESSAGE);	
		
		else  
			JOptionPane.showMessageDialog(null, "Creator: John Doll, dolljm@miamioh.edu, Miami University", "Details", JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//Creates new status panel
		countP();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//Creates new status panel
		countP();
	}
}