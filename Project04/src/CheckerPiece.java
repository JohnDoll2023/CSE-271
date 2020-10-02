import javax.swing.JComponent;

public class CheckerPiece extends JComponent{
	private char status;
	private int row;
	private int column;
	
	/**
	 * Creates checker piece object
	 * @param row the row of the checker piece
	 * @param column the column of the checker piece
	 * @param status the status of the checker piece
	 */
	public CheckerPiece(int row, int column, char status) {
		this.row = row;
		this.column = column;
		this.status = status;
	}
}