import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CheckerBoard extends JPanel implements MouseListener, ComponentListener{
	private char [] [] boardStatus;
	private static boolean value;
	private static int origX;
	private static int origY;
	private static int x;
	private static int y;
	private static boolean turn;
	private static char origS;
	private int countR;
	private int countB;
	private static int jumpedToX;
	private static int jumpedToY;
	private static boolean jumpedR = false;
	private static boolean jumpedB = false;
	private static char s;
	private static int bX;
	private static int bY;

	/**
	 * Creates a new checkerboard
	 * @param boardStatus the makeup of the checkerboard
	 */
	public CheckerBoard(char [] [] boardStatus) {
		value = false;
		turn = false;
		jumpedR = false;
		jumpedB = false;
		System.out.println("New Game Beginning");
		setLayout(new GridLayout(8,8));
		setBoardStatus(boardStatus);
		addComponentListener(this);
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
					CheckerPiece piece = new CheckerPiece(i, j, boardStatus[i][j]);
					piece.addMouseListener(this);
					add(piece);
			}
		}
	}

	/**
	 * Draws everything between the menu bar and status at the bottom
	 */
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.GREEN);

		//makes board
		for(int i = 0; i < 64; i++) {
			if((i/8) % 2 == 1) {
				if((i%8) % 2 == 0)
					g2.fillRect(((i/8) * (60 + bX)), (i%8) * (60 + bY), 60 + bX, 60 + bY);
			}
			else if((i/8)%2 == 0) {
				if((i%8)%2 == 1)
					g2.fillRect(((i/8) * (60 + bX)), (i%8) * (60 + bY), 60 + bX, 60  + bY);
			}
		}
		
		//Colors validated selected piece
		if(value) {
			g2.setColor(Color.PINK);
			g2.fillRect(origX * (60 + bX), origY * 60  + origY * bY, 60 + bX, 60 + bY);
		}

		//makes pieces on board
		for(int i = 0; i < 64; i++) {
			if((i/8) % 2 == 1) {
				if((i%8) % 2 == 0) {
					if(boardStatus[i/8][i%8] == 'r' || boardStatus[i/8][i%8] == 'c') {
						g2.setColor(Color.RED);
						g2.fillOval((i%8) * (60 + bX) + 10, (i/8) * (60 + bY) + 10, 40 + bX, 40 + bY);
					}
					else if(boardStatus[i/8][i%8] == 'b' || boardStatus[i/8][i%8] == 'k') {
						g2.setColor(Color.BLACK);
						g2.fillOval((i%8) * (60 + bX) + 10, (i/8) * (60 + bY) + 10, 40 + bX, 40 + bY);
					}
					if(boardStatus[i/8][i%8] == 'k' || boardStatus[i/8][i%8] == 'c') {
						g2.setColor(Color.YELLOW);
						g2.fillOval((i%8) * (60 + bX) + 20, (i/8) * (60 + bY) + 20, 20 + bX, 20 + bY);
					}
				}
			}
			else if((i/8)%2 == 0) {
				if((i%8)%2 == 1) {
					if(boardStatus[i/8][i%8] == 'r' || boardStatus[i/8][i%8] == 'c') {
						g2.setColor(Color.RED);
						g2.fillOval((i%8) * (60 + bX) + 10, (i/8) * (60 + bY) + 10, 40 + bX, 40 + bY);
					}
					else if(boardStatus[i/8][i%8] == 'b' || boardStatus[i/8][i%8] == 'k') {
						g2.setColor(Color.BLACK);
						g2.fillOval((i%8) * (60 + bX) + 10, (i/8) * (60 + bY) + 10, 40 + bX, 40 + bY);
					}
					if(boardStatus[i/8][i%8] == 'k' || boardStatus[i/8][i%8] == 'c') {
						g2.setColor(Color.YELLOW);
						g2.fillOval((i%8) * (60 + bX) + 20, (i/8) * (60 + bY) + 20, 20 + bX, 20 + bY);
					}
				}
			}
		}
	}

	/**
	 * Sets the characters in the array to the correct values and counts them up to determine how many pieces each colored team has left
	 * @param boardStatus the newly assigned board
	 */
	public void setBoardStatus(char [] [] boardStatus) {
		this.boardStatus = boardStatus;
		countR = 0;
		countB = 0;
		repaint();
		for(int i = 0; i < 64; i++) {
			if(boardStatus[i/8][i%8] == 'r' || boardStatus[i/8][i%8] == 'c')
				countR++;
			else if(boardStatus[i/8][i%8] == 'b' || boardStatus[i/8][i%8] == 'k')
				countB++;
		}
		if(countR == 0)
			JOptionPane.showMessageDialog(null, "Black Team Wins!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
		else if(countB == 0)
			JOptionPane.showMessageDialog(null, "Red Team Wins!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
		repaint();
	}

	//Does most of the heavy work, determines what pieces are moving where
	@Override
	public void mouseClicked(MouseEvent e) {
		if(!value) {

			//Gets original piece info
			origX = (int) (e.getComponent().getLocation().getX() / e.getComponent().getWidth());
			origY = (int) (e.getComponent().getLocation().getY() / e.getComponent().getHeight());
			origS = boardStatus[origY][origX];
				
			//Checks that the piece selection is valid
			if((!turn && origS == 'b') || (!turn && origS == 'k') || (turn && origS == 'r') || (turn && origS == 'c') || (jumpedR && (origS == 'r' || origS == 'c') && origX == jumpedToX && origY == jumpedToY) || (jumpedB && origX == jumpedToX && origY == jumpedToY && (origS == 'b' || origS == 'k')))
				value = true;
			repaint();
		}

		//Moves or assigns new piece to be moved
		else {
			x = (int) (e.getComponent().getLocation().getX() / e.getComponent().getWidth());
			y = (int) (e.getComponent().getLocation().getY() / e.getComponent().getHeight());
			s = boardStatus[y][x];

			//Switching the piece to be moved if applicable
			if(((boardStatus[y][x] == origS && !jumpedB && !jumpedR) || (boardStatus[y][x] == 'b' && origS == 'k' && !jumpedB) || (boardStatus[y][x] == 'k' && origS == 'b' && !jumpedB) || (boardStatus[y][x] == 'c' && origS == 'r' && !jumpedR) || (boardStatus[y][x] == 'r' && origS == 'c' && !jumpedR) || (jumpedB && turn && ((s == 'r' || s == 'c' ) || (x == jumpedToX && y == jumpedToY))) || (jumpedR && !turn && ((s == 'b' || s == 'k' ) || (x == jumpedToX && y == jumpedToY))))) {
				origX = x;
				origY = y;
				origS = boardStatus[origY][origX];
				value = false;
				repaint();
				value = true;
			}

			//Checking that move goes to empty location
			else if(boardStatus[y][x] == 'e') {
					
				//Checking valid direction, kings any diagonal direction
				if((origS == 'r' && y < origY) || (origS == 'b' && y > origY) || (origS == 'k') || (origS == 'c')) {
				
					//Seeing if specified one square move is allowed
					if(((Math.abs(y-origY) == 1 && Math.abs(x-origX) == 1 && (origS == 'r' || origS == 'c') && !jumpedR)) || ((Math.abs(y-origY) == 1 && Math.abs(x-origX) == 1 && (origS == 'b' || origS == 'k') && !jumpedB))) {
						
						//Turns off jumps
						if(jumpedR || jumpedB) {
							jumpedR = false;
							jumpedB = false;
						}
						
						//Checks to see if is now king piece
						if(y == 0 && origS == 'r') {
							origS = 'c';
							System.out.println("Red is now a king!");
						}
						else if(y == 7 && origS == 'b') {
							origS = 'k';
							System.out.println("Black is now a king!");
						}

						//Updating board
						boardStatus[y][x] = origS;
						boardStatus[origY][origX] = 'e';
						setBoardStatus(boardStatus);
						
						//Resetting move
						value = false;

						//Switches turns
						if(turn) {
							turn = false;
							System.out.println("Red moved one space, Black's turn now.");
						}
						else {
							turn = true;
						    System.out.println("Black moved one space, Red's turn now.");
						}
					}
					
					//Seeing if jump is allowed with specified piece
					else if((Math.abs(y-origY) == 2 && Math.abs(x-origX) == 2 && origS == 'b' && (boardStatus[(y + origY)/2] [(x + origX)/2] == 'r' || boardStatus[(y + origY)/2] [(x + origX)/2] == 'c')) || (Math.abs(y-origY) == 2 && Math.abs(x-origX) == 2 &&  origS == 'r' && ((boardStatus[(y + origY)/2] [(x + origX)/2] == 'b') || boardStatus[(y + origY)/2] [(x + origX)/2] == 'k')) || (Math.abs(y-origY) == 2 && Math.abs(x-origX) == 2 &&  origS == 'k' && (boardStatus[(y + origY)/2] [(x + origX)/2] == 'r' || boardStatus[(y + origY)/2] [(x + origX)/2] == 'c')) || (Math.abs(y-origY) == 2 && Math.abs(x-origX) == 2 &&  origS == 'c' && (boardStatus[(y + origY)/2] [(x + origX)/2] == 'b' || boardStatus[(y + origY)/2] [(x + origX)/2] == 'k')) && (x-origX != 0) ) {
						
						//Checks to see if is now king piece
						if(y == 0 && origS == 'r') {
							origS = 'c';
							System.out.println("Red is now a king!");
						}
						else if(y == 7 && origS == 'b') {
							origS = 'k';
							System.out.println("Black is now a king!");
						}
						
						//Updating board
						boardStatus[y][x] = origS;//
						boardStatus[origY][origX] = 'e';
						boardStatus[(y + origY)/2] [(x + origX)/2] = 'e';
						setBoardStatus(boardStatus);
						
						//Resetting move
						value = false;

						//Setting jumped to coordinates
						jumpedToX = x;
						jumpedToY = y;
						
						//If double jump, sets turn to correct color
						if((origS == 'r' || origS == 'c') && jumpedR) {
							turn = true;
						}
						else if((origS == 'b' || origS == 'k') && jumpedB) {
							turn = false;
						}
						
						//Sets correct jumped variable to true
						if(origS == 'r' || origS == 'c') {
							jumpedR = true;
							jumpedB = false;
						}
						else if(origS == 'b' || origS == 'k') {
							jumpedB = true;
							jumpedR = false;
						}

						//Prints out who jumped who and how many pieces remain
						if(jumpedR)
							if(countB != 1)
								System.out.println("Red jumped black! There are now " + countB + " black pieces left.");
							else
								System.out.println("Red jumped black! There is just 1 black piece left.");
						else
							if(countR != 1)
								System.out.println("Black jumped red! There are now " + countR + " red pieces left.");
							else
								System.out.println("Black jumped red! There is just 1 red piece left.");
						
						//Switches turns
						if(turn)
							turn = false;
						else
							turn = true;
					}
					//Checks move
					else
						System.out.println("Not a valid move.");
				}
				
				//Checks horizontal move
				else
					System.out.println("Invalid direction, red moves up and black moves down.");
			}
			
			//Checks pieces going the right way
			else
				System.out.println("Must move diagonally!");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	public int getCountR() {
		return countR;
	}
	
	public int getCountB() {
		return countB;
	}

	@Override
	public void componentResized(ComponentEvent e) {
		bX = (Integer.parseInt(Integer.toString(this.getWidth())) - 480)/8;
		bY = (Integer.parseInt(Integer.toString(this.getHeight())) - 480)/8;
		repaint();
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		
	}
}